package Lecture05.Operators;

import java.util.Scanner;

public class q2_input_and_check_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        // even- > divible by 2
        // odd -> divible by 2 ☠️

        if(num %2 == 0) System.out.println(num+ " is an even number");
        else System.out.println(num+ " is an odd number");
    }
}
