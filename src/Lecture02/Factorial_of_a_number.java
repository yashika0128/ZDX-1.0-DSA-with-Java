package Lecture02;

import java.util.Scanner;

public class Factorial_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();

        int factorial = 1;
        for(int i=num ; i>=1; i--){
            factorial *= i;
        }

        System.out.println("Factorial of "+ num+" is= "+factorial);
    }
}
