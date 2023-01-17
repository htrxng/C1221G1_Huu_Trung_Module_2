package case_study_md2.furama_resort.controllers;

import case_study_md2.furama_resort.models.Customer;
import case_study_md2.furama_resort.services.impl.CustomerServiceImpl;
import case_study_md2.furama_resort.services.impl.EmployeeServiceImpl;
import case_study_md2.furama_resort.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);

    public FuramaController() {
    }

    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.println("---------Main Menu --------- \n" +
                    "1. Employee Management \n" +
                    "2. Customer Management \n" +
                    "3. Facility Management \n" +
                    "4. Booking Management \n" +
                    "5. Promotion Management \n" +
                    "0. Exit");
            System.out.print("Choose function: ");
            String chooseMainFunction = scanner.nextLine();
            switch (chooseMainFunction) {
                case "1":
                    // Employee Management
                    boolean flag1 = true;
                    do {
                        System.out.println("----------Menu Employee Management Function-------\n" +
                                "1.Display list employees \n" +
                                "2.Add new employee \n" +
                                "3.Edit employee \n" +
                                "4.Save data and return main menu ");
                        System.out.print("Choose function: ");
                        String choose = scanner.nextLine();
                        switch (choose) {
                            case "1":
                                //display list employees
                                employeeService.display();
                                break;
                            case "2":
                                // add new employee
                                employeeService.add();
                                break;
                            case "3":
                                //edit employee
                                employeeService.edit();
                                break;
                            case "4":
                                //return main menu
                                employeeService.saveToFile();
                                flag1 = false;
                                break;
                            default:
                                System.out.println("not a choice!");
                        }
                    } while (flag1);
                    break;
                case "2":
                    // Customer Management
                    boolean flag2 = true;
                    do {

                        System.out.println("-------Menu Customer Management Function-------\n" +
                                "1.Display list customers \n" +
                                "2.Add new customers \n" +
                                "3.Edit customers \n" +
                                "4.Save data and return main menu ");
                        System.out.print("Choose function: ");
                        String choose = scanner.nextLine();
                        switch (choose) {
                            case "1":
                                //display list customers
                                customerService.display();
                                break;
                            case "2":
                                // add new customers
                                customerService.add();
                                break;
                            case "3":
                                //edit customers
                                customerService.edit();
                                break;
                            case "4":
                                //return main menu
                                customerService.saveToFile();
                                flag2 = false;
                                break;
                            default:
                                System.out.println("not a choice!");
                        }
                    } while (flag2);
                    break;
                case "3":
                    // Facility Management
                    boolean flag3 = true;
                    do {
                        System.out.println("-------Menu Facility Management Function-------\n" +
                                "1.Display list facility \n" +
                                "2.Add new facility \n" +
                                "3.Display list facility maintenance\n" +
                                "4.Save data and return main menu ");
                        System.out.print("Choose function: ");
                        String choose = scanner.nextLine();
                        switch (choose) {
                            case "1":
                                //display list facility
                                facilityService.displayListFacility();
                                System.out.println();
                                break;
                            case "2":
                                // add new facility
                                facilityService.addNewFacility();
                                break;
                            case "3":
                                //display list facility maintenance
                                facilityService.displayListFacilityMaintenance();
                                break;
                            case "4":
                                //return main menu
                                facilityService.saveDataFacility();
                                flag3 = false;
                                break;
                            default:
                                System.out.println("not a choice!");
                        }
                    } while (flag3);
                    break;
                case "4":
                    // Booking Management
                    boolean flag4 = true;
                    do {
                        System.out.println("-------Menu Booking Management Function-------\n" +
                                "1.Add new booking \n" +
                                "2.Display list booking \n" +
                                "3.Create new constracts \n" +
                                "4.Display contracts list  \n" +
                                "5.Edit contracts \n" +
                                "6.Return main menu \n");
                        System.out.print("choose function: ");
                        String choose = scanner.nextLine();
                        switch (choose) {
                            case "1":
                                // add new booking
                                break;
                            case "2":
                                // display list booking
                                break;
                            case "3":
                                //Create new contracts
                                break;
                            case "4":
                                //Display contracts list
                                break;
                            case "5":
                                //Edit contracts
                                break;
                            case "6":
                                //return main menu
                                flag4 = false;
                                break;
                            default:
                                System.out.println("not a choice!");
                        }
                    } while (flag4);
                    break;
                case "5":
                    // Promotion Management
                    boolean flag5 = true;
                    do {
                        System.out.println("-------Menu Promotion Management Function-------\n" +
                                "1.Display list customers use service \n" +
                                "2.Display list customers get voucher \n" +
                                "3.Return main menu");
                        System.out.print("choose function: ");
                        String choose = scanner.nextLine();
                        switch (choose) {
                            case "1":
                                // Display list customers use service
                                break;
                            case "2":
                                // Display list customers get voucher
                                break;
                            case "3":
                                //Return main menu
                                flag5 = false;
                                break;
                            default:
                                System.out.println("not a choice!");
                        }
                    } while (flag5);
                    break;
                case "0":
                    //exit
                    System.out.println("---------Ended-----------");
                    flag = false;
                    break;
                default:
                    System.out.println("not a choice!");
                    break;
            }
        } while (flag);
    }

}
