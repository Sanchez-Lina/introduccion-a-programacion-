import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("P2T8: HYPOTENUSE. By Lina Sanchez, Ana Stephanny Soto");
        
        int a, b;
        double h, th;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the value of a");
        a= keyboard.nextInt();

        System.out.println("input the value of b");
        b= keyboard.nextInt();

        h=(a*a)+(b*b);
        th= Math.sqrt(h);

        System.out.println("the hypotenuse is:"+th);
    }
}
