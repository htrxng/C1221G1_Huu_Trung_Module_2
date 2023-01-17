package giai_thuat.tuan_12;

import java.util.Scanner;

public class VeHinh {
    public void VeDongHoCat(int a) {
        int b = a / 2;
        int c = a/3;
//        for (int i = 0; i < b ; i++) {
//            for (int j = 0; j < i ; j++) {
//                System.out.print(" ");
//            }
//            for (int k = b; k > i ; k--) {
//                System.out.print("*");
//            }
//
//            for (int k = b; k > i ; k--) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < i ; j++) {
//                System.out.print(" ");
//            }
//            System.out.print("\n");
//        }
//        for (int i = 0; i < b ; i++) {
//            for (int j = b-1; j > i ; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k <= i ; k++) {
//                System.out.print("*");
//            }
//            for (int k = 0; k <= i ; k++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
        for (int i = 0; i < c; i++) {
            System.out.print("   ");
            System.out.print("[");
            for (int j = 0; j < c; j++) {
                System.out.print("+");
            }
            System.out.print("]");
            System.out.print("\n");
        }

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = b; k > i; k--) {
                System.out.print("*");
            }

            for (int k = b; k > i; k--) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        for (int i = 0; i < b; i++) {
            for (int k = b; k > i; k--) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = b; k > i; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VeHinh veHinh = new VeHinh();


        
        veHinh.VeDongHoCat(10);
    }
//    for (int i = 0; i < b ; i++) {
//            for (int j = 0; j < i ; j++) {
//                System.out.print(" ");
//            }
//            for (int k = b; k > i ; k--) {
//                System.out.print("*");
//            }
//
//            for (int k = b; k > i ; k--) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < i ; j++) {
//                System.out.print(" ");
//            }
//            System.out.print("\n");
//        }
//        for (int i = 0; i < b ; i++) {
//            for (int k = b; k > i ; k--) {
//                System.out.print("*");
//            }
//
//            for (int j = 0; j < i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i ; j++) {
//                System.out.print(" ");
//            }
//            for (int k = b; k > i ; k--) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
}
