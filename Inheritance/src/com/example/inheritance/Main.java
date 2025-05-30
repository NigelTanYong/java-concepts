package com.example.inheritance;

import com.example.inheritance.entities.Apple;
import com.example.inheritance.entities.Phone;
import com.example.inheritance.entities.Samsung;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String menuControl = "start";
        while (!menuControl.equalsIgnoreCase("stop")){
            System.out.println("Create your phone: ");
            System.out.println("Enter Brand (Apple/Samsung):");
            String brand = sc.nextLine();
            if(brand.equalsIgnoreCase( "Apple")){
                Apple iPhone = new Apple("Natural Titanium", "16 Pro Max", "iOS");
                System.out.print("Your OS is:" );
                iPhone.checkOS();
                System.out.println(iPhone.checkRefreshRate("Smooth"));
                iPhone.checkSim(true);
            }
            else if(brand.equalsIgnoreCase("Samsung")){
                Samsung galaxy = new Samsung("Titanium Silver", "S25", "Android");
                System.out.println("Your OS is: ");
                galaxy.checkOS();
                System.out.println(galaxy.checkRefreshRate("Auto"));
                galaxy.checkSim(false);
            }
            else{
                System.out.println("Invalid option, try again...");
            }

            System.out.println("Type stop to stop running: ");
            menuControl = sc.nextLine();
        }
    }
}
