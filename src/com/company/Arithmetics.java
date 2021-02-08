package com.company;

import java.util.Scanner;

//Task 4
public class Arithmetics {

    int briaunuKiekis = 12;

    public void task4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter cube's edge length: ");
        int briaunosIlgis = scanner.nextInt(); //next; nextFloat()

        System.out.println("Cube's volume: " + (briaunosIlgis * briaunosIlgis * briaunosIlgis));
        System.out.println("Cube’s perimeter: " + (briaunosIlgis * briaunuKiekis));
// Run in Main.java

    }

//Task 5
    public void task5(double x, double y) {

        float inch = 2.54f;
        int foot = 12;

        System.out.println( x + " feet and " + y + " inches = " + (x * foot * inch + y * inch));
// Run in Main.java
    }

}
