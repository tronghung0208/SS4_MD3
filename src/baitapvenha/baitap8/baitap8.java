package baitapvenha.baitap8;

import java.util.Scanner;

public class baitap8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Rikkei academy";


        System.out.println("Nhập kí tự cần tìm: ");
        char kiTuCanDem = sc.nextLine().charAt(0); // Nhập ký tự cần đếm từ bàn phím

        int count = 0; // Biến đếm

        // Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.toLowerCase().charAt(i);

            // Kiểm tra nếu ký tự hiện tại trùng với ký tự cần đếm
            if (currentChar == kiTuCanDem) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + kiTuCanDem + " trong chuỗi là: " + count);
    }
}
