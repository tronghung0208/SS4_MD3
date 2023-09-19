package baitapvenha.baitap1;

import java.util.Arrays;
import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa");
        int numberDelete = sc.nextInt();

        int[] oldArr = {2, 5, 6, 7, 8, 9};

        int index_del = -1;
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] == numberDelete) {
                index_del = i;
                break;
            }
        }
        System.out.println("vị trí: " + index_del);
        System.out.println("Mảng cũ: " +Arrays.toString(oldArr));
        if (index_del != -1) {
            for (int i = index_del; i < oldArr.length - 1; i++) {
                oldArr[i] = oldArr[i + 1];
            }


            int[] newArr = new int[oldArr.length - 1];


            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = oldArr[i];
            }
            System.out.println("Mảng mới: " + Arrays.toString(newArr));
        } else {
            System.out.println("Số bạn nhập không có");
        }


    }

}
