package oop_review.bank_account_manager;

import java.util.Scanner;

public class TestAccount {
    static Account account1 = new Account(1, "trần văn hữu trung");
    static Account account2 = new Account(2, "ukraina");
    static Account account4 = new Account(4, "Mom");
    static Account account5 = new Account(5, "Codegym");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(account1);
        account1.depositMoney(1000);
        account1.withdrawMoney(200);
        System.out.println(account1);
        account1.expire();
        System.out.println(account1);
        account1.depositMoney(-1);
        System.out.println(account1);
        account1.withdrawMoney(1000);
        System.out.println(account1);
        //chuyển tiền cho ukraina :)).
        account1.transfers(500, account2, "cho ne`, co len!");
        System.out.println(account1);
        account4.depositMoney(100000);
        account4.transfers(10000, account1, "me cho con trai");
        account1.transfers(6750, account5, "Tran Van Huu Trung C1221G1 nop hoc phi lan 3, thanks!");
    }
}
