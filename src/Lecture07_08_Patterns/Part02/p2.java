package Lecture07_08_Patterns.Part02;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        // 0-1 Triangle

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                if((i+j)%2==0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
