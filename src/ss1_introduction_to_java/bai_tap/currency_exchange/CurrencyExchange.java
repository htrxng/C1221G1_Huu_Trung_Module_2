package ss1_introduction_to_java.thuc_hanh.currency_exchange;

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter amount of money USD: ");
        usd = scanner.nextDouble();
        double exchange = usd * 23000;
        System.out.print("Amount VND: " + exchange);
    }
}
