// AUTHOR: LINA SANCHEZ
// DATE: 8/10/2020
// DESCRIPTION: this program calculate the final grade: N1 (20%) + N2(25%)+ N3(25%)+ N4(30%)

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("-------------------------------------");
        System.out.println("P2T8: STUDENT GRADES. By Lina Sanchez");
        System.out.println("FINAL GRADE VERSION 0.1");
        System.out.println("-------------------------------------");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the fisrt grade (20%)-this value should be between 0 and 5");
        float N1 = keyboard.nextFloat();

        System.out.println("Input the second grade (25%)-this value should be between 0 and 5");
        float N2 = keyboard.nextFloat();

        System.out.println("Input the third grade (25%)-this value should be between 0 and 5");
        float N3 = keyboard.nextFloat();

        System.out.println("Input the fourth grade (30%)-this value should be between 0 and 5");
        float N4 = keyboard.nextFloat();

        if (N1 < 0 || N1 > 5 || N2 < 0 || N2 > 5 || N3 < 0 || N3 > 5 || N4 < 0 || N4 > 5) {

            System.out.println("ERROR:The final grade can´t calculate because one grade was not between 0 and 5");

        }else{
            double FinalG = (N1 * 0.2) + (N2 * 0.25) + (N3 * 0.25) + (N4 * 0.3);
            System.out.println("the final grade is:" + FinalG);
        }
    }
}
