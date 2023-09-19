package chuanbi.baitap1;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
//        Nhận kích thước mảng từ người dùng, kích thước mảng không được quá 20

        do {
            System.out.print("Nhập size: ");
            size = sc.nextInt();
            if ( size > 20) {
                System.out.println("size không được quá 20");
            }
        } while ( size > 20);

        array = new int[size];
//    gán giá trị cho từng phần tử trong mảng
        int i = 0;
        while (i < size){
            System.out.print("Nhập phần tử " + (i+1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
//        In ra mảng đã nhập
        System.out.printf("%-20s%s", "các phần tử mảng: ", "");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
//        Đảo ngược thứ tự các phần tử trong mảng
        for(int j = 0; j < array.length/2; j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
//        In ra mảng đã đảo ngược thứ tự các phần tử
        System.out.printf("\n%-20s%s", "Mảng đảo ngược: ", "");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
    }
}
