package com.mios.spring3.playing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mios.spring3.playing.comp.Datos;

/**
 * Ejemplo1
 *
 */
public class App2 {
	private static final String CONFIG_PATH = "classpath*:applicationContext.xml";

	static ApplicationContext context;

	public void viewDatos() {
		Datos datos=(Datos)context.getBean("myDatos"); //byName
		datos.setCadena("cadena2");
		System.out.println(datos.getCadena());
	}
	
	public static void main(final String[] args) {
		context = new ClassPathXmlApplicationContext(CONFIG_PATH);
		
		App2 app = new App2();
		app.viewDatos();
	}
}
