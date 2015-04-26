package com.mios.spring3.playing.comp;

import org.springframework.stereotype.Component;

/*
 * La anotación se reconoce con la configuración App3 en applicationContext.xml
 */
@Component(value="datos")
public class Datos {

	private String cadena;

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}	
}
