package baitapvenha.baitap9;

public class baitap9 {
    public static void main(String[] args) {

        int[] arr = {1, 2, -8, -1, 4, 9};
        int max = arr[0];
        int max2 = Integer.MIN_VALUE; // Khởi tạo max2 với giá trị nhỏ nhất
        for (int j : arr) {
            if (j > max) {
                max2 = max;
                max = j;
            } else if (j > max2 && j != max) {
                max2 = j;
            }
        }
        System.out.println("Phần tử lớn thứ hai trong mảng là: " + max2);
    }
}
