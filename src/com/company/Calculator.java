package com.company;

import java.util.Scanner;

//Task 11
public class Calculator {

    public static void main(String[] args) {
        calculations();
    }

    public static void calculations() {
        System.out.println("Please enter square, rectangle or triangle.");
        String shape = scan.next().toLowerCase();
        double a = 0;
        double b = 0;
        double c = 0;
        switch (shape) {
            case "square":
                a = scan.nextDouble();
                if (a <= 0) {
                    System.out.println("The value is incorrect!");
                } else {
                    square(a); }
                continuation();
                break;

            case "rectangle":
                a = scan.nextDouble();
                b = scan.nextDouble();
                if (a <= 0 || b <=0) {
                    System.out.println("The values are incorrect!");
                } else {
                    rectangle(a, b); }
                continuation();
                break;

            case "triangle":
                a = scan.nextDouble();
                b = scan.nextDouble();
                c = scan.nextDouble();
                if ((a + b) > c && (b + c) > a && (a + c) > b) {
                    triangle(a, b, c);
                } else {
                    System.out.println("The values are incorrect!"); }
                continuation();
                break;
            }
        }

    public static Scanner scan = new Scanner(System.in);

    public static void square(double a) {
        double squareArea = a * a;
        double squarePerimeter = a * 4;
        System.out.print("Square: " + "area is " + squareArea + " perimeter is " + squarePerimeter + ".");
    }

    public static void rectangle(double a, double b) {
        double rectangleArea = a * b;
        double rectanglePerimeter = a * 2 + b * 2;
        System.out.print("Square: " + "area is " + rectangleArea + " perimeter is " + rectanglePerimeter + ".");
    }

    public static void triangle(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double triangleArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        double trianglePerimeter = a + b + c;
        System.out.print("Square: " + "area is " + triangleArea + " perimeter is " + trianglePerimeter + ".");
    }

    private static void continuation() {
        System.out.print("Would you like to continue? Yes or No ");
        switch (scan.next()) {
            case "Yes":
                calculations();
                break;
            case "No":
                System.exit(0);
        }
    }
}



