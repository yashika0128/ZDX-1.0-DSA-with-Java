package Lecture05.Operators;

import java.util.Scanner;

public class q4_relational_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // return -> true / false
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
    }
}
