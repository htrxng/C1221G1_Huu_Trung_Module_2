package ss1_introduction_to_java.thuc_hanh.operator_expression;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);   //Khai báo đối tượng Scanner

        System.out.println("Enter Width: ");
        width = scanner.nextFloat(); // Nhập chiều rộng

        System.out.printf("Enter height: ");
        height = scanner.nextFloat(); // nhập chiều dài
        float  area = width * height;

        System.out.println("Area is: " + area);
    }
}
