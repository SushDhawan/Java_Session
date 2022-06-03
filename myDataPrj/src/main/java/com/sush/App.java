package com.sush;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello everyone!");
		
				
		Configuration con = new Configuration()
				.configure().addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Laptop.class)
				.addAnnotatedClass(Skill.class);
		
		
		ServiceRegistry reg = new ServiceRegistryBuilder()
							.applySettings(con.getProperties())
							.buildServiceRegistry();
		
		
		SessionFactory sf = con.buildSessionFactory(reg);
		
		Session session = sf.openSession();
				
        session.beginTransaction();
         
       Criteria cr =session.createCriteria(Employee.class)   ;    
       
       cr.add(Restrictions.eq("id", 104));
      
       List<Employee> crList = cr.list();
        
       for(Employee e :crList) {
    	   System.out.println(e);
       }
        
	      
	   session.close();
	    
	  
	    
	}

}

