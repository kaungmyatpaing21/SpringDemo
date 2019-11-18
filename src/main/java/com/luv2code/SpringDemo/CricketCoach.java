package com.luv2code.SpringDemo;

public class CricketCoach implements Coach {

    FortuneService fortuneService;

    public CricketCoach(){
        System.out.println("inside the no-arg constructor.");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }

    @Override
    public String getFortuneService() {
        return fortuneService.getFortuneService();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("inside setFortuneService setter method.");
        this.fortuneService = fortuneService;
    }
}
