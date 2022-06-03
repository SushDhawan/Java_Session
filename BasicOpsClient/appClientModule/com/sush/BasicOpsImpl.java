package com.sush;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class BasicOpsImpl {

	public static void main(String[] args) throws NamingException {
		 
		Context ctx = new InitialContext();
		
		ctx.addToEnvironment("java.naming.factory.initial","org.jnp.interfaces.Naming.ContextFactory");
		ctx.addToEnvironment("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");
		ctx.addToEnvironment("java.naming.provider.url","localhost:9990");
		
		
		OpSessionBeanRemote bean1 =  (OpSessionBeanRemote) ctx.lookup("ops1") ;
		
		System.out.println(bean1.add(12,13));
		
	}

}
