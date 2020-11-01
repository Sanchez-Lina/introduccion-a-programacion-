// AUTHOR: LINA SANCHEZ
// DATE: 6/10/2020
// DESCRIPTION: this program helps us to find the volume of a cylinder

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("--------------------------------------------");
        System.out.println("P2T10: VOLUME OF A CYLINDER. By Lina Sanchez");
        System.out.println("--------------------------------------------");

        Scanner teclado = new Scanner (System.in);

        int r, h;
        double v, tv;

        System.out.println("Input the value of r");
        r= teclado.nextInt();

        System.out.println("Input the value of h");
        h= teclado.nextInt();

        if(r<=0 && h<=0);{
            System.out.println("err");


            v= (3.14*(r^2));
            tv= (v*h);

            System.out.println(" Tha volumen of a cylinder is:"+v);

        }
}
    }
