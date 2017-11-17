package com.grupoatrium.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.grupoatrium.modelo.Autor;
import com.grupoatrium.modelo.Direccion;
import com.grupoatrium.modelo.Editorial;

@Configuration
@ComponentScan(basePackages = { "com.grupoatrium.modelo", "com.grupoatrium.persistencia.impl" })
@PropertySource(value = { "classpath:data-source.properties" })
public class LibreriaConfig {

	@Bean(name = "aut1")
	public Autor autor1() {
		Autor aut1 = new Autor("Felipe");
		aut1.setComentarios("Con Java Config");
		
		return aut1;
	}
	@Bean(name = "aut2")
	public Autor autor2() {
		return new Autor("Luisito", "Española", "Con JavaConfig");
	}

	public Direccion dir1() {
		return new Direccion("Gran Vía", 110, "Madrid", 28001, "Madrid");
	}
	
	@Bean(name = "editorial1")
	public Editorial edit1() {
		return new Editorial("Editorial 1", dir1(), "A000000");
	}
	@Bean(name = "editorial2")
	public Editorial edit2() {
		Direccion dir = new Direccion("Paseo Castellana", 20, "Madrid", 28002, "Madrid");

		return new Editorial("Editorial 2", dir, "B000000");
	}
	
	
}
