package com.core.test.CoreSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.test.bean.Test1;
import com.core.test.bean.Test2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx= new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Test1 test1=(Test1) ctx.getBean("x");
        Test2 test2= test1.getTest2();
        test2.methodTest2();
        
        Test1 test3= (Test1) ctx.getBean("x");
        Test2 test4= test3.getTest2();
        System.out.println(test1==test3);
        System.out.println(test2==test4);
    }
}
