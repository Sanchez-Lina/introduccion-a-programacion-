// AUTHOR: LINA SANCHEZ
// DATE: 20/10/2020
// DESCRIPTION:

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        f_menu();
        int user_total_children= f_total_children();
        double sum_height=0, average_height;
        for (int i=1; i<=user_total_children; i=i+1){
            System.out.println("Input the height by child number"+i);
            sum_height+=f_height_child();

        }

    }
    public static void f_menu(){
        System.out.println("--------------------------------------");
        System.out.println("------------AVERAGE HEIGHT------------");
        System.out.println("-------------------------------------" );
        System.out.println("----- version: 1.0 / 20/10/2020-------");
        System.out.println("-----------By Lina Sanchez------------");
        System.out.println("--------------------------------------");
    }
    public static int f_total_children() {
        // this method will return the total children than user input by keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the total children:");
        int total_children =keyboard.nextInt();
        while (total_children<=0 || total_children> 10000){
            System.out.println("ERROR:the total children should be between 1 and 10000, input again the total children:");
            total_children= keyboard.nextInt();
        }
        return total_children;
    }
    public static int f_height_child() {
        // this method will return the height by child than user input by keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the height child (meters):");
        double height_child =keyboard.nextInt();
        while (height_child<=0.30 || height_child> 2) {
            System.out.println("ERROR:the height should be between 0.30 and 2 meters, input again the total children:");
            height_child = keyboard.nextDouble();
        }
    }
        return height_child
}
