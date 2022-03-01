package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu;

import java.util.Arrays;
import java.util.Stack;

public class StringStack {
    public static void main(String[] args) {
        String stringWord = new String("code gym da nang");
        Stack<String> stringStack = new Stack<>();
        String[] s = stringWord.split(" ");
        System.out.println(Arrays.toString(s));
        for (int i = 0; i < s.length; i++) {
            stringStack.push(s[i]);
        }
        String newString = new String("");
        for (int i = 0; i < s.length; i++) {
            newString += stringStack.pop();
            newString += " ";

        }
        System.out.println("after reverese: "+  newString);
    }
}
