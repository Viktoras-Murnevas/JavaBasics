package com.company;

import java.util.Scanner;

public class OptionalTwo {

    public static void main(String[] args) {
        countLetters();
    }

    public static void countLetters() {
        System.out.println("Please n and infinite string: ");
        long n = scan.nextLong();
        String infiniteString = scan.next();

        letterCount(n, infiniteString);
    }

    private static void letterCount(long n, String infiniteString) {
        letterCountOccurrences(buildFullString(n, infiniteString));
    }

    private static void letterCountOccurrences(String infiniteString) {
        int countA = 0;
        for (int i = 0; i < infiniteString.length(); i++) {
            if (infiniteString.charAt(i) == 'a') {
                countA++;
            }
        }
        System.out.println(countA);
    }

    private static String buildFullString(long n, String infiniteString) {
        StringBuilder builder = new StringBuilder((int) n);
        while (builder.length() < n) {
            builder.append(infiniteString);
        }
        builder.setLength((int) n);
        return builder.toString();
    }

    public static Scanner scan = new Scanner(System.in);

}
