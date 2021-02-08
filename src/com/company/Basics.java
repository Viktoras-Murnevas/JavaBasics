package com.company;

import java.util.Scanner;

// Task 1
public class Basics {

    String name;
    String surname;
    int age;

    public void helloItAcademy() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = scanner.nextLine(); //next; nextFloat()
        System.out.print("Please enter your surname: ");
        surname = scanner.nextLine();
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();

        System.out.println("Hello I am " + name + " " + surname + ". I am attending IT Academy 2021!");
// Run in Main.java
    }


// Task 2
    char    a = 'H';
    int     b = 311;
    byte    c = 0;
    String  d = "w0r1d";
    float   e = 2.0f;
    boolean isTrue = true;

    public void helloWorld() {

        System.out.println(String.valueOf(a) + b + c + " " + d + " " + e + " " + isTrue);
// Run in Main.java
    }


//Task 3
    public void task3(int x, int y) {

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("x + y: " + (x + y) );
        System.out.println("x - y: " + (x - y) );
        System.out.println("x * y: " + (x * y) );
        System.out.println("x / y: " + Math.ceil(x) / Math.ceil(y));
        System.out.println("Max: " + Math.max(x, y));
        System.out.println("Min: " + Math.min(x, y));
        System.out.println("Abs: " + Math.abs(x - y));

// Run in Main.java
    }

}