package com.luv2code.SpringDemo;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getFortuneService() {
        return fortuneService.getFortuneService();
    }

    public void InitYohoho(){
        System.out.println("Inside the init method InitYohoho.");
    }

    public void DestroyYayhayhay(){
        System.out.println("Inside the destroy method DestroyYayhayhay.");
    }
}
