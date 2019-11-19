package com.luv2code.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext theContext = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        Coach theCoach = theContext.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        theContext.close();
    }
}
