package Patterns;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

//        for(int i = 0; i < row; i++) {
//            for(int j = 1; j <= i + 1; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        for(int i = 0; i <= row; i++) {
//            for(int j = 0; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}
