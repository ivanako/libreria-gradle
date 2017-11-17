package com.grupoatrium.persistencia.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "editorialDao")
public class EditorialesDAO {

	private ConnectionMgr connMgr;
	
	public EditorialesDAO() { }

	public ConnectionMgr getConnMgr() {
		return connMgr;
	}
	@Autowired
	public void setConnMgr(ConnectionMgr connMgr) {
		this.connMgr = connMgr;
	}
	
	@Override
	public String toString() {
		StringBuilder sbEditorial = new StringBuilder();
		sbEditorial.append("Editorial:").append(System.lineSeparator());
		sbEditorial.append("Conexión: ").append(getConnMgr());
		
		return sbEditorial.toString();
	}
}
