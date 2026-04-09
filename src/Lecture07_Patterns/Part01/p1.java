package Lecture07_Patterns.Part01;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****");

        Scanner sc = new Scanner(System.in);

        //loops
        // for loop
        // 2 for loop -> 1. row 2. column
        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
