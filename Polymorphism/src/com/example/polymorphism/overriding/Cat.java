package com.example.polymorphism.overriding;
//method overriding - runtime
public class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Meow Meow");
    }
}
