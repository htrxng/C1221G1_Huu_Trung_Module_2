package ss3_mang_va_phuong_thuc_trong_java.bai_tap.merge_array;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] arrNum1 = new int[5];
        int[] arrNum2 = new int[5];

        for (int i = 0; i < arrNum1.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập giá trị " + (i + 1) + "của mảng 1: ");
            arrNum1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arrNum2.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập giá trị " + (i + 1) + " của mảng 2: ");
            arrNum2[i] = scanner.nextInt();
        }
        int[] arrNum3 = new int[arrNum1.length + arrNum2.length];
        for (int i = 0; i < arrNum1.length; i++) {
            arrNum3[i] = arrNum1[i];
        }
        for (int i = 0; i < arrNum2.length; i++) {
            arrNum3[(arrNum1.length) + i] = arrNum2[i];
        }
        for (int i = 0; i < arrNum3.length; i++) {
            System.out.print(arrNum3[i] + ", ");
        }
    }
}
