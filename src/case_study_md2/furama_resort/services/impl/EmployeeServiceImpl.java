package case_study_md2.furama_resort.services.impl;

import case_study_md2.furama_resort.models.Customer;
import case_study_md2.furama_resort.models.Employee;
import case_study_md2.furama_resort.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<Employee>();
    List<Employee> employeeListFounded = new ArrayList<Employee>();
    static Scanner scanner = new Scanner(System.in);

    static {
        Employee employee1 = new Employee("E1", "NV1", "1/1/1990", "Male", 191912314, "0905999555", "nv2faa@gmail.com", "University", "Manage", 1000);
        Employee employee2 = new Employee("E2", "NV2", "1/1/1995", "Male", 192012411, "0905999888", "fassafsa@gmail.com", "University", "Technical", 700);
        Employee employee3 = new Employee("E3", "NV3", "1/1/1999", "Female", 19199441, "0905999666", "xaayyya@gmail.com", "University", "Fresher", 300);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
    }

    @Override
    public void add() {
        System.out.print("Enter Employee Code: ");
        String employeeCode = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Birthday: ");
        String birthday = scanner.nextLine();
        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter identity card number: ");
        int iDNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter academic level: ");
        String academicLevel = scanner.nextLine();
        System.out.print("Enter position: ");
        String position = scanner.nextLine();
        System.out.print("Enter wage: ");
        double wage = Double.parseDouble(scanner.nextLine());
        Employee newEmployee = new Employee(employeeCode, name, birthday, gender, iDNumber, phone, email, academicLevel, position, wage);
        employeeList.add(newEmployee);
        System.out.println("successfully added new "+ newEmployee);
    }

    public List<Employee> search(String name) {
        employeeListFounded.clear();
        for (Employee e : employeeList
        ) {
            if (e.getName().contains(name)) {
                employeeListFounded.add(e);
            }
        }
        return employeeListFounded;
    }

    @Override
    public void edit() {
        System.out.print("enter employee name: ");
        String name = scanner.nextLine();
        if (search(name).size() != 0) {
            for (Employee e : search(name)
            ) {
                System.out.println(e);
            }
            System.out.print("enter employee code need edit: ");
            String employeeCode = scanner.nextLine();
            for (Employee e : search(name)
            ) {
                if (employeeCode.equals(e.getEmployeeCode())) {
                    System.out.println(e);
                    boolean flag = true;
                    do {
                        System.out.print("choose information need update: \n" +
                                "1.Employee Code \n" +
                                "2.Name \n" +
                                "3.Birthday \n" +
                                "4.Gender \n" +
                                "5.Identity Card Number \n" +
                                "6.Phone \n" +
                                "7.Email \n" +
                                "8.Academic Level \n" +
                                "9.Position \n" +
                                "10.Wage \n" +
                                "0.End update and exit \n" +
                                "------->: ");
                        String choice = scanner.nextLine();
                        switch (choice) {
                            case "1":
                                //
                                System.out.print("enter new Employee Code: ");
                                String newEmployeeCode = scanner.nextLine();
                                if (!newEmployeeCode.equals("")) {
                                    e.setEmployeeCode(newEmployeeCode);
                                }
                                break;
                            case "2":
                                //
                                System.out.print("enter new Name: ");
                                String newName = scanner.nextLine();
                                if (!newName.equals("")) {
                                    e.setName(newName);
                                }
                                break;
                            case "3":
                                //
                                System.out.print("enter new Birthday: ");
                                String birthday = scanner.nextLine();
                                if (!birthday.equals("")) {
                                    e.setBirthday(birthday);
                                }
                                break;
                            case "4":
                                //
                                System.out.print("enter new Gender: ");
                                String gender = scanner.nextLine();
                                if (!gender.equals("")) {
                                    e.setGender(gender);
                                }
                                break;
                            case "5":
                                //
                                System.out.print("enter new Identity Card Number: ");
                                int iDNo = Integer.parseInt(scanner.nextLine());
                                e.setiDNo(iDNo);
                                break;
                            case "6":
                                //
                                System.out.print("enter new phone: ");
                                String phone = scanner.nextLine();
                                if (!phone.equals("")) {
                                    e.setPhoneNumber(phone);
                                }
                                break;
                            case "7":
                                //
                                System.out.print("enter new email: ");
                                String email = scanner.nextLine();
                                if (!email.equals("")) {
                                    e.setEmail(email);
                                }
                                break;
                            case "8":
                                //
                                System.out.print("enter new Academic Level : ");
                                String academicLevel = scanner.nextLine();
                                if (!academicLevel.equals("")) {
                                    e.setAcademicLevel(academicLevel);
                                }
                                break;
                            case "9":
                                //
                                System.out.print("enter new Position : ");
                                String position = scanner.nextLine();
                                if (!position.equals("")) {
                                    e.setPosition(position);
                                }
                                break;
                            case "10":
                                //
                                System.out.print("enter new wage : ");
                                double wage = Double.parseDouble(scanner.nextLine());
                                e.setWage(wage);
                                break;
                            case "0":
                                //exit
                                System.out.println("-End update processing- ");
                                flag = false;
                                break;
                            default:
                                System.out.println("not a choice!");
                        }
                    } while (flag);
                    System.out.println(e);
                    break;
                }
            }
        } else {
            System.out.println("this name is not exist!");
        }
    }

    @Override
    public void display() {
        for (Employee e : employeeList
        ) {
            System.out.println("=========Employee List=========");
            System.out.println(e);
        }
    }
}
