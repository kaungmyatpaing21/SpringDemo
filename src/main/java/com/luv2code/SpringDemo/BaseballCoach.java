package com.luv2code.SpringDemo;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }
}
