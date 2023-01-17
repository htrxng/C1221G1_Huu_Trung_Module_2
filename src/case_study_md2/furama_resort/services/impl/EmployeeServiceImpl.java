package case_study_md2.furama_resort.services.impl;

import case_study_md2.furama_resort.models.Employee;
import case_study_md2.furama_resort.services.EmployeeService;
import case_study_md2.furama_resort.utils.ReadAndWriteFile;
import case_study_md2.furama_resort.utils.UserException;
import case_study_md2.furama_resort.utils.ValidateInputData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<Employee>();

    public static List<Employee> getEmployeeList() {
        return employeeList;
    }

    public static void setEmployeeList(List<Employee> employeeList) {
        EmployeeServiceImpl.employeeList = employeeList;
    }

    List<Employee> employeeListFounded = new ArrayList<Employee>();
    static Scanner scanner = new Scanner(System.in);
    final static String EMPLOYEE_SOURCE_FILE = "src\\case_study_md2\\furama_resort\\data\\employee.csv";
    final static String[] ACADEMY_LEVEL_LIST = {"High School", "Colleges", "University", "After University"};
    final static String[] POSITION_LIST = {"Receptionist", "Service", "Specialist", "Supervisor", "Manager", "Director"};

    static {
        // copy data từ file vào list.
        EmployeeServiceImpl.setEmployeeList(ReadAndWriteFile.readFileEmployee(EMPLOYEE_SOURCE_FILE));
    }

    private String email;
    private String phone;
    private String gender;

    @Override
    public void add() {
        String employeeCode;
        do {
            System.out.print("[E * * * *] /* is a number/ \n" +
                    "Enter Employee Code: ");
            employeeCode = scanner.nextLine();
            ValidateInputData.checkEmployeeCode(employeeCode);
        } while (!ValidateInputData.checkEmployeeCode(employeeCode));
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Birthday: ");
        String birthday = scanner.nextLine();
        do {
            System.out.print("Gender includes [Male,Female,Others] \n" +
                    "Enter Gender: ");
            gender = scanner.nextLine();
            ValidateInputData.checkGender(gender);
        } while (!ValidateInputData.checkGender(gender));
        try {
            int iDNumber = inputIdentityCardNumber();
            do {
                System.out.print("Phone start with 0 and total 10 numbers \n" +
                        "phone sample : 0123456789 \n" +
                        "Enter phone number: ");
                phone = scanner.nextLine();
                ValidateInputData.checkPhone(phone);
            } while (!ValidateInputData.checkPhone(phone));
            do {
                System.out.print("email sample: [huutrung02@gmail.com] \n" +
                        "Enter email: ");
                email = scanner.nextLine();
                ValidateInputData.checkEmail(email);
            } while (!ValidateInputData.checkEmail(email));
            int academicLevel = inputAcademicLevel();
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
        search(name);
        if (employeeListFounded.size() != 0) {
            for (Employee e : employeeListFounded) {
                System.out.println(e);
            }
            System.out.print("enter employee code need edit: ");
            String employeeCode = scanner.nextLine();
            for (Employee e : employeeListFounded) {
                if (employeeCode.equals(e.getEmployeeCode())) {
                    System.out.println(e);
                    boolean flag = true;
                    try {
                        do {
                            System.out.print("choose information need update: \n" +
                                    "1.Name \n" +
                                    "2.Birthday \n" +
                                    "3.Gender \n" +
                                    "4.Identity Card Number \n" +
                                    "5.Phone \n" +
                                    "6.Email \n" +
                                    "7.Academic Level \n" +
                                    "8.Position \n" +
                                    "9.Wage \n" +
                                    "0.End update and exit \n" +
                                    "------->: ");
                            String choice = scanner.nextLine();
                            switch (choice) {
                                case "1":
                                    //
                                    System.out.print("enter new Name: ");
                                    String newName = scanner.nextLine();
                                    if (!newName.equals("")) {
                                        e.setName(newName);
                                    }
                                    break;
                                case "2":
                                    //
                                    System.out.print("enter new Birthday: ");
                                    String birthday = scanner.nextLine();
                                    if (!birthday.equals("")) {
                                        e.setBirthday(birthday);
                                    }
                                    break;
                                case "3":
                                    do {
                                        System.out.print("Gender includes [Male,Female,Others] \n" +
                                                "Enter Gender: ");
                                        gender = scanner.nextLine();
                                        ValidateInputData.checkGender(gender);
                                    } while (!ValidateInputData.checkGender(gender));
                                    e.setGender(gender);
                                    break;
                                case "4":
                                    System.out.print("enter new Identity Card Number: ");
                                    int iDNo = inputIdentityCardNumber();
                                    e.setiDNo(iDNo);
                                    break;
                                case "5":
                                    //
                                    do {
                                        System.out.print("Phone start with 0 and total 10 numbers \n" +
                                                "phone sample : 0123456789 \n" +
                                                "Enter new phone number: ");
                                        phone = scanner.nextLine();
                                        ValidateInputData.checkPhone(phone);
                                    } while (!ValidateInputData.checkPhone(phone));
                                    e.setPhoneNumber(phone);
                                    break;
                                case "6":
                                    //
                                    do {
                                        System.out.print("email sample: [huutrung02@gmail.com] \n" +
                                                "Enter email: ");
                                        email = scanner.nextLine();
                                        ValidateInputData.checkEmail(email);
                                    } while (!ValidateInputData.checkEmail(email));
                                    e.setEmail(email);
                                    break;
                                case "7":
                                    //
                                    int academicLevel = inputAcademicLevel();
                                    e.setAcademicLevel(ACADEMY_LEVEL_LIST[academicLevel - 1]);
                                    break;
                                case "8":
                                    //
                                    int position = inputPosition();
                                    e.setPosition(POSITION_LIST[position - 1]);
                                    break;
                                case "9":
                                    //
                                    double wage = inputWage();
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
                    } catch (UserException userException) {
                        System.out.println(userException.getMessage());
                    }
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
        for (Employee e : employeeList) {
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
        if (!choice.matches("^[1-6]$")) {
            throw new UserException("Choice must be a number from 1 to 6! ");
        }
        return Integer.parseInt(choice);
    }

    private int inputAcademicLevel() throws UserException {
        System.out.print("----Academic level---- \n" +
                "1.High School \n" +
                "2.Colleges \n" +
                "3.University \n" +
                "4.After University \n" +
                "Enter number: -----> ");
        String choice = scanner.nextLine();
        if (!choice.matches("^[1-4]$")) {
            throw new UserException("Choice must be a number from 1 to 4! ");
        }
        return Integer.parseInt(choice);
    }

    //save data ~~ write to file
    public void saveToFile() {
        ReadAndWriteFile.writeFileEmployee(EMPLOYEE_SOURCE_FILE, EmployeeServiceImpl.getEmployeeList());
    }
}
