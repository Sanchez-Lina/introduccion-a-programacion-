// AUTHOR: LINA SANCHEZ
// DATE: 9/10/2020
// DESCRIPTION: this program calculate the saved money that a person save for N days

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        f_menu();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the the total months");
        int mo = keyboard.nextInt();
        int save_money=0;
        if (mo <= 0) {
        System.out.println("ERROR: the months should be greater than ");
        }else{
            save_money = f_money(mo);
            System.out.println(" the money saved during "+mo+"month is"+save_money);
        }
    }
    public static void f_menu(){
        System.out.println("-------------------------------------");
        System.out.println("--P2T13:SAVE MONEY. By Lina Sanchez--");
        System.out.println("------------version 0.1--------------");
        System.out.println("-------------------------------------");
    }
    public static void f_money(int months){
        Scanner keyboard = new Scanner(System.in);
        double tot_save;
        System.out.println("input the monthly salary");
        double salary=keyboard.nextDouble();

        if(salary<=0) {
            System.out.println("ERROR: The salary should be greater than zero");
            tot_save = 0;
        }else{
            tot_save=(salary*0.6)*months;
        }
        return tot_save;
    }

}
