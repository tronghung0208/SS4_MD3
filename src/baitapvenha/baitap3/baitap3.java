package baitapvenha.baitap3;

import java.util.Arrays;
import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};

        int[] newArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            newArr[i]=arr1[i];
        }
        System.out.println("mang mowis"+ Arrays.toString(newArr));

        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length+i]=arr2[i];
        }
        System.out.println("mang mowis"+ Arrays.toString(newArr));
    }
}
