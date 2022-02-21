package ss2_vong_lap_trong_java.bai_tap.display_20_firstprime;

import java.util.Scanner;

public class DisPlay20FirstPrime {
    public static void main(String[] args) {
        int num = 20;
        int count = 0;
        int N = 2;
        while (count < num) {
            boolean check = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    check = false;

                }
            }
            if (check) {
                System.out.print(N + ", ");
                count++;
            }
            N++;
        }
    }
}
