package Lecture06.Loops;

import java.util.Scanner;

public class q1_print_1_to_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            System.out.println(i);
        }

    }
}
