package Lecture09_Functions;

import java.util.Scanner;

public class f5 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        int a =10;
        changeval(a);
        System.out.println(a); //20
    }
    public static void changeval(int a){
        System.out.println(a); //10
        a+=5;
        System.out.println(a); // 15
        a+=5;
        System.out.println(a); //20
    }
}
