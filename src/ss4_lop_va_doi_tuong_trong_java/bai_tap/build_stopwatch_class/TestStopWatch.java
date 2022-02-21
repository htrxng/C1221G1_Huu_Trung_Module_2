package ss4_lop_va_doi_tuong_trong_java.bai_tap.build_stopwatch_class;

import java.util.Scanner;

public class TestStopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to Start Time.");
        int a = scanner.nextInt();

        StopWatch stopWatch = new StopWatch();
        if (a == 1) {
            stopWatch.getTimeStart();
        }

//        System.out.println("Enter 2 to End Time.");
//        int b = scanner.nextInt();
//        if (b == 2) {
//
//            stopWatch.getTimeEnd();
//            System.out.println("ElapsedTime: "+ stopWatch.getElapsedTime() + " milisecond");
//        }
        long sum=0;
        for (long i = 0; i < 1000000; i++) {
             sum += i;
        }
        if(sum != 0) {
            stopWatch.getTimeEnd();
            System.out.println("ElapsedTime: "+ stopWatch.getElapsedTime() + " milisecond");
        }

        System.out.println("Enter 3 to reset Time.");
        int c = scanner.nextInt();
        if (c == 3) {
            stopWatch.start();
            stopWatch.stop();
        }
    }
}
