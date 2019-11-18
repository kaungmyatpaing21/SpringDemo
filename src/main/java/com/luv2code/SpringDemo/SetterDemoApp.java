package com.luv2code.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext theContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach theCoach = theContext.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortuneService());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());
        theContext.close();
    }
}
