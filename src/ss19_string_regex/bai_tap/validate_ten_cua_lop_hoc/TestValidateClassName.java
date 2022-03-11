package ss19_string_regex.bai_tap.validate_ten_cua_lop_hoc;

import java.util.Scanner;

public class TestValidateClassName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String className;
        do {
            System.out.print("Enter Class's Name:");
             className = scanner.nextLine();
            ValidateClassName.checkClassName(className);
        } while (!ValidateClassName.checkClassName(className));
        System.out.println(className);
    }
}
