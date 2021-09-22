package com.company;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        double a = readNumber("the first leg: ");
        checkNumberPositive(a);

        double b = readNumber("the second leg: ");
        checkNumberPositive(b);

        double square = countSquare(a, b);
        double perimeter = countPerimeter(a, b);
        printPerimeter(square);
        printSquare(perimeter);
    }

    private static double countPerimeter(double a, double b) {
        double c = Math.sqrt(a * a + b * b);
        double perimeter = (a + b + c);
        return perimeter;
    }

    private static double countSquare(double a, double b){
        double square = 0.5 * a * b;
        return square;
    }

    private static void printPerimeter(double perimeter) {
        System.out.println("The perimeter of this triangle: " + perimeter);
    }

    private static void printSquare(double square) {
        System.out.println("The square of this triangle: " + square);
    }

    private static double readNumber(String value) {
        System.out.print("Enter " + value);
        Scanner scn = new Scanner(System.in);
        return scn.nextDouble();
    }

    private static void checkNumberPositive(double num){
        if (num < 0) {
            System.out.println("Error. A number was entered incorrectly.");
            System.exit(0);
        }
    }
}

