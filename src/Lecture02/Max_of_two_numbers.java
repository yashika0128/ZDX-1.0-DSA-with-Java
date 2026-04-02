package Lecture02;

import java.util.Scanner;

public class Max_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
//
//        if(a>b) System.out.println(a +" is greater than "+b);
//        else System.out.println(b +" is greater than "+ a);

        // Using Math.max() function -> it take only two arguments;
         int max = Math.max(a,b);
        if(max == a) System.out.println(a +" is greater than "+b);
        else System.out.println(b +" is greater than "+ a);
    }

}
