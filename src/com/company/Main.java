package com.company;

import java.util.Scanner;

public class Main {

    String string = "Hey";
    short aShort = 8;
    byte aByte = 2;
    int anInt = 1;
    long aLong = 22;
    float aFloat = 3;
    double aDouble = 4;
    char aChar = '&';
    boolean aBoolean = true;

    public static void main(String[] args) {

        System.out.println(metodMath(2, 3, 6, 1));
        System.out.println(task10and20(5, 7));
        isPositiveOrNegative(-12);
        System.out.println(isNegative(15));
        greetings("Макс");
        System.out.println("Введите год");
        Scanner yearUser = new Scanner(System.in);
        yearLeap(yearUser.nextInt());
        
    }

    // 3
    public static float metodMath(float a, float b, float c, float d) {

        return a * (b + (c / d));
    }

    // 4
    public static boolean task10and20(int x1, int x2) {

        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    // 5
    public static void isPositiveOrNegative(int x) {

        if (x >= 0) {
            System.out.println("Число " + x + " положительное.");
        } else {
            System.out.println("Число " + x + " отрицательное.");
        }
    }

    //6
    public static boolean isNegative(int x) {

        if (x < 0) {
            return true;
        }
        return false;
    }

    // 7
    public static void greetings(String name) {
        System.out.println(name);
    }

    // 8
    public static void yearLeap(int year) {
        String Leap = " високосный год";
        String notLeap = " не" + Leap;
        if (year % 400 == 0) {
            System.out.println(year + Leap);
        } else if (year % 100 == 0) {
            System.out.println(year + notLeap);
        } else if (year % 4 == 0) {
            System.out.println(year + Leap);
        } else {
            System.out.println(year + notLeap);
        }
    }

}
