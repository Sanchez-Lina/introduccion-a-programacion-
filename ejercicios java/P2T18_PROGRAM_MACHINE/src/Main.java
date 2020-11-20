// AUTHOR: LINA SANCHEZ
// DATE: 19/10/2020
// DESCRIPTION: Este programa maneja el funcinamiento de una cafetera, y muestra el
// .............tiempo en que tardara en salir el pedido.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        public static void f_menu(){
            System.out.println("------------------------------------" );
            System.out.println("-------------CALCULATING-------------");
            System.out.println("------------------------------------" );
            System.out.println("----- version: 1.0 / 18/10/2020------");
            System.out.println("-----------By Lina Sanchez-----------");
            System.out.println("-------------------------------------");
        }
    public static int f_option(){

            Scanner keyboard = new Scanner(System.in);
            int option = 0;
            do {
                System.out.println("----------------OPTION'S DRINK-----------------");
                System.out.println("1. Aromatic:...............unit value $1.300---");
                System.out.println("2. black cofee:............unit value $1.000---");
                System.out.println("3. coffe whit milk :.......unit value $1.900---");
                System.out.println("4: cappuccino:.............unit value $2.500---");
                System.out.println("5: Mochaccino:.............unit value $2.700---");
                System.out.println("-----------------------------------------------");
                System.out.println("Input your option");

                option = keyboard.nextInt();

            } while (option < 1 || option > 5);
            return option;
        }
        public static int f_money(){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("input the money");

            int money= keyboard.nextInt();
            while(money!=100 && money!=200 && money!=500 && money!=1000 && money!=2000 && money!=5000 ){
                System.out.println("ERROR:your money is unknow");
                money= keyboard.nextInt();
            }
            return money;
        }
        public static void f_aromatic(){
            int price=1300;
            int money_user=f_money();
            while(money_user<price){
                System.out.println("you do need input"+(price-money_user)+"money");
                money_user+=f_money();
            }
            int surplus = money_user- price;
            System.out.println("your surplus is "+surplus+"the aromatic has time finish 30 seg");
        }
        public static void f_black_coffee(){
            int price=1000;
            int money_user=f_money();
            while(money_user<price){
                System.out.println("you do need input"+(price-money_user)+"money");
                money_user+=f_money();
            }
            int surplus = money_user- price;
            System.out.println("your surplus is "+surplus+"the black coffee has time finish 30 seg");
        }
        public static void f_coffee_whit_milk(){
            int price=1900;
            int money_user=f_money();
            while(money_user<price){
                System.out.println("you do need input"+(price-money_user)+"money");
                money_user+=f_money();
            }
            int surplus = money_user- price;
            System.out.println("your surplus is "+surplus+"the coffee whit milk has time finish 45 seg");
        }
        public static void f_capuccino(){
            int price=2500;
            int money_user=f_money();
            while(money_user<price){
                System.out.println("you do need input"+(price-money_user)+"money");
                money_user+=f_money();
            }
            int surplus = money_user- price;
            System.out.println("your surplus is "+surplus+"the capuccino has time finish 60 seg");
        }
        public static void f_mochaccino(){
            int price=2700;
            int money_user=f_money();
            while(money_user<price){
                System.out.println("you do need input"+(price-money_user)+"money");
                money_user+=f_money();
            }
            int surplus = money_user- price;
            System.out.println("your surplus is "+surplus+"the mochaccino has time finish 70 seg");
        }

        }
