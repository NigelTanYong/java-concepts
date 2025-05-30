package com.example.abstraction;

import com.example.abstraction.abstration.Animal;
import com.example.abstraction.abstration.Dog;
import com.example.abstraction.interfacee.Duck;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.breathe();

        //for interface
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }




}
