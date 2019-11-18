package com.luv2code.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext theContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = theContext.getBean("myCricketCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortuneService());
        theContext.close();

    }
}
