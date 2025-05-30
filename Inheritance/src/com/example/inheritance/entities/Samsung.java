package com.example.inheritance.entities;

public class Samsung extends Phone{
    String OS = "Android";

    public Samsung(String colour, String model, String OS) {
        super(colour, model);
        this.OS = OS;
    }

    public void checkOS(){
        System.out.println(OS);
    }
}
