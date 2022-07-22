package com.demo.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring Core
 *
 */
public class App
{
    public static void main( String[] args )
    {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        
        Car obj =(Car) context.getBean("velBean",Car.class);
     // System.out.println(obj);
        obj.drive();
        
        obj.engine();
        
         
        
        // Vehicle obj = (Vehicle)context.getBean("vehicle");
         //  obj.drive();
        // Vehicle obj = new Car();
     
    }
}







