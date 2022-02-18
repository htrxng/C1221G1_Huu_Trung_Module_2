package ss3_mang_va_phuong_thuc_trong_java.bai_tap.find_biggest_element_in_two_way_array;

import java.util.Scanner;

public class FindBiggestElementInTwoWayArray {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
        int rowSize;
        int colSize;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of row: ");
        rowSize = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter size of col");
        colSize = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[rowSize][colSize]; // khởi tạo mảng có số dòng và cột đc nhập vào.
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.println("Enter value for element of row "+ (i+1) + " col " + (j+1) +" : ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        int max = arr[0][0];
        int indexRow = 0;
        int indexCol = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max ) {
                    max = arr[i][j];
                    indexRow=i;
                    indexCol=j;
                }
            }
        }
        System.out.println("max: "+ max );
        System.out.println("indexRow:  "+indexRow );
        System.out.println("indexCol:  "+indexCol );
    }
}
