//AUTHOR:LINA SANCHEZ
// DATE:15/10/2020

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        f_menu();
        int user_option = f_option();
        while (user_option != 0) {
            if (user_option == 1) {
                System.out.println("option 1");
            } else if (user_option == 2) {
                System.out.println("option 2");
            } else if (user_option == 3) {
                System.out.println("option 3");
            } else {
                System.out.println("option 4");
            }
            user_option = f_option();
        }
        System.out.println("thanks you. bye");
    }

    public static void f_menu() {
        System.out.println("-------------------------------------");
        System.out.println("---------DIFERENT CONVERSIONS--------");
        System.out.println("-------------------------------------");
        System.out.println("----- version: 2.0 / 15/10/2020------");
        System.out.println("-----------By Lina Sanchez-----------");
        System.out.println("-------------------------------------");
    }

    public static int f_option() {
        // description: this program will return the option that user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" input the option of convert:");
        System.out.println("1. miles to KM");
        System.out.println("2. KM to miles");
        System.out.println("3. Money USD to pesos CO");
        System.out.println("4. Money pesos CO to USD");
        System.out.println("o. to exit");
        int option = keyboard.nextInt();
        while (option < 0 || option > 4) {

            System.out.println("ERROR: the options should be between 0 and 4, Input again your option");
            System.out.println("3- money USD to pesos Co/n 4-money Co to USD /n 0-to exit");
            option = keyboard.nextInt();
        }
        return option;
    }

    public static void f_convertion_mi_to_km() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("----- 1. miles to KM -----");
        System.out.println("input the total miles:");
        double miles = keyboard.nextDouble();
        double km = miles / 0.621371;
        System.out.println("the" + miles + " miles convert to" + km + "km");
    }

    public static void f_calculate_km_m() {
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("----2. KM to miles----");
        System.out.println("imput the total kilometers");
        double km = keyboard1.nextDouble();
        double miles = km * 0.621371;
        System.out.println("the" + miles + "miles concert to" + km + "km");
    }

    public static void f_calculate_usd_to_pesos_co() {
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("----3. USD to colombian pesos---------");
        System.out.println("imput the total usd");
        double usd = keyboard1.nextDouble();
        double pesos = usd * 3840;
        System.out.println("the" + usd + "dollars concert to" + pesos + "colombian peoss");
    }

    public static void f_calculate_pesos_co_to_usd() {
        //DESCRIPTION:this program calculate aconvertion of pesos co to usd
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("---- 4. Colombian pesos to USD ----");
        System.out.println("imput the total colombian pesos");
        double cop = keyboard1.nextDouble();
        double usd = cop / 3840;
        System.out.println("the" + cop + "dollars concert to" + usd + "colombian peoss");

    }
}