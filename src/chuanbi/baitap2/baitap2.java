package chuanbi.baitap2;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String inputName = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++){
            // chuyển đổi chữ hoa thành chữ thường
            if(students[i].toLowerCase().equals(inputName.toLowerCase())){
                System.out.println("Vị trí của " + inputName + " trong danh sách họ sinh là: " + i);
                isExist = true;
                break;
            }
        }
        if(!isExist) {
            System.out.println("tên " +  inputName + " không có trong danh sách");
        }
    }
}
