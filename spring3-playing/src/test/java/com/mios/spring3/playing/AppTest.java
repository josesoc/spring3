package com.mios.spring3.playing;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mios.spring3.playing.service.MyService;


/**
 * Unit test for simple App.
 * 
 * https://spring.io/blog/2011/06/21/spring-3-1-m2-testing-with-configuration-classes-and-profiles
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-Test.xml")
public class AppTest 
{
	@Autowired
	MyService myService;
	
    @Test
    public void testApp()
    {
    	myService.insertCadena("cadena1");
        assertNotNull(myService.selectCadena());
    }
}
