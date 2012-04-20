package com.bkat.tkd.deviceserver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        getApplicationContext();
    }
    
    public static ConfigurableApplicationContext getApplicationContext() {
        return new ClassPathXmlApplicationContext("spring-context.xml");
    }
}
