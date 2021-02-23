package com.company;

import java.util.Scanner;

public class OptionalOne {

    public static void main(String[] args) {
        password();
    }

    public static void password() {
        System.out.println("Please enter password: ");
        String password = scan.next();
        System.out.println(passwordValidation(password));
    }

    public static String passwordValidation(String password) {
        int digitCount = 0;
        if (password.length()>= 10) {
            for (int i = 0; i < password.length(); i++) {
                int asciiValue = (int) password.charAt(i);
                if (asciiValue >= 48 && asciiValue <= 57) {
                    digitCount++;

                } else if (!(asciiValue >= 65 && asciiValue <= 90) && !(asciiValue >= 97 && asciiValue <= 122)) {
                    return "Password is not valid, it must not contain any symbols, only digits and letters: ";
                }
            }
            if (digitCount >= 2) {
                return "Password is valid: " + password;
            } else {
                return "Password is not valid, it must not contain at least two digits: ";
            }
        } else {
            return "Password is not valid, it must not contain at least ten characters: " + password;
        }
    }

    public static Scanner scan = new Scanner(System.in);
}

