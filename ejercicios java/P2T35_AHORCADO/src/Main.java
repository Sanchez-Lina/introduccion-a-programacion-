//AUTHOR: LINA SANCHEZ
// DATE: 10/11/2020
// DESCRIPTION: este programa consiste en crear un sistema donde se tiene que
//.............adivinar algunas palabras con un numero de intentos

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);
        f_menu();
        String v_opt_user = f_option_user();
        String[] v_vector_words = f_fill_vector(v_opt_user);

        char v_letter_user;
        int v_random = (int) (Math.random() * 9);
        String v_word_guess = v_vector_words[v_random];
        int v_failed_attempts = 0;
        int v_total_vacios = 0;
        char[] v_vector_word_guess = new char[v_word_guess.length()];

        System.out.println("The word to guess is:\n");
        for (int i = 0; i < v_word_guess.length(); i++) {
            System.out.print(" _ ");
            v_vector_word_guess[i] = '_';
        }
        do {
            System.out.println("\nInput a letter:");
            v_letter_user = keyboard.next().charAt(0);
            if (v_word_guess.indexOf(v_letter_user) > -1) {
                v_vector_word_guess = f_find_letter_to_word(v_letter_user, v_word_guess, v_vector_word_guess);
            } else {
                v_failed_attempts += 1;
                System.out.println("Err: This letter don't exist into the word (failed attemps " + v_failed_attempts + "/4)");
            }
            for (int i = 0; i < v_word_guess.length(); i++) {
                System.out.print(" " + v_vector_word_guess[i] + " ");
            }
            v_total_vacios = 0;
            for (int i = 0; i < v_word_guess.length(); i++) {
                if (Character.compare(v_vector_word_guess[i], '_') == 0) {
                    v_total_vacios += 1;
                }
            }

        } while (v_failed_attempts < 4 && v_total_vacios > 0);
        if (v_total_vacios == 0) {
            System.out.println("\n!you are the best in the word¡");
        } else {
            System.out.println("\n!sorry, you lost¡, the word was: " + v_word_guess);
        }
    }

    public static void f_menu() {
        System.out.println("--------------------------------------");
        System.out.println("----------------WORDS-----------------");
        System.out.println("--------------------------------------");
        System.out.println("----- version: 1.0 / 10/11/2020-------");
        System.out.println("-----------By Lina Sanchez------------");
        System.out.println("--------------------------------------");
    }

    public static String f_option_user() {
        //description: this method return a char (Y/N)
        Scanner keyboard = new Scanner(System.in);
        System.out.println("do you want to enter the words (Y/N)?");
        String v_option = keyboard.nextLine();
        while (!v_option.equalsIgnoreCase("N") && !v_option.equalsIgnoreCase("Y")) {
            System.out.println("Err: your option don't exist, do you want to enter the words (Y/N)?");
            v_option = keyboard.nextLine();
        }
        return v_option;
    }

    public static String f_word_user(int i) {
        //description: this method returns a word with a least 4 letters
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the [" + i + "] word:");
        String v_word = keyboard.nextLine();
        while (v_word.length() < 4) {
            System.out.println("Err: The word should be have leats 4 letters, Input again the [" + i + "] word:");
            v_word = keyboard.nextLine();
        }
        return v_word;
    }

    public static String[] f_fill_vector(String v_opt_user) {
        //description: this method returns a string vector with 10 words.

        String[] v_vector_words = new String[10];
        Scanner keyboard = new Scanner(System.in);

        if (v_opt_user.equalsIgnoreCase("Y")) { //input 10 words by keyboard
            for (int i = 0; i < 10; i++) {
                v_vector_words[i] = f_word_user(i);
            }
        } else {  // database
            v_vector_words[0] = "casa";
            v_vector_words[1] = "mascota";
            v_vector_words[2] = "universidad";
            v_vector_words[3] = "colombia";
            v_vector_words[4] = "telefono";
            v_vector_words[5] = "windows";
            v_vector_words[6] = "libreria";
            v_vector_words[7] = "computador";
            v_vector_words[8] = "java";
            v_vector_words[9] = "programacion";
        }
        return v_vector_words;
    }

    public static char[] f_find_letter_to_word(char v_letter, String v_word, char[] v_vector_word_guess) {
        //description: this method return a word that find a letter
        int pos_letter = v_word.indexOf(v_letter);     //busca desde la posición 0
        while (pos_letter <= v_word.length() - 1 && pos_letter > -1) {
            v_vector_word_guess[pos_letter] = v_letter;
            pos_letter = v_word.indexOf(v_letter, pos_letter + 1);
        }
        return v_vector_word_guess;
    }
}