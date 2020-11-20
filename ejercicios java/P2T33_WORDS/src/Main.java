// AUTHORS: ESTEBAN GAONA, LINA SANCHEZ
// DATE: 5/11/2020
// DESCRIPTION:

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        f_introducction();
        String v_user_character = f_character();
        String[] v_vector_word= new String[v_user_character.length()];
        for(int i=0; i<v_user_character.length(); i++){
            v_vector_word[i]= v_user_character.substring(i,1);
            System.out.println("v_vector_word["+i+"]="+v_vector_word);
            
         }

    }
    public static void f_introducction(){
        System.out.println("--------------------------------------");
        System.out.println("-----------CHARACTER WORD-------------");
        System.out.println("--------------------------------------");
        System.out.println("----- version: 1.0 / 05/11/2020-------");
        System.out.println("-----------By Lina Sanchez------------");
        System.out.println("-----------By Esteban Gaona-----------");
        System.out.println("--------------------------------------");
    }
    public static String f_character(){
        // description: this method the character word is six
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Input the word");
        String character = keyboard.nextLine();
        while (character.length()<6){
            System.out.println(" ERROR: the word should be of six letter. Input again the word");
            character = keyboard.nextLine();
        }
        return character;
    }

}
