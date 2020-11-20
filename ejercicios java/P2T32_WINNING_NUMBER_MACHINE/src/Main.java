// AUTHOR: LINA SANCHEZ
// DATE: 5/11/2020
// DESCRIPTION:

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code he
        Scanner keyboard = new Scanner(System.in);
        f_menu();
        int v_vector_numbers[]= f_fill_vector_numbers();
        int v_opportunity=1, v_user_numbers;
        Boolean v_win=false;
        do {
            System.out.println("Input a number between 1 and 10 ");
            v_user_numbers = keyboard.nextInt();
            for (int i = 0; i < 10; i++) {
                if (v_vector_numbers[i] == v_user_numbers) {
                    v_win = true;
                }
            }
            v_opportunity = v_opportunity + 1;

        }while (v_opportunity<4 && v_win==false);
        if (v_win==false) {
            System.out.println("SORRY, you loss 1.000.000 dollars");
        }else {
            System.out.println("congratulations, you win 1.000.000 dollars");
        }
    }
    public static void f_menu(){
        System.out.println("--------------------------------------");
        System.out.println("-----------MACHINE lOTTERY------------");
        System.out.println("--------------------------------------");
        System.out.println("----- version: 1.0 / 05/11/2020-------");
        System.out.println("-----------By Lina Sanchez------------");
        System.out.println("--------------------------------------");
    }
    public static int[] f_fill_vector_numbers(){
        int [] v_vector= new int[10];
        for (int i=0; i<10; i++){
            v_vector [i]= (int)(Math.random()*9)+1;
            System.out.println("["+i+"]="+v_vector[i]);
        }
        return v_vector;


    }
}
