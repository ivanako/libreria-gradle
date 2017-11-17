package com.grupoatrium.persistencia.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "connMgr")
public class ConnectionMgr {

	@Value("${driver}")
	private String driver;
	@Value("${url}")
	private String url;
	@Value("${user}")
	private String user;
	@Value("${pw}")
	private String password;
	
	
	public String getDriver() {
		return driver;
	}
//	public void setDriver(String driver) {
//		this.driver = driver;
//	}
//	
	public String getUrl() {
		return url;
	}
//	public void setUrl(String url) {
//		this.url = url;
//	}
//	
	public String getUser() {
		return user;
	}
//	public void setUser(String user) {
//		this.user = user;
//	}
//	
	public String getPassword() {
		return password;
	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
	
	@Override
	public String toString() {
		StringBuilder sbConnMgr = new StringBuilder();
//		sbConnMgr.append("Connection Manager: ").append(System.lineSeparator());
		sbConnMgr.append("Driver: ").append(getDriver()).append(System.lineSeparator());
		sbConnMgr.append("Url: ").append(getUrl()).append(System.lineSeparator());
		sbConnMgr.append("User: ").append(getUser()).append(System.lineSeparator());
		sbConnMgr.append("Pwd: ").append(getPassword()).append(System.lineSeparator());
		
		return sbConnMgr.toString();
	}
}
