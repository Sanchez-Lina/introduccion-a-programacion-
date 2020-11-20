// AUTHOR: LINA SACHEZ
// DATE: 23/10/2020
// DESCRIPTION:

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        f_introduction();
        double v_salary_average=0, v_salary_total=0, v_salary_higher=0;
        int n_employees=;
    }

    public static void f_introduction(){
        System.out.println("--------------------------------------");
        System.out.println("-----------SAVE N EMPLOYEES-----------");
        System.out.println("--------------------------------------");
        System.out.println("----- version: 1.0 / 20/10/2020-------");
        System.out.println("-----------By Lina Sanchez------------");
        System.out.println("--------------------------------------");
    }
    public static int n_employees(){
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Input the total employees");
        int n_employees = keyboard.nextInt();
        while (n_employees < 1 ||n_employees >100){
            System.out.println("ERROR: your should be between 1 and 100. Input again the total employees");
            n_employees= keyboard.nextInt();
        }
        return n_employees;
    }
    public static double f_total_salary(int-i) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the salary od the employee");
        int n_employees = keyboard.nextInt();
        while (n_employees < 1 || n_employees > 100) {
            System.out.println("ERROR: your should be between 1 and 100. Input again the total employees");
            n_employees = keyboard.nextInt(); }
        System.out.println("imput the workdays in this month by the employer "+i+"$:");
        int workdays=keyboard.nextInt();
        while(workdays<1 || workdays>30){
            System.out.println(" the workdays should be between 1 and 30 input again the workdaysfor thr rmployer "+i+"$:");
            workdays=keyboard.nextInt(); }
        double salary_employer =(salary/30)*workdays
        }
        return salary_employer;
    }

