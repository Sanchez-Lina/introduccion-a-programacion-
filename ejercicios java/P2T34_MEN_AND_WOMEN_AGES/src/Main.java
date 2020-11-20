 // AUTHOR: LINA SANCHEZ
// DATE: 6/11/2020
// DESCRIPTION:

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        f_menu();
        int [] v_vector_women = f_fill_vector_age();
        int [] v_vector_men = f_fill_vector_age();
        int [] v_totales = {0,0,0,0,0,0};
        //int v_tot_men_17=0, v_tot_women_17=0;
        //int v_tot_men_18_59=0, v_tot_women_18_59=0;
        //int v_tot_men_60=0, v_tot_women_60=0;
        for(int i=1; i<v_vector_men.length;i++){
            if (v_vector_women[i]<18){
                v_totales[i]=v_totales[1]+1;
            }else if(v_vector_women[i]<60){
                v_totales[3]=v_totales[3]+1;
            }else {
                v_totales[5]=v_totales[5]+1;
            }
            v_totales[7]=v_totales[7]+v_vector_women[i];

            if(v_vector_men[i]<18){
                v_totales[0]=v_totales[0]+1;
            }else if(v_vector_women[i]<60){
                v_totales[2]=v_totales[2]+1;
            }else {
                v_totales[4]=v_totales[4]+1;
            }
            v_totales[6]=v_totales[6]+v_vector_men[i];
        }
        System.out.println("men" + v_totales[0]+ "and women" +v_totales[1]+ "are under the age of 18");
        System.out.println("men" + v_totales[2]+ "and women" +v_totales[3]+ "are equal to or over 18 but under 60");
        System.out.println("men" + v_totales[4]+ "and women" +v_totales[5]+ "equal or over 60 years of age");
        System.out.println("average age of women:"+(v_totales[7]/v_vector_women.length))+"and men:"+ (v_totales[6]/v_vector_men.length);
        System.out.println("...Ages of women...");
        for(int i=0;i<v_vector_women.length;i++){
            System.out.println("["+i+"]="+v_vector_women[i]);
        }
        System.out.println("----Ages of men----");
        for(int i=0;i<v_vector_men.length;i++){
            System.out.println("["+i+"]="+v_vector_men[i]);
        }
        

    }
    public static void f_menu(){
        System.out.println("--------------------------------------");
        System.out.println("----------MEN AND WOMEN AGE-----------");
        System.out.println("--------------------------------------");
        System.out.println("----- version: 1.0 / 05/11/2020-------");
        System.out.println("-----------By Lina Sanchez------------");
        System.out.println("--------------------------------------");
    }

    public static int [] f_fill_vector_age(){
        int [] v_vector= new int[10];
        for (int i=1; i<10; i++){
            v_vector [i]= (int)(Math.random()*99)+1;
            System.out.println("["+i+"]="+v_vector[i]);
        }
        return v_vector;

    }


}
