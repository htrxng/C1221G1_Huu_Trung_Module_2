package ss3_mang_va_phuong_thuc_trong_java.count_char_in_array;

import java.util.Scanner;

public class CountSameCharInArray {
    public static void main(String[] args) {
        String str = "codegymcc";
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter char need count: ");
        char c = scanner.nextLine().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println(count);
    }
}
