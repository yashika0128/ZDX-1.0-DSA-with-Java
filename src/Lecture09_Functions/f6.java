package Lecture09_Functions;

import java.util.Scanner;

public class f6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] =sc.nextInt();
        }

        printelem(arr,n);

        for (int num : arr){
            System.out.println(num);
        }
    }
    public static void printelem(int [] arr, int n){
        for(int i=0;i<n;i++){
            arr[i] +=2;
        }
    }
}
