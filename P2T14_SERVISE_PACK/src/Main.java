//AUTHOR: LIAN SANCHEZ
// DATE: 9/10/2020
// DESCRIPTION: this program calculate the cost for he parcel service is based on the weigth of the package

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

                f_menu();
                int option = f_address();
                double weight=f_weight();
                double price =0;
                if(option==1){
                    price=weight=11;
                }else if (option==2){
                    price=weight=10;
                }else if (option==3){
                    price=weight=12;
                }else if (option==4){
                    price=weight=24;
                }else{
                    price=weight=27;
                }
                System.out.println("the price is"+price);
            }

    public static void f_menu(){
        System.out.println("-------------------------------------");
        System.out.println("---P2T15: PACKAGE. By Lina Sanchez---");
        System.out.println("------------version 0.1--------------");
        System.out.println("-------------------------------------");
    }
    public static int f_address(){
        //description:this progran return the option address
        Scanner keyboard=new Scanner(System.in);
        System.out.println("imput the option address ");
        System.out.println("1 Norte America  ");
        System.out.println("2 Central America");
        System.out.println("3 South America  ");
        System.out.println("4 Europe         ");
        System.out.println("5 Asia           ");

        int option=keyboard.nextInt();

        while(option<1||option>5){

            System.out.println("ERROR:your input the option address DON'T exist, input again");
            System.out.println("input the option address ");
            System.out.println("1 Norte America   ");
            System.out.println("2 Central America");
            System.out.println("3 South America  ");
            System.out.println("4 Europe         ");
            System.out.println("5 Asia           ");

            option =keyboard.nextInt();
        }
        return option;

    }

    public static double f_weight(){
        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("input the weight(kg) of parcel");
        double weight=keyboard2.nextDouble();
        while(weight<=0){
            System.out.println("ERROR:this weight (kg) should be greater than zero, input again the weight");
            weight=keyboard2.nextDouble();
        }
        return weight;
    }


}

