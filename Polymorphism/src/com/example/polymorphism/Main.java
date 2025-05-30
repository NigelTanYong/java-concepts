package com.example.polymorphism;
import com.example.polymorphism.overloading.Calculator;
import com.example.polymorphism.overriding.Animal;
import com.example.polymorphism.overriding.Cat;
import com.example.polymorphism.overriding.Dog;


public class Main {
    public static void main(String[] args){
        //demo Method Overriding
        Animal animal = new Animal();
        animal.makeSound();
        Animal cat = new Cat();
        cat.makeSound();
        Animal dog = new Dog();
        dog.makeSound();

        //demo method overloading
        Calculator cal = new Calculator();
        System.out.println(cal.add(10,10));
        System.out.println(cal.add(10.2, 11.2));
    }
}
