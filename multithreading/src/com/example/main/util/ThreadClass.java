package com.example.main.util;

public class ThreadClass extends Thread{
    private int start;
    public ThreadClass(int start) {
        this.start = start;
    }
    public void run(){
        for(int i = 0; i <= start + 1; i++){
            System.out.println(Thread.currentThread().getName() + "; " + i);
        }
    }
}

