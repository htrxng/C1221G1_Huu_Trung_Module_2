package ss15_exception_debug.bai_tap.su_dung_lop_illegal_triangle_exception;

import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------Nhập 3 cạnh của 1 tam giác---- ");
        System.out.print("cạnh 1: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("cạnh 2: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("cạnh 3: ");
        double c = Double.parseDouble(scanner.nextLine());
        try {
            TriangleCheck triangleCheck = new TriangleCheck();
            triangleCheck.checkTriangleSide(a,b,c);
            System.out.println("3 số đã nhập là 3 cạnh của tam giác");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("kết thúc chương trình");
        }
    }
    private void checkTriangleSide(double a, double b, double c) throws IllegalTriangleException{
        if (a<=0||b<=0||c<=0) {
            throw new IllegalTriangleException("Cạnh không được nhỏ hơn 0");
        }
        if (a+b<c || b+c<a || a+c < b) {
            throw new IllegalTriangleException("Tổng 2 cạnh không được bé hơn cạnh còn lại ");
        }
    }
}
