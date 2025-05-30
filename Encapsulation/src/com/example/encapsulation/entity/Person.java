package com.example.encapsulation.entity;

public class Person {
    private String name;
    private int age;

    public Person(){ // empty constructor
        this.name = "default";
        this.age = 0;
    }
    //Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Getter
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }


    public void checkIdInfo (String name, int age){
        generatedId(name, String.valueOf(age));
    }
    private void generatedId (String name, String age){
        System.out.println(name+age);
    }
}
