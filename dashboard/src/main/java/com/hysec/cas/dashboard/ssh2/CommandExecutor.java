package com.hysec.cas.dashboard.ssh2;

import java.io.File;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;

public class CommandExecutor {
	
	private final static String ACTIONPATH="ServerConfig.xml";

	private static List<ServerConfig> configs;

	public static List<ServerConfig> getConfigs() throws DocumentException, URISyntaxException {
		
		if(configs != null){
			return configs;
		}
		
		configs = new ArrayList<ServerConfig>();

		ServerConfig sc = new ServerConfig();
		String path = sc.getClass().getClassLoader().getResource("").toURI().getPath();
		path = path.split("classes")[0]+File.separatorChar+"classes"+File.separatorChar;

		SAXReader reader = new SAXReader();
		Document document = reader.read(new File(path+ACTIONPATH));

		Element root = document.getRootElement();
		@SuppressWarnings("unchecked")
		List<Element> serverList = (List<Element>) root.elements("Server");
		for (Element server : serverList) {
			ServerConfig conf = new ServerConfig();
			conf.setId(server.elementText("id"));
			conf.setName(server.elementText("name"));
			conf.setHostname(server.elementText("hostname"));
			conf.setPassword(server.elementText("password"));
			conf.setUsername(server.elementText("username"));

			@SuppressWarnings("unchecked")
			List<Element> cmdList = (List<Element>) server.element("commands")
					.elements("cmd");
			List<Cmd> cList = new ArrayList<Cmd>();
			for (Element cmd : cmdList) {
				Cmd c = new Cmd();
				c.setId(cmd.elementText("id"));
				c.setDescription(cmd.elementText("description"));
				c.setName(cmd.elementText("name"));
				c.setValue(cmd.elementText("value"));
				cList.add(c);
			}
			
			conf.addCmds(cList);
			configs.add(conf);
		}
		
		return configs;
	}

	public static String exec(ServerConfig config) {
		
		StringBuilder buf = new StringBuilder();
		try {

			final ServerConfig conf = config;

			JSch jsch = new JSch();

			Session session = jsch.getSession(conf.getUsername(),
					config.getHostname(), 22);

			UserInfo ui = new UserInfo() {

				public String getPassphrase() {
					return null;
				}

				public String getPassword() {
					return conf.getPassword();
				}

				public boolean promptPassphrase(String message) {
					return true;
				}

				public boolean promptPassword(String message) {
					return true;
				}

				public boolean promptYesNo(String message) {
					return true;
				}

				public void showMessage(String message) {

				}

			};
			session.setUserInfo(ui);
			session.connect();

			String command = conf.getCmds().get(0).getValue();

			Channel channel = session.openChannel("exec");
			((ChannelExec) channel).setCommand(command);

			channel.setInputStream(null);

			((ChannelExec) channel).setErrStream(System.err);

			InputStream in = channel.getInputStream();

			channel.connect();

			byte[] tmp = new byte[1024];
			
			while (true) {
				while (in.available() > 0) {
					int i = in.read(tmp, 0, 1024);
					if (i < 0)
						break;

					int start = 0;
					for(int n=0;n<i;n++){				
						if(tmp[n]==10){
							buf.append(new String(tmp,start,(n-start)));
							buf.append("<br>");
							start = n;
						}	
					}
					
					if(start==0){
						buf.append(new String(tmp,start,i));
					}
					
				}

				if (channel.isClosed()) {
					System.out.println("exit-status: "
							+ channel.getExitStatus());
					break;
				}

				try {
					Thread.sleep(1000);
				} catch (Exception ee) {}
			}
			channel.disconnect();
			session.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return buf.toString();
	}
	
public static String exec(String host, String username, String password, Cmd cmd) {
		
		StringBuilder buf = new StringBuilder();
		try {

			final String pass = password;

			JSch jsch = new JSch();

			Session session = jsch.getSession(username,
					host, 22);

			UserInfo ui = new UserInfo() {

				public String getPassphrase() {
					return null;
				}

				public String getPassword() {
					return pass;
				}

				public boolean promptPassphrase(String message) {
					return true;
				}

				public boolean promptPassword(String message) {
					return true;
				}

				public boolean promptYesNo(String message) {
					return true;
				}

				public void showMessage(String message) {

				}

			};
			session.setUserInfo(ui);
			session.connect();

			String command = cmd.getValue();

			Channel channel = session.openChannel("exec");
			((ChannelExec) channel).setCommand(command);

			channel.setInputStream(null);

			((ChannelExec) channel).setErrStream(System.err);

			InputStream in = channel.getInputStream();

			channel.connect();

			byte[] tmp = new byte[1024];
			
			while (true) {
				while (in.available() > 0) {
					int i = in.read(tmp, 0, 1024);
					if (i < 0)
						break;

					int start = 0;
					for(int n=0;n<i;n++){				
						if(tmp[n]==10){
							buf.append(new String(tmp,start,(n-start)));
							buf.append("<br>");
							start = n;
						}	
					}
					
					if(start==0){
						buf.append(new String(tmp,start,i));
					}
					
				}

				if (channel.isClosed()) {
					System.out.println("exit-status: "
							+ channel.getExitStatus());
					break;
				}

				try {
					Thread.sleep(1000);
				} catch (Exception ee) {}
			}
			channel.disconnect();
			session.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return buf.toString();
	}

}
