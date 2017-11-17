package com.grupoatrium.persistencia.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "libroDao")
public class LibrosDAO {
	private ConnectionMgr connMgr;
	
	public LibrosDAO() { }

	
	public ConnectionMgr getConnMgr() {
		return connMgr;
	}
	@Autowired
	public void setConnMgr(ConnectionMgr connMgr) {
		this.connMgr = connMgr;
	}
	
	@Override
	public String toString() {
		StringBuilder sbLibro = new StringBuilder();
		sbLibro.append("Libro:").append(System.lineSeparator());
		sbLibro.append("Conexión: ").append(getConnMgr());
		
		return sbLibro.toString();
	}
}
