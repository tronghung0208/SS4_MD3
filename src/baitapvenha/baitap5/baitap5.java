package baitapvenha.baitap5;

public class baitap5 {
    public static void main(String[] args) {
        int[][] arr = {{2, 5, 9}, {6, 7, 10}, {3, -3, 8}};

        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // So sánh giá trị hiện tại với maxValue và cập nhật maxValue nếu cần
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }

        }
        System.out.println("Giá trị lớn nhất là: "+min);
    }
}
