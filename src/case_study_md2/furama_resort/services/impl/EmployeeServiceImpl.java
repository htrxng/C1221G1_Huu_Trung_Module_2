package case_study_md2.furama_resort.services.impl;

import case_study_md2.furama_resort.models.Employee;
import case_study_md2.furama_resort.services.EmployeeService;
import case_study_md2.furama_resort.utils.ReadAndWriteFile;
import case_study_md2.furama_resort.utils.UserException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<Employee>();
    List<Employee> employeeListFounded = new ArrayList<Employee>();
    static Scanner scanner = new Scanner(System.in);
    final static String EMPLOYEE_SOURCE_FILE = "src\\case_study_md2\\furama_resort\\data\\employee.csv";

    public static List<Employee> getEmployeeList() {
        return employeeList;
    }

    public static void setEmployeeList(List<Employee> employeeList) {
        EmployeeServiceImpl.employeeList = employeeList;
    }

    static {
        // copy data từ file vào list.
        EmployeeServiceImpl.setEmployeeList(ReadAndWriteFile.readFileEmployee(EMPLOYEE_SOURCE_FILE));
    }

    final static String[] ACADEMY_LEVEL_LIST = {"High School", "Colleges", "University", "After University"};
    final static String[] POSITION_LIST = {"Receptionist", "Service", "Specialist", "Supervisor", "Manager", "Director"};

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
        try {
            int iDNumber = inputIdentityCardNumber();
            System.out.print("Enter phone number: ");
            String phone = scanner.nextLine();
            System.out.print("Enter email: ");
            String email = scanner.nextLine();
            System.out.print("----Academic level---- \n" +
                    "1.High School \n" +
                    "2.Colleges \n" +
                    "3.University \n" +
                    "4.After University \n" +
                    "Enter number: -----> ");
            int academicLevel = Integer.parseInt(scanner.nextLine());
            int position = inputPosition();
            double wage = inputWage();
            Employee newEmployee = new Employee(employeeCode, name, birthday, gender, iDNumber, phone, email, ACADEMY_LEVEL_LIST[academicLevel - 1], POSITION_LIST[position - 1], wage);
            employeeList.add(newEmployee);
            System.out.println("successfully added new " + newEmployee);
        } catch (UserException userException) {
            System.out.println(userException.getMessage());
        }
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
//                ReadAndWriteFile.readFile(EMPLOYEE_SOURCE_FILE)
        ) {
            System.out.println("=========Employee List=========");
            System.out.println(e);
        }
    }



    private int inputIdentityCardNumber() throws UserException {
        System.out.print("Enter identity card number: ");
        String iD = scanner.nextLine();
        if (!iD.matches("^[+]?\\d+$")) {
            throw new UserException("identity card number is invalid!, it must be a number!");
        }
        return Integer.parseInt(iD);
    }

    private double inputWage() throws UserException {
        System.out.print("Enter wage: ");
        String wage = scanner.nextLine();
        if (!wage.matches("^[+]?\\d+$")) {
            throw new UserException("Wage must be a number! ");
        }
        return Double.parseDouble(wage);
    }

    private int inputPosition() throws UserException {
        System.out.print("----Position List---- \n" +
                "1.Receptionist \n" +
                "2.Service \n" +
                "3.Specialist \n" +
                "4.Supervisor \n" +
                "5.Manager \n" +
                "6.Director \n" +
                "Enter number: ----> ");
        String choice = scanner.nextLine();
        if(!choice.matches("^[1-6]$")) {
            throw new UserException("Choice must be a number from 1 to 6! ");
        }
        return Integer.parseInt(choice);
    }

    //save data ~~ write to file
    public void saveToFile() {
        ReadAndWriteFile.writeFileEmployee(EMPLOYEE_SOURCE_FILE, EmployeeServiceImpl.getEmployeeList());
    }
}
