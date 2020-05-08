package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert variable a: ");
        double a = scan.nextDouble();
        System.out.println("Insert variable b: ");
        double b = scan.nextDouble();
        System.out.println("Insert variable c: ");
        double c = scan.nextDouble();
        double d = b * b - (4 * a * c);
        System.out.println("Delta equals: " + d);
        double m1 = (-b + (Math.sqrt(d))) / (2 * a);
        double m2 = (-b - (Math.sqrt(d))) / (2 * a);
        double m0 = -b / (2 * a);
        if (d > 0) {
            System.out.println("First root equals:  " + "\u0028" + "\u002D" + b + "\u002B" + "\u221A" + d + "\u0029" + "\u002F" + 2 * a);

            System.out.println("Second root equals: " + "\u0028" + "\u002D" + b + "\u002D" + "\u221A" + d + "\u0029" + "\u002F" + 2 * a);

        } else if (d == 0) {
            System.out.println("The only root equals: " + "\u002D" + b + "\u002F" + 2 * a);

        } else {
            System.out.println("Delta is lower than 0, quadratic equation without any roots.");
        }
    }
}

