import java.util.Scanner;
public class Main{

    public static void main(String[] args){
	// write your code here
        System.out.println("-----------------------------------------------------");
        System.out.println("P2T5: DIFFERENCE BETWEEN TWO NUMBERS. By Lina Sanchez");
        System.out.println("----------------------------------------------------");
        Scanner keyboard = new Scanner(System.in);

        System.out.println(" Input the first number");
        int num= keyboard.nextInt();

        System.out.println(" Input the second number");
        int num2 = keyboard.nextInt();

        int resu= num-num2;

        System.out.println(" the subtrac is"+resu);


    }
}
