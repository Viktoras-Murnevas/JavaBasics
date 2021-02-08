package com.company;

import java.util.Scanner;

public class Loops {

//Task 8
    public void task8() {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of days: ");
        int a = input.nextInt();

        int resultOne = 0;
        int resulttwo = 0;
        for (; a > 0; a--) {
            resultOne += 24;
            resulttwo += 1440;
        }
        System.out.println("There are " + resultOne + " hours or " + resulttwo + " minutes in a mentioned period.");
    }

// Task 9
    public void task9() {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of days: ");
        int a = input.nextInt();

        int hours = 0;
        int minutes = 0;
        int i = 0;
        while (i < a) {
            hours += 24;
            minutes += 1440;
            i++;
        }
        System.out.println("There are " + hours + " hours or " + minutes + " minutes in a mentioned period.");
    }

// Task 10
    public void task10() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of factorial: ");
        int a = input.nextInt();
        int previous = a;

        int tot = 1;
        while (a > 0) {
            tot *= a;
            a -= 1;
        }
        System.out.println("Factorial of number " + previous + " is " + tot + ".");
    }

}