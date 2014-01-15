package com.hysec.cas.dashboard.web.controller;

import java.net.URISyntaxException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.DocumentException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hysec.cas.dashboard.ssh2.Cmd;
import com.hysec.cas.dashboard.ssh2.CommandExecutor;
import com.hysec.cas.dashboard.ssh2.ServerConfig;


@Controller
public class SshController {
	
	private final int ROW = 4;
	
	@RequestMapping(value="ssh.html")
    public String gotoSshPage(HttpServletRequest request,HttpServletResponse response){
    	System.out.println(request.getRemoteAddr()+":request ssh.html");
    	
    	try {
    		@SuppressWarnings("rawtypes")
			List list = CommandExecutor.getConfigs();
    		int rowCount = list.size()/ROW+1;
    		request.setAttribute("configs", list);
    		request.setAttribute("rowCount", rowCount);	
		} catch (DocumentException e) {
			e.printStackTrace();
			return "error";
		} catch (URISyntaxException e) {
			e.printStackTrace();
			return "error";
		}
       
        return "ssh";
    }
	
	@RequestMapping(value="execute.html")
	public String executeCommand(@RequestParam("serverId") String serverId,@RequestParam("cmdId") String cmdId,
			HttpServletRequest request,HttpServletResponse response){
		System.out.println(request.getRemoteAddr()+":request execute.html");
		
		//TODO need authentication
		
		try {
			List<ServerConfig> list = CommandExecutor.getConfigs();
			for(ServerConfig conf:list){
				if(conf.getId().equals(serverId)){
					for(Cmd cmd:conf.getCmds()){
						if(cmd.getId().equals(cmdId)){
							String res = CommandExecutor.exec(conf.getHostname(),conf.getUsername(),conf.getPassword(),cmd);
							request.setAttribute("command", cmd.getValue());
							request.setAttribute("result", res);
							break;
						}
					}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("result", e.getMessage());
		}
		
		return "result";
	}
}
