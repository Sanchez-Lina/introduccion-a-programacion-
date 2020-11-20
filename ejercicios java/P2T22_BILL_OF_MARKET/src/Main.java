// AUTHOR: LINA SANCHEZ
// DATE: 22/ 10/ 2020
// DESCRIPTION: This program calculate the gross value and the total value whit the IVA of N programs

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        f_menu();
        int user_product = f_nproduct();
        int sum_product = 0, valor_bruto;
        for (int i = 1; i < user_product; i = i + 1) {
            sum_product = sum_product + f_vproduct();
        }
        double IVA = sum_product * 0.19;
        double total_bill = sum_product + IVA;
        System.out.println("the value bruto is:" + sum_product + " yhe total IVA is $" + IVA + "the total bill is" + total_bill);

    }

    public static void f_menu() {
        System.out.println("--------------------------------------");
        System.out.println("------------BILL OF MARKET------------");
        System.out.println("--------------------------------------");
        System.out.println("----- version: 1.0 / 22/10/2020-------");
        System.out.println("-----------By Lina Sanchez------------");
        System.out.println("--------------------------------------");
    }

    public static int f_nproduct() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the numbers of products");
        int product = keyboard.nextInt();
        while (product <= 0) {
            System.out.println("ERROR:the number of products must be greater than zero.Input again the number of product");
            product = keyboard.nextInt();
        }
        return product;
    }

    public static int f_vproduct(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the value of products");
        int nproduct = keyboard.nextInt();
        while (nproduct <= 0) {
            System.out.println("ERROR:the value of products must be greater than zero.Input again the number of product");
            nproduct = keyboard.nextInt();
    }
        return nproduct; 

}