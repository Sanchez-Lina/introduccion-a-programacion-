// AUTHOR: LINA SANCHEZ
// DATE: 8/10/2020
// DESCRIPTION: This program calculate the bike time between two cities

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("-------------------------------------");
        System.out.println("P2T9: BIKE TIME: By Lina Sanchez");
        System.out.println("BIKE VERSION 0.1");
        System.out.println("-------------------------------------");

        Scanner keyboard= new Scanner(System.in);
         System.out.println(" input the distance between two cities (KM)");
         double DISTANCE= keyboard.nextDouble();

         if( DISTANCE <=0){
             System.out.println(" ERROR: The distance should be greater than zero");
         }else{
             f_bike_time(DISTANCE);

         }
    }
    public static void f_bike_time(double distancia){
        // DESCRIPTION: this funtion/sub-program calculate the time
        Scanner keyboard =new Scanner(System.in);
        System.out.println("input the velocity (Km/h)");
        double VELOCITY = keyboard.nextDouble();
        if(VELOCITY<=0){
            System.out.println("ERROR: The velocity should be greater than zero");
        }else{
            double TIME= distancia/VELOCITY;
            System.out.println("the time"+TIME+ "hours");
        }

    }
}
