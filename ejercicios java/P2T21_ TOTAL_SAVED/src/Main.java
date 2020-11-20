// AUTHOR: ANA STEPHANNY SOTO AND LINA SANCHEZ
// DATE. 20/10/2020
// DESCRIPTION: This program determine the total saved of a person in N months .

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        f_menu();
        int user_month = f_month();
        int sum_money=0, average_money;
        for(int i=1; i<user_month;i=i+1){
            System.out.println("Input the money by month numbers"+i);
            sum_money+=f_money();
        }
        average_money=sum_money/user_month;
        System.out.println("The average by months"+user_month+"is"+average_money);


    }

    public static void f_menu() {
        System.out.println("--------------------------------------");
        System.out.println("------------AVERAGE HEIGHT------------");
        System.out.println("--------------------------------------");
        System.out.println("----- version: 1.0 / 20/10/2020-------");
        System.out.println("-----------By Lina Sanchez------------");
        System.out.println("----------By Stephanny Soto-----------");
        System.out.println("--------------------------------------");
    }

    public static int f_month() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Input the numbers months");
        int month = keyboard.nextInt();
        while (month < 2 || month > 12) {
            System.out.println("ERROR:the months should be between 2 and 12, input again the months");
            month = keyboard.nextInt();
        }
        return month;
    }

    public static int f_money() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Input the money for month");
        int money = keyboard.nextInt();
        while (money < 10000 || money > 1000000) {
            System.out.println("ERROR:the money should be between 10000 and 1000000, input again the money");
            money = keyboard.nextInt();
        }
        return money;
    }
}
