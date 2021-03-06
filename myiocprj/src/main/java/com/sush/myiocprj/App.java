package com.sush.myiocprj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Spring!" );
        
//      Resource r = new ClassPathResource("");
        
//      @SuppressWarnings("deprecation")
//	    BeanFactory factory = new XmlBeanFactory(r) ;
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
         
  //      Employee e1 = (Employee) ctx.getBean("emp1") ;
  //      e1.show();
        
       Employee e2 = (Employee) ctx.getBean("emp2") ;
        e2.show();
     
    }
}
