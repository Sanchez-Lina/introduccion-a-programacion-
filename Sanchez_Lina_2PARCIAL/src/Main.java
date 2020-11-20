// AUTHORS: ANDRES FELIPE TORRES LOPEZ AND LINA SANCHEZ
// DATE: 19/11/2020
// DESCRIPTION: This  software simulates the automatic generation of the twelve (12) salaries
// .............of the year for N employees (value entered by the user), where the minimum value
// .............of an employee's salary per month is the SMLV in Colombia of the year 2020 and the
// .............maximum value is SMLV*5 in Colombia.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here}
        f_introduction();
        int rows = f_total_empleados();
        int[][] matrix_wages = new int[rows][12];
        int better_employ=0, employee_column=0;
        f_fill_columns(matrix_wages);
        int counter=0;
        double average;
        for (int i = 0; i < matrix_wages.length; i++) {
            for (int j = 0; j < 12; j++) {
                counter+= matrix_wages[i][j];
                if ( better_employ < matrix_wages[i][j] ){
                    better_employ=matrix_wages[i][j];
                    employee_column=j;
                }
            }
        }
        f_show_matris_value(matrix_wages);
        average= counter/(rows*12);
        System.out.println("The total that SmartPeople has paid is: "+counter+"," +
                " The average is: "+average+"," +
                " The employee who got the highest wage is: "+(employee_column+1)+", with: "+better_employ);

    }
    public static void f_introduction(){
        // DESCRIPTION:
        System.out.println("-------------------------------------");
        System.out.println("--------PARCIAL:SMART-PEOPLE--------");
        System.out.println("---------By: Lina Sanchez------------");
        System.out.println("----------By: Andres Torres----------");
        System.out.println("-------------------------------------");

    }
    public static int f_total_empleados(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the total persons");
        int v_total_empleados = keyboard.nextInt();
        while(v_total_empleados<1 || v_total_empleados>200){
            System.out.println("ERROR: the number of persons should be between 1 and 200. Input again the number");
            v_total_empleados = keyboard.nextInt();
        }
        return v_total_empleados;
    }
    public static void f_fill_columns(int[][] matris_wages){
        for (int i=0;i<matris_wages.length; i++){
            for(int j=0; j<matris_wages[0].length; j++){
                matris_wages[i][j]=(int) Math.floor(Math.random()*(4439015-877803+1)+877803);
            }
        }
    }
    public static void f_show_matris_value(int[][]f_fill_matrix){
        //Description: this method show the matrix values
        for(int i=0; i<f_fill_matrix.length;i++){
            System.out.print("\n ["+i+"]: ");
            for(int k=0;k<5;k++){
                System.out.print(f_fill_matrix[i][k]+" | ");
            }
        }

    }
}
