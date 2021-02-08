package com.company;

import java.util.Scanner;

//Task 6
public class Operators {

    public void task6(double a, double b, double c) {

        if ((a == b) && (b == c)) {
            System.out.println("Equilateral");
        } else if ((a + b) <= c) {
            System.out.println("Not A Triangle");
        } else if ((a + c) <= b) {
            System.out.println("Not A Triangle");
        } else if ((c + b) <= a) {
            System.out.println("Not A Triangle");
        } else if ((a == b) && (a != c)) {
            System.out.println("Isosceles");
        } else if ((a == c) && (a != b)) {
            System.out.println("Isosceles");
        } else if ((c == b) && (a != b)) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
// Run in Main.java

//Task 7
    public void task7(double distance, double fuelLeft, double fuelAverages, double fuelPrice) {

        double distanceLeft = distance - (fuelLeft / fuelAverages) * 100;

        if (distanceLeft > 0)
        {
            //double fuelNeeded = distanceLeft / 100 * fuelAverages;
            double fuelNeeded = fuelAverages - fuelLeft;
            double fuelNeededPrice = fuelNeeded * fuelPrice;
            System.out.println("Destination is in " + distance + "km. The car is not able to reach it. It needs " + fuelNeeded + "L more fuel. It will cost " + fuelNeededPrice + ".");
        }
        else
        {
            //distanceLeft *= (-1);
            //fuelLeft = distanceLeft/100 * fuelAverages;
            double fuelR = fuelLeft - (distance*0.01) * fuelAverages;
            System.out.println("Destination is in " + distance + "km. The car is able to reach it. It will have " + fuelR + "L fuel left.");
        }
    }
// Run in Main.java
}