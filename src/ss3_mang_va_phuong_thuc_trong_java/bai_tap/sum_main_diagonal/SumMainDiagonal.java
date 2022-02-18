package ss3_mang_va_phuong_thuc_trong_java.bai_tap.sum_main_diagonal;

import java.util.Scanner;

public class SumMainDiagonal {
    public static void main(String[] args) {
//                int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of array:");
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("enter value of element for row "+ (i+1) + " col " + (j+1));
                arr[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println(sum);
    }
}
