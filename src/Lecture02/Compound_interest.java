package Lecture02;

import java.util.Scanner;

public class Compound_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //CI = P(1+(r/n))^nt
        /*
        -> P= Principle Amount
        -> r= Annual Interest rate (5% -> 0.05)
        -> n= number of times interest compounds per year
        -> t= time in years
        */

        System.out.print("Enter Principal (P): ");
        double P = sc.nextDouble();

        System.out.print("Enter Rate of Interest (r in %): ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (t in years): ");
        double t = sc.nextDouble();

        System.out.print("Enter number of times interest is compounded per year (n): ");
        double n = sc.nextDouble();

        // Convert percentage to decimal
        r = r / 100;

        // Compound Interest Formula
        double amount = P * Math.pow((1 + r / n), n * t);

        double CI = amount - P;

        // Output
        System.out.println("Total Amount = " + amount);
        System.out.println("Compound Interest = " + CI);
    }
}
