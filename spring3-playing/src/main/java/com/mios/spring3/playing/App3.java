package com.mios.spring3.playing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mios.spring3.playing.service.MyService;

/**
 * Ejemplo1
 *
 */
public class App3 {
	private static final String CONFIG_PATH = "classpath*:applicationContext.xml";

	static ApplicationContext context;
	
	public static void main(final String[] args) {
		context = new ClassPathXmlApplicationContext(CONFIG_PATH);
		
		MyService myService=(MyService)context.getBean("myService");
		myService.insertCadena("cadena3 ejemplo");
		System.out.println(myService.selectCadena());		
	}
}
