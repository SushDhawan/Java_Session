package com.sush.annotiocprj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyMessageConfig.class, AnotherBean.class);
        
   //     ctx.register(AppConfig.class);
        
        
        MyMessage message1  =   ctx.getBean(MyMessage.class);
        
        message1.setMessage("Hi from annotation based bean ");
        message1.getMessage();
        
        MyMessage byeMessage  =   ctx.getBean(MyMessage.class);
        
        byeMessage.setMessage("Bye from annotation based bean ");
        byeMessage.getMessage();
        
        AnotherBean anotherBean = ctx.getBean(AnotherBean.class) ;
        anotherBean.show();
    }
}
