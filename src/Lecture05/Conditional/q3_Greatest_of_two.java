package Lecture05.Conditional;

import java.util.Scanner;

public class q3_Greatest_of_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b= sc.nextInt();

        if (a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}
