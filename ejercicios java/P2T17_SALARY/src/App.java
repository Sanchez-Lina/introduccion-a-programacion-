// AUTHOR: LINA SANCHEZ 
// DATE: 16/10/2020
// DESCRIPTION: This program calculte the salry of a employee

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       f_menu();
       f_salary();
       String option_user = f_continue();

       while (option_user. equals ("Y"));{
           f_salary();
           option_user= f_continue();

       }
    }

        public static void f_menu() {

        System.out.println("------------------------------------" );
        System.out.println("---------SALARY OF A EMPLOYEE--------");
        System.out.println("------------------------------------" );
        System.out.println("----- version: 2.0 / 16/10/2020------");
        System.out.println("-----------By Lina Sanchez-----------");
        System.out.println("-------------------------------------");

        }

    public static void f_salary() {
     // Description: this nethod calculate the salary of a worked, every hour $20.000.>.80. 20%
     Scanner keyboard = new Scanner (System.in);
      System.out.println("Input the total hours worked by employee:");
      int hours= keyboard.nextInt();
      int salary=0;

      while(hours<=0){

        System.out.println("ERROR: the hours should be greater than zero, input again the total hours");
        hours=keyboard.nextInt();

     if(hours>80){
        int extra= hours-80;
        int salary_extra= extra*20000;
        salary=(hours*20000)*salary_extra;
        System.out.println("Your salary is:"+salary+", whit extra hours"+ extra + "whit extra salary $"+ salary_extra);
      }else{
          salary=(hours*20000);
          System.out.println("your salary is $:"+salary);}}
         
      }
           
     public static String f_continue(){
          //Description: this method retuns yes (Y) / Not (N) by continue or not
          Scanner keyboard = new Scanner(System.in);       
          System.out.println("Do you want continue (Y/N)");
          String option = keyboard.nextLine();
         
          
          while(option.equals("Y") && !option.equals("N")){
              System.out.println("ERROR: This option don't exist, Do you want continue (Y/N)");  
              option = keyboard.nextLine(); }     
   
    
         return option;
     }
        
    }
    
