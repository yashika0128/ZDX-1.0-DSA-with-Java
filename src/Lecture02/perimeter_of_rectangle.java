package Lecture02;

import java.util.Scanner;

public class perimeter_of_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Perimeter of rectangle = 2 *(length +breadth);

        int length = sc.nextInt();
        int breadth = sc.nextInt();

        int perimeter = 2*(length +breadth);
        System.out.println("Perimeter of rectangle with length= "+ length+ " and breadth= "+breadth+" is: "+perimeter);
    }
}
