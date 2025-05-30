package com.example.encapsulation;

import com.example.encapsulation.entity.Person;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Alice", "Ben", "James"};
        int[] ages = {10, 50, 90};
        Person p0 = new Person(); //using the empty argument constructor
        System.out.printf("Default person: %s\n", p0.getName());
        p0.setAge(1);
        System.out.printf("new age: %d",p0.getAge());

        for (int i = 0; i < names.length; i++) {
            Person p = new Person(names[i], ages[i]);
            System.out.print("id: ");

            System.out.printf("Name: %s, Age: %d\n", p.getName(), p.getAge());
            p.checkIdInfo(names[i], ages[i]);
        }
    }

}
