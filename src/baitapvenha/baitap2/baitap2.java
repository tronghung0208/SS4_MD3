package baitapvenha.baitap2;

import java.util.Arrays;
import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vị trí cần chèn:");
        int indexthem = sc.nextInt();

        int[] oldArr = {2, 5, 6, 7, 8, 9};

        if (indexthem >= 0 && indexthem <= oldArr.length) {
            int[] newArr = new int[oldArr.length + 1];

            for (int i = 0; i < indexthem; i++) {
                newArr[i] = oldArr[i];
            }
            System.out.println("mảng mới nua " + Arrays.toString(newArr));
            System.out.println("Nhập giá trị mới:");
            int newValue = sc.nextInt();
            newArr[indexthem] = newValue;

            for (int i = indexthem; i < oldArr.length; i++) {
                newArr[i + 1] = oldArr[i];
            }

            System.out.println("Mảng mới: " + Arrays.toString(newArr));
        } else {
            System.out.println("Vị trí chèn không hợp lệ");
        }

    }
}
