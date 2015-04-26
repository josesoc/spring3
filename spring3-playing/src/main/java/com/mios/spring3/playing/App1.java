package com.mios.spring3.playing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mios.spring3.playing.comp.Datos;

/**
 * Ejemplo1
 *
 */
public class App1 {
	private static final String CONFIG_PATH = "classpath*:applicationContext.xml";

	private static ApplicationContext context;

	public void viewDatos() {
		Datos datos=(Datos)context.getBean("datos");
		datos.setCadena("cadena1");
		System.out.println(datos.getCadena());
	}
	
	public static void main(final String[] args) {
		context = new ClassPathXmlApplicationContext(CONFIG_PATH);
		
		App1 app = new App1();
		app.viewDatos();
	}
}
