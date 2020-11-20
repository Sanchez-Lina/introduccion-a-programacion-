// AUTHOR: LINA SANCHEZ AND SANTIAGO RANGEL 
// DATE: 13/10/2020
// DESCRIPTION: This program helps us to perform different conversions to find the right temperature 

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------");
        System.out.println("DIFERENT CONVERSIONS. By Lina Sanchez");
        System.out.println("------------------------------------");

    }
    public static int f_option(){
      // description: this program return the option 
      Scanner keyboard= new Scanner(System.in);
        System.out.println("select the conversion you want to perform ");
        System.out.println("1-convert from °C to °F");
        System.out.println("2_convert from °F to °C");
        System.out.println("3-convert from °K to °C");
        System.out.println("4-convert from °C to °K");
         
        int option= keyboard.nextInt();
        while(option<1 || option>4){
        System.out.println(" ERROR:the options must be between 1 and 4");
        System.out.println("1-convert from °C to °F");
        System.out.println("2_convert from °F to °C");
        System.out.println("3-convert from °K to °C");
        System.out.println("4-convert from °C to °K");
       
        option=keyboard.nextInt();
        }
     return option;
    }
    public static Void f_convert_c_to_f(){
        // Description: this program realice convert from C° to f°
        Scanner keyboard = new Scanner(System.in);
        System.out.println("---convert to C° to F°---");
        System.out.println("Input the value of C°");
        double value= keyboard.nextDouble();
        double convert=(value*1.8);
        System.out.println(value+"C° is"+convert+"°F");
        }

    public static void f_convert_f_to_c(){

        // Description: this program realice convert from F° to C°
        Scanner keyboard = new Scanner(System.in);
        System.out.println("---convert to F° to C°---");
        System.out.println("Input the value of F°");
        double value= keyboard.nextDouble();
        double convert=(value-32);
        System.out.println(value+"F° is"+convert+"C°");
        }


    }
    
}
