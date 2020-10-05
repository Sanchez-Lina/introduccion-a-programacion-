

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------------------------------");
        System.out.println("P2T7: SUPERMARKET. By Lina Sanchez");
        System.out.println("----------------------------------");

        int P1, P2, P3, P4 ,VALB;
        double IVA, BILL;
        Scanner keyboard = new Scanner (System.in);

        System.out.println("Input the first number");
        P1=keyboard.nextInt();

        System.out.println("Input the second number");
        P2=keyboard.nextInt();

        System.out.println("Input the third number");
        P3=keyboard.nextInt();

        System.out.println("Input the fourth number");
        P4=keyboard.nextInt();

        VALB= P1+P2+P3+P4;
        IVA= VALB*0.19;
        BILL=VALB+IVA ;

        System.out.println("The total bill is"+BILL+"with iva 19%:"+ IVA);


    }
}
