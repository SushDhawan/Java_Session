package com.sush.tablehierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration con = new Configuration().configure()
        		.addAnnotatedClass(MyEmployee.class)
        		.addAnnotatedClass(Regular_Employee.class)
        		.addAnnotatedClass(Contract_Employee.class);
        
		/*
		 * ServiceRegistry reg = (ServiceRegistry) new ServiceRegistryBuilder()
		 * .applySettings(con.getProperties()) ;
		 */
        
        SessionFactory sf =  con.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        MyEmployee e1 = new MyEmployee();
        e1.setName("Mahesh ");
        
        
        Regular_Employee re1 = new Regular_Employee();
        re1.setName("Rakshit");
        re1.setSalary(60000);
        re1.setIncentive(6000);
        
        Contract_Employee ce1 = new Contract_Employee();
        ce1.setName("Chintan Sharma");
        ce1.setContract_duration("30 Hrs");
        ce1.setPay_per_hr(850);
        
        
        session.save(ce1);
        session.save(re1);
        session.save(e1);
        
        tx.commit();
       
        session.close();
        
        
    }
}
