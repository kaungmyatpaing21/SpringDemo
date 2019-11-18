package com.luv2code.SpringDemo;

public class TrackCoach implements Coach{

    private FortuneService fortuneService;

    public TrackCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }

    @Override
    public String getFortuneService() {
        return "Just Do it: " + fortuneService.getFortuneService();
    }
}
