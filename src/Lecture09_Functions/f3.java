package Lecture09_Functions;

import java.util.Scanner;

public class f3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        printsum(a,b);
    }

    public static void printsum(int a, int b){
        System.out.println(a+b);
    }
}
