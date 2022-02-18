package ss3_mang_va_phuong_thuc_trong_java.bai_tap.delete_element_from_array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] arrayNum = {1,1,5,6,9,10,12};
        int x;
        int indexXInArray= -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value need delete: ");
        x = scanner.nextInt();
            for (int i = 0; i < arrayNum.length; i++) {
                if(arrayNum[i] == x) {
                    indexXInArray = i;
                    break;
                }
            }
            for (int j = indexXInArray; j < arrayNum.length-1 ; j++) {
                arrayNum[j] = arrayNum[j+1];
            }
            arrayNum[arrayNum.length-1] = 0;
        for (int array: arrayNum)
        {
            System.out.print(array+ ", ");
        }
    }
}
