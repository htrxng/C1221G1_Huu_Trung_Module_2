package giai_thuat;

public class GiaiThuatTuan6 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > i ; j--) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int k = 0; k < 2*i-1 ; k++) {
                System.out.print(" ");
            }
            System.out.print(i);
            System.out.print("\n");
        }
        for (int i = 1; i < 5; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.print(5-i);
            for (int j = 10; j > 2*i+1 ; j--) {
                System.out.print(" ");
            }
            System.out.print(5-i);
            System.out.print("\n");
        }
    }
}

