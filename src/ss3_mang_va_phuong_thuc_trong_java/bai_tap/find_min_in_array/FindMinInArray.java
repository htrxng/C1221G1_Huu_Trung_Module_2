package ss3_mang_va_phuong_thuc_trong_java.bai_tap.find_min_in_array;

import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        int[] arrNum = new int[5];

        for (int i = 0; i < arrNum.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter value of  " + (i + 1) + ": ");
            arrNum[i] = scanner.nextInt();
        }
        int min = arrNum[0];
        for (int i = 1; i < arrNum.length; i++) {
            if (arrNum[i] < min) {
                min = arrNum[i];
            }
        }
        System.out.println("min is: " + min);
    }
}
