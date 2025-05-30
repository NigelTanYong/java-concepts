package com.example.inheritance.entities;

public class Phone {
    //Attributes(fields)
    String colour = "black";
    String model = "Unknown";

    //Constructor
    public Phone(String colour, String model){
        this.colour = colour;
        this.model = model;
    }

    //Methods (behaviour)
    public String checkRefreshRate (String refreshMode){
        String refreshValue = "";
        switch (refreshMode.toLowerCase()){
            case "smooth":
                refreshValue = "120Hz";
                break;
            case "standard":
                refreshValue = "60Hz";
                break;
            default:
                refreshValue = "0-120Hz";
        }
        return refreshValue;
    }

    public void checkSim (boolean simDetected){
        System.out.println((simDetected ? "SIM Detected" : "No SIM Detected!"));
    }

}
