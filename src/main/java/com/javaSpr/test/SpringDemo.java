package com.javaSpr.test;


import com.javaSpr.bean.MyMathTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

    public static void main(String a[]) {
        String confFile = "applicationContext.xml";
        ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext(confFile);
        MyMathTest mathTest = (MyMathTest) context.getBean("myMathTestBean");
        System.out.println(mathTest.toString());
    }
}