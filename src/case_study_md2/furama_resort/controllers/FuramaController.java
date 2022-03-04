package case_study_md2.furama_resort.controllers;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.println("---------Main Menu --------- \n" +
                    "1. Employee Management " +
                    "2. Customer Management " +
                    "3. Facility Management " +
                    "4. Booking Management " +
                    "5. Promotion Management " +
                    "6. Exit ");
            System.out.print("Choose function: ");
            int chooseMainFunction = Integer.parseInt(scanner.nextLine());
            switch (chooseMainFunction) {
                case 1:
                    // Employee Management
                    boolean flag1 = true;
                    do {

                        System.out.println("1.Display list employees \n " +
                                "2.Add new employee \n" +
                                "3.Edit employee \n" +
                                "4.Return main menu ");
                        System.out.println("Choose function: ");
                        int choose = Integer.parseInt(scanner.nextLine());
                        switch (choose) {
                            case 1:
                                //display list employees
                                break;
                            case 2:
                                // add new employee
                                break;
                            case 3:
                                //edit employee
                                break;
                            case 4:
                                //return main menu
                                flag1 = false;
                                break;
                            default:
                                System.out.println("not a choice!");
                        }
                    } while (flag1);
                    break;
                case 2:
                    // Customer Management
                    boolean flag2 = true;
                    do {

                        System.out.println("1.Display list customers \n " +
                                "2.Add new customers \n" +
                                "3.Edit customers \n" +
                                "4.Return main menu ");
                        System.out.println("Choose function: ");
                        int choose = Integer.parseInt(scanner.nextLine());
                        switch (choose) {
                            case 1:
                                //display list customers
                                break;
                            case 2:
                                // add new customers
                                break;
                            case 3:
                                //edit customers
                                break;
                            case 4:
                                //return main menu
                                flag2 = false;
                                break;
                            default:
                                System.out.println("not a choice!");
                        }
                    } while (flag2);
                    break;
                case 3:
                    // Facility Management
                    boolean flag3 = true;
                    do {

                        System.out.println("1.Display list facility \n " +
                                "2.Add new facility \n" +
                                "3.Edit facility \n" +
                                "4.Return main menu ");
                        System.out.print("Choose function: ");
                        int choose = Integer.parseInt(scanner.nextLine());
                        switch (choose) {
                            case 1:
                                //display list facility
                                break;
                            case 2:
                                // add new facility
                                break;
                            case 3:
                                //edit facility
                                break;
                            case 4:
                                //return main menu
                                flag3 = false;
                                break;
                            default:
                                System.out.println("not a choice!");
                        }
                    } while (flag3);
                    break;
                case 4:
                    // Booking Management
                    boolean flag4 = true;
                    do{
                        System.out.println("1.Add new booking \n" +
                                "2.Display list booking \n" +
                                "3.Create new constracts \n" +
                                "4.Display contracts list  \n" +
                                "5.Edit contracts \n" +
                                "6.Return main menu \n");
                        System.out.print("choose function: ");
                        int choose = Integer.parseInt(scanner.nextLine());
                        switch (choose) {
                            case 1:
                                // add new booking
                                break;
                            case 2:
                                // display list booking
                                break;
                            case 3:
                                //Create new constracts
                                break;
                            case 4:
                                //Display contracts list
                                break;
                            case 5:
                                //Edit contracts
                                break;
                            case 6:
                                //return main menu
                                flag4 = false;
                                break;
                            default:
                                System.out.println("not a choice!");
                        }
                    } while (flag4);
                    break;
                case 5:
                    // Promotion Management
                    boolean flag5 = true;
                    do {
                        System.out.println("1.Display list customers use service \n" +
                                "2.Display list customers get voucher \n" +
                                "3.Return main menu");
                        System.out.print("choose function: ");
                        int choose = Integer.parseInt(scanner.nextLine());
                        switch (choose) {
                            case 1:
                                // Display list customers use service
                                break;
                            case 2:
                                // Display list customers get voucher
                                break;
                            case 3:
                                //Return main menu
                                flag5 = false;
                                break;
                            default:
                                System.out.println("not a choice!");
                        }
                    } while (flag5);
                    break;
                case 6:
                    //exit
                    flag = false;
                    break;
                default:
                    System.out.println("not a choice!");
                    break;
            }
        } while (flag);
    }
}
