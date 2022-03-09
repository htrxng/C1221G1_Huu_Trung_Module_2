package ss14_sort_algorithm.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            System.out.println("Lấy phần tử " + x);
            while (pos > 0 && x < array[pos - 1]) {
                System.out.println("chuyển " + array[pos - 1] + " vào chỗ " + array[pos]);
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            System.out.println("chuyển " + x + " vào vị trí index " + pos);
            array[pos] = x;
            System.out.println("Mảng sau vòng chạy " + i + " : " + Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int value : list) {
            System.out.print(value + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
    }
}
