package Lecture02;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Simple Interest =( P(Principle) * R(Interest Rate) * T (Time in Years) )/100

        double P= sc.nextInt();
        double R = sc.nextInt();
        double T = sc.nextInt();

        double SI = (P*R*T)/100;

        System.out.println("Simple Interest with Principal = "+P+", Interest Rate= "+R+", and Time in Years= "+T+ " is= "+ SI);
    }
}
