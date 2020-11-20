// AUTHOR: LINA SANCHEZ
// DATE: 19/10/2020
// DESCRIPTION: this program create a method that returns the first letter of a word entered as a paremeter

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        f_menu();
        System.out.println("Input the word");
        String word = keyboard.nextLine();
        while (word.length() < 5) {
            System.out.println("ERROR: your word should have at least five (5). Input again your word");
            word = keyboard.nextLine();
        }
        f_first_letter(word);
    }
        public static void f_menu (){
            System.out.println("--------------------------------------");
            System.out.println("-------------FIRST LETTER-------------");
            System.out.println("-------------------------------------" );
            System.out.println("----- version: 1.0 / 19/10/2020-------");
            System.out.println("-----------By Lina Sanchez------------");
            System.out.println("--------------------------------------");
        }

        public static void f_first_letter (String word){
            String first_letter= word.substring(0,1);
            System.out.println("the first letter is:"+first_letter);
        }


}
