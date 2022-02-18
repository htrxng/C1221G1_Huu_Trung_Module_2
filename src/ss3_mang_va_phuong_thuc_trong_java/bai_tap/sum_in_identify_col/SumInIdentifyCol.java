package ss3_mang_va_phuong_thuc_trong_java.bai_tap.sum_in_identify_col;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SumInIdentifyCol {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
        // nhập mảng từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter row: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("enter col: ");
        int col = Integer.parseInt(scanner.nextLine());

        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter value for element of row " + (i + 1) + " col " + (j + 1));
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }

        }
        // nhập hàng cần tính tổng từ bàn phím.
        System.out.println("enter col need sum: ");
        int colNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][colNum];
        }
        System.out.println(sum);
    }
}
