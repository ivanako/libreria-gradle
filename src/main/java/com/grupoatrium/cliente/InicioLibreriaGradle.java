package com.grupoatrium.cliente;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.grupoatrium.config.LibreriaConfig;
import com.grupoatrium.modelo.Autor;
import com.grupoatrium.modelo.Editorial;
import com.grupoatrium.persistencia.impl.EditorialesDAO;
import com.grupoatrium.persistencia.impl.LibrosDAO;

public class InicioLibreriaGradle {

	public static void main(String[] args) {
		System.out.println("Inicio Librería Gradle");
		
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(LibreriaConfig.class);
		
		Autor aut1 = appContext.getBean("aut1", Autor.class);
		System.out.println(aut1.toString());
		
		Autor aut2 = appContext.getBean("aut2", Autor.class);
		System.out.println(aut2.toString());
		
		
		Editorial edit1 = appContext.getBean("editorial1", Editorial.class);
		System.out.println(edit1.toString());
		
		Editorial edit2 = appContext.getBean("editorial2", Editorial.class);
		System.out.println(edit2.toString());
		
		// Beans anotados como Component
		LibrosDAO libDao1 = appContext.getBean("libroDao", LibrosDAO.class);
		System.out.println(libDao1.toString());
		
		EditorialesDAO editDao1 = appContext.getBean("editorialDao", EditorialesDAO.class);
		System.out.println(editDao1.toString());
				
		appContext.close();
	}

}
