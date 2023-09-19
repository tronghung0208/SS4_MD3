package baitapvenha.baitap6;

import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int[][] arr = {{2, 5, 9}, {6, 7, 10}, {3, -3, 8}};
        System.out.println("Nhập vào cột muốn xóa");
        int index = sc.nextInt();

        if (index >= 0 && index <= arr[0].length) {
            double total = 0;
            for (int i = 0; i < arr.length; i++) {
                total += arr[i][index];
            }
            System.out.println("tổng" + total);
        }else {
            System.out.println("Vị trí bạn nhập không hợp lệ");
        }

    }
}
