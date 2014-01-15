package com.hysec.cas.dashboard.ssh2;

import java.util.ArrayList;
import java.util.List;

public class ServerConfig {
	
	private String id;
	private String name;
	private String hostname;
	private String username;
	private String password;
	private ArrayList<Cmd> list;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void addCmds(List<Cmd> cmds){
		if(list == null)
			list = new ArrayList<Cmd>();
		list.addAll(cmds);
	}
	
	public List<Cmd> getCmds(){
		return list;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHostname() {
		return hostname;
	}


	public void setHostname(String hostname) {
		this.hostname = hostname;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}
