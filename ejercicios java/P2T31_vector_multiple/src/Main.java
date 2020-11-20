// AUTHOR: LINA SANCHEZ
// DATE: 3/11/2020
// DESCRIPTION:

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        f_menu();
        int  N_positions= f_total_positions();
        int v_fill_vector[]= (N_positions);
        
        for(int i=0;i<N_positions;i++ ){
            v_fill_vector[i]= (int) (Math.random()*(50)*1);
            if (v_fill_vector [1]==5){
                System.out.println(v_fill_vector[i]);
        }
    }
    public static void f_menu(){
        System.out.println("--------------------------------------");
        System.out.println("--------------VARIABLES---------------");
        System.out.println("--------------------------------------");
        System.out.println("----- version: 1.0 / 03/11/2020-------");
        System.out.println("-----------By Lina Sanchez------------");
        System.out.println("--------------------------------------");
    }
    public static int f_total_positions(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the total positions");
        int n_positions= keyboard.nextInt();
        while (n_positions<1 || n_positions>50){
            System.out.println("ERROR: The positions should be between 1 and 50.Input again the number");
            n_positions= keyboard.nextInt();
        }
        return n_positions;
    }
    public static int[] f_vector_positions(int N_positions){
        int[] v_vector = new int[N_positions];
        for(int i=5;i<N_positions;i++ ){
            v_vector[i]= (int) (Math.random()*(50)*1);

            }
        }
        return v_vector;


    }

}
