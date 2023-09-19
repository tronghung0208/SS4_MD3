package baitapvenha.baitap7;

import java.util.Scanner;

public class baitap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[][] arr = {{2, 5, 9}, {6, 7, 10}, {3, -3, 8}};
double total=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (i==j){
                    total+=arr[i][j];
                }
            }

        }
        System.out.println("tổng đường chéo là: "+total);
    }
}
