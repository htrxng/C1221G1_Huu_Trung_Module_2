package ss3_mang_va_phuong_thuc_trong_java.bai_tap.add_element_to_array;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] arrayNum = {1, 3, 5, 6, 9, 10, 12, 0, 0, 0, 0};
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value need add: ");
        x = scanner.nextInt();

        int indexAddX;
        System.out.println("enter index need add x:");
        indexAddX = scanner.nextInt();

        if (indexAddX <= -1 || indexAddX >= arrayNum.length) {
            System.out.println("cant add element");
        } else {
            for (int i = arrayNum.length - 1; i > indexAddX; i--) {
                arrayNum[i] = arrayNum[i - 1];
            }
            arrayNum[indexAddX] = x;
            for (int array : arrayNum) {
                System.out.print(array + ", ");
            }
        }
    }
}
