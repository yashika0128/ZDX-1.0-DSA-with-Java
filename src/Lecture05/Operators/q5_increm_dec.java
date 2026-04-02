package Lecture05.Operators;

import java.util.Scanner;

public class q5_increm_dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //15
        System.out.println(a);  // 15
        System.out.println(++a); // 16
        System.out.println(a++); // 16
        System.out.println(--a); // 16
        System.out.println(a--); // 16
        System.out.println(a); // 15
    }
}
