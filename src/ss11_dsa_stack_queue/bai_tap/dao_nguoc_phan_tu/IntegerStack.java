package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu;

import java.util.Arrays;
import java.util.Stack;

public class IntegerStack {
    public static void main(String[] args) {
        int[] arrayInt = new int[]{1,2,3,7,8,14};
        System.out.println("array before reverse: " + Arrays.toString(arrayInt));
        Stack<Integer> integerStack = new Stack<>();
        for (int i = 0; i < arrayInt.length; i++) {
            integerStack.push(arrayInt[i]);
        }
        for (int i = 0; i < integerStack.size(); i++) {
            arrayInt[i] = integerStack.pop();
        }System.out.println("array after reverse" + Arrays.toString(arrayInt));
    }
}

