package Lecture09_Functions;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class f2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();

        print_name(name);
    }

    public static void print_name(String name){
        System.out.println("Hey "+ name);
    }
}
