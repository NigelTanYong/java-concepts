package com.example.main;

public class Main {
    public static void main (String[] args){
        System.out.println("Main: Start");

        // Run an async task using a new thread
        Thread asyncTask = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulate 2 seconds of work
                System.out.println("Async Task: Done");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        asyncTask.start(); // Start the background thread

        System.out.println("Main: Doing other things...");

        try {
            asyncTask.join(); // Wait for the background thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main: End");
    }
}
