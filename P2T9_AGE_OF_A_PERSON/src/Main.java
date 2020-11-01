// AUTOR: LINA SANCHEZ
// DATE: 6/10/2020
// DESCRIPTION: This program show the age of a person

import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("-------------------------------------");
        System.out.println("P2T9:AGE OF A PERSON. By Lina Sanchez");
        System.out.println("-------------------------------------");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Input the year birth:");

        int YEAR = teclado.nextInt();

        if (YEAR >= 2020) {
            System.err.print("ERROR: This year can't process, you should input a year less than 2020");
        } else {
            int AGE = 2020 - YEAR;
            if (AGE >= 18){
                System.out.println(" she/ he is a adult");
            }else{
                System.out.println("she/he is a kit");
            }

        }
    }
}
