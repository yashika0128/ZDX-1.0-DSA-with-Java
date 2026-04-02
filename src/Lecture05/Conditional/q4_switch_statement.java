package Lecture05.Conditional;

import java.util.Scanner;

public class q4_switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int button =sc.nextInt();

        switch (button){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wedn");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Saturd");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
