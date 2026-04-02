package Lecture02;

import java.util.Scanner;

public class N_numer_input_and_there_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;

        while(N-->0){
            int num  = sc.nextInt();
            sum += num;
        }

        System.out.println("Sum of all the numbers: "+ sum);

    }
}
