package Lecture05.Conditional;

import java.util.Scanner;

public class q2_voting_elegibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age>=18)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");
    }
}
