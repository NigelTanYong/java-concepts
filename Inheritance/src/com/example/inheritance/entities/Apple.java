package com.example.inheritance.entities;

public class Apple extends Phone{
    String OS = "iOS";

    public Apple(String colour, String model, String OS) {
        super(colour, model);
        this.OS = OS;
    }

    public void checkOS(){
        System.out.println(OS);
    }
}
