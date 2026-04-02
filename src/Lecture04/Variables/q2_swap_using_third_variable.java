package Lecture04.Variables;

public class q2_swap_using_third_variable {
    public static void main(String[] args) {

        int a=10, b=20;
        int temp=a;
        a=b;
        b=temp;

        System.out.println(a+" "+b);
    }
}
