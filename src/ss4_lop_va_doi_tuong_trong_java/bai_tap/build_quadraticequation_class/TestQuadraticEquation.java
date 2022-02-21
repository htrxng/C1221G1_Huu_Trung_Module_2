package ss4_lop_va_doi_tuong_trong_java.bai_tap.build_quadraticequation_class;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a: ");
        double a = scanner.nextDouble();
        System.out.println("enter b: ");
        double b = scanner.nextDouble();
        System.out.println("enter c: ");
        double c = scanner.nextDouble();

        // khởi tạo đối tượng tính pt căn bậc 2:
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        System.out.println("delta: " + delta);
        if (delta > 0) {
            System.out.println("Equation has two distict roots: ");
            System.out.println("root 1 = " + quadraticEquation.getRoot1());
            System.out.println("root 2 = " + quadraticEquation.getRoot2());
        } else if (delta < 0) {
            System.out.println("The equation has no roots.");
        } else {
            System.out.println("Equation has dual root = " + quadraticEquation.getRoot2());
        }
    }
}
