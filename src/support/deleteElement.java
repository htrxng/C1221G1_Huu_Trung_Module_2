package support;

import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Print the rectangle\n" +
                "\n" +
                "2)Print the square triangle \n" +
                "\n" +
                "3)Print isosceles triangle\n" +
                "\n" +
                "4)Exit\n" +
                "\n" +
                "ENTER THE NUMBER YOU WANT");
        int number = sc.nextInt();

        if (number == 1) {
            int m, n;
            System.out.println("Nhap So Hang");
            m = sc.nextInt();
            System.out.println("Nhap So Cot");
            n = sc.nextInt();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }

        }  if (number ==2 ) {
            for (int i = 1; i <= 5; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        } else if (number == 3) {
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= 5 - i; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }
        else if (number ==4){
            System.out.println("Good Bye");
        }
        else {
            System.out.println("So Tum Bay 'Ctrl Shift F10' Lai Nha ^^");
        }

    }
}

