// AUTHOR: LINA SANCHEZ
// DATE: 3/11/2020
// DESCRIPTION:


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        f_menu();
        int v_N_products= f_total_products();
        double v_IVA=0, v_total_bill=0, v_average_price=0;
        int v_vector_products[]= f_fill_vector_products(v_N_products);
        for(int i=0; i<v_N_products; i++){
            if (v_vector_products[i]>10000){
                v_IVA= v_IVA+(v_vector_products[i]*0.19);
            }
            v_total_bill+=v_vector_products[i];
        }
        v_average_price=(v_total_bill+v_IVA)/v_N_products;
        System.out.println("Gross value: $"+v_total_bill);
        System.out.println("Tax (19%):$"+v_IVA);
        System.out.println("Total bill:$"+(v_total_bill+v_IVA));
        System.out.println("averague bill: $"+v_average_price);

    }
    public static void f_menu(){
        System.out.println("--------------------------------------");
        System.out.println("---------------PRODUCTS---------------");
        System.out.println("-------------------------------------" );
        System.out.println("----- version: 1.0 / 03/11/2020-------");
        System.out.println("-----------By Lina Sanchez------------");
        System.out.println("--------------------------------------");
    }
    public static int f_total_products() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the total products do you need?");
        int v_total_products = keyboard.nextInt();
        while (v_total_products<1 || v_total_products>10000){
            System.out.println("ERROR: the value should be between 2 to 10000, input again the total people do you want:");
            v_total_products=keyboard.nextInt();
        }
        return v_total_products;
    }
    public static int[] f_fill_vector_products(int N_products){
        int[] v_vector = new int[N_products];
        for (int i=1; i<N_products; i++){
            v_vector[i]=(int) (Math.random()*(98000))+1000;
        }
        return v_vector;
    }

}
