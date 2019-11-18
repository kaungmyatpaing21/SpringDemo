package com.luv2code.SpringDemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach(){
        System.out.println("inside the no-arg constructor.");
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("inside email setter method.");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("inside team setter method.");
        this.team = team;
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
