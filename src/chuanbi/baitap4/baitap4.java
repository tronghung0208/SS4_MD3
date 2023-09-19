package chuanbi.baitap4;

import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double F;
        double C;
        int choice;

        do {
            System.out.println("1.độ F sang độ C");
            System.out.println("2.độ C sang độ F");
            System.out.println("3.Thoát");

            System.out.println("nhập yêu cầu của bạn: " );
            choice =  sc.nextInt();


            switch (choice){
                case 1:
                    System.out.println("nhập vào đô f muốn chuyển đổi sang độ c");
                    F = sc.nextDouble();
                    System.out.println(chuyenDoCsangDoF(F));
                    break;
                case 2:

                    System.out.println("nhập vào đô c muốn chuyển đổi sang độ f");
                    C = sc.nextDouble();
                    System.out.println(chuyenDoFsangDoC(C));
                    break;
                case 3:
                    System.out.println("Thoát khỏi vòng lặp");
                    break;

            }

        }while (choice !=3);
    }

    public   static double chuyenDoCsangDoF(double C) {
        double F = (9/5)*C + 32;
        return  F;
    }
    public   static double chuyenDoFsangDoC(double F) {
        double C = (5/9)*(F - 32);
        return  C;
    }
}
