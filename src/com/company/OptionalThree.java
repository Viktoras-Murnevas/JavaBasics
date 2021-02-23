package com.company;

import java.util.Scanner;

public class OptionalThree {

    public static void main(String[] args) {
        summation();
    }

    public static void summation() {
        System.out.println("Please enter two non-negative numbers: ");
        String x = scan.next();
        String y = scan.next();
        int sum = sumXY(x, y);
        if (sum < 0) {
            System.out.println("Numbers must be positive.");
        } else {
            System.out.println("Sum of numbers is: " + sum);
        }
    }

    private static int sumXY(String x, String y){
        int x1, y1;
        try {
            x1 = Integer.parseInt(x);
            y1 = Integer.parseInt(y);
        } catch (NumberFormatException e) {
            return -1;
        }
        if (x1 < 0 || y1 < 0) {
            return -2;
        }
        return x1 + y1;
    }

    public static Scanner scan = new Scanner(System.in);
}
