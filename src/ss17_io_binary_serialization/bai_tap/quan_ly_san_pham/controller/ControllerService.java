package ss17_io_binary_serialization.bai_tap.quan_ly_san_pham.controller;

import ss17_io_binary_serialization.bai_tap.quan_ly_san_pham.service.ProductServiceImpl;

import java.util.Scanner;

public class ControllerService extends ProductServiceImpl {
    public void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.println("Menu Function \n" +
                    "1.Add Product \n" +
                    "2.Display Product List \n" +
                    "3.Search Product Information \n " +
                    "4.Delte Product \n" +
                    "0.Exit \n");
            System.out.print("choose function: ");
            Scanner scanner = new  Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    //create
                    create();
                    break;
                case 2:
                    //display
                    display();
                    break;
                case 3:
                    //search
                    search();
                    break;
                case 4:
                    //delete
                    delete();
                    break;
                case 0:
                    //exit
                    flag = false;
                    break;
                default:
                    System.out.println("not a choice! ");
            }
        } while (flag);
    }
}
