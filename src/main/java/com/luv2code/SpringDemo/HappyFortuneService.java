package com.luv2code.SpringDemo;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortuneService(){
        return "You are lucky today.";
    }
}
