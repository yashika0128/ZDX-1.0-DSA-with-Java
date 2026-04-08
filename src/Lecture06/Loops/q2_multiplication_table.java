package Lecture06.Loops;

import java.util.Scanner;

public class q2_multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =1;
        int N = sc.nextInt();
        while(a<=10){
            System.out.println(N+ "*" + a + "="+N*a);
            a++;
        }
    }
}
