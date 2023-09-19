package chuanbi.baitap3;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhập Kích thước của mảng");
            size = sc.nextInt();
            if(size > 20){
                System.out.println("kích thuoc của mảng ko đc vượt quá 20");
            }
        }while (size>20);


        array = new int[size];
        int i = 0;

        while (i< array.length){
            System.out.println("nhập phẩn tử thứ"+(i+1)+ ":");
            array[i] = sc.nextInt();
            i++;
        }

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] +"\t");

        }

        int max = array[0];
        int index = 0;

        for (int j = 0; j < array.length; j++) {
            if(array[j] > max){
                max = array[j];
                index = j;
            }

        }
        System.out.println("số lớn nhất trong mảng là: " + max +" tại vị trí " + index);
    }
}
