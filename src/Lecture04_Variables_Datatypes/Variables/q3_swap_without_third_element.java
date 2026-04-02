package Lecture04_Variables_Datatypes.Variables;

public class q3_swap_without_third_element {
    public static void main(String[] args) {
        int a=10,b=20;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a+" "+b);
    }
}
