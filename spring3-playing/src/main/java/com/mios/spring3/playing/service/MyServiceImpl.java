package com.mios.spring3.playing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mios.spring3.playing.comp.Datos;
import com.mios.spring3.playing.comp.IMyComp;

/*
 * La anotación se reconoce con la configuración App3 en applicationContext.xml
 */
@Service(value="myService")
public class MyServiceImpl implements MyService {  

	//Inyectado mediante auto-scan and @Component
	@Autowired
	Datos datos;
	
	//Inyectado desde "applicationContext.xml"
	@Autowired
	IMyComp myComp;
	
	public void insertCadena(String cadena) {
		datos.setCadena(cadena);
	}
	
	@Override
	public String selectCadena() {
		myComp.printAlgo();
		return datos.getCadena();
	}	
}
