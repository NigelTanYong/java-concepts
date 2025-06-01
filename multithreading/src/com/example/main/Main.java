package com.example.main;

import com.example.main.util.ThreadClass;

public class Main {
    public static void main (String[] args){
        ThreadClass t1 = new ThreadClass(5);
        ThreadClass t2 = new ThreadClass(100);

        t1.start();
        t2.start();
    }
}
