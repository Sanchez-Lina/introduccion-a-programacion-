//AUTHOR: LINA SANCHEZ
//DATE: 13/11/2020
//DESCRIPTION:

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        f_menu();
        int v = f_total_competitors();
    }

    public static void f_menu() {
        System.out.println("--------------------------------------");
        System.out.println("---------SWMMING COMPETITION----------");
        System.out.println("--------------------------------------");
        System.out.println("----- version: 1.0 / 13/11/2020-------");
        System.out.println("-----------By Lina Sanchez------------");
        System.out.println("--------------------------------------");
    }

    public static int f_total_competitors() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Input the total competitors do you want");
        int v_total_competitors = keyboard.nextInt();
        while (v_total_competitors < 1) {
            System.out.println("ERROR: your values must be greater than zero, Input again the total competitors");
            v_total_competitors = keyboard.nextInt();
        }
        return v_total_competitors;
    }

        public static int[][] f_fill_matriz(int v_user_competitors){
            int[][] v_matriz = new int[v_user_competitors][6];
            for (int i = 1; i < v_user_competitors; i++) {
                for (int j = 0; j < 6; j++) {
                    v_matriz[i][j]=(int) (Math.random() * (15 - 8) + 8);
                }
            }
            return v_matriz;
        }
        public static void  f_show_winner(int [][] v_matriz_times){
        int v_player_winner=0;
        int v_player_total_time=0;
        int v_player_tmp_time=0;
        for( int i=0; i<v_matriz_times.length; i++){
            v_player_tmp_time=0;
            for(int j=0;j<6;j++){
                v_player_tmp_time+= v_matriz_times[i][j];
            }
            if(i==0){
                v_player_winner=i;
                v_player_total_time=v_player_tmp_time;
            }else{
                if (v_player_total_time)
            }
        }
        }
    }




