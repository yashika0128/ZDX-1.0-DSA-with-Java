package Lecture07_08_Patterns.Part02;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        // Hollow rectangle

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= col; j++) {
                if(i==1 || j==1|| i==row|| j==col) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
