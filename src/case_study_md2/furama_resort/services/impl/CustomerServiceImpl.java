package case_study_md2.furama_resort.services.impl;

import case_study_md2.furama_resort.models.Customer;
import case_study_md2.furama_resort.services.CustomerService;
import case_study_md2.furama_resort.utils.ReadAndWriteFile;
import case_study_md2.furama_resort.utils.UserException;
import case_study_md2.furama_resort.utils.ValidateInputData;

import java.util.*;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    public static void setCustomerList(List<Customer> customerList) {
        CustomerServiceImpl.customerList = customerList;
    }

    List<Customer> customerListFounded = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);
    final static String CUSTOMER_SOURCE_FILE = "src\\case_study_md2\\furama_resort\\data\\customer.csv";
    final static String[] CUSTOMER_TYPE_LIST = {"Diamond", "Platinum", "Gold", "Silver", "Member"};

    static {
        //   copy data từ file vào list.
        CustomerServiceImpl.setCustomerList(ReadAndWriteFile.readFileCustomer(CUSTOMER_SOURCE_FILE));
    }

    private String gender;
    private String phone;
    private String email;
    private String address;

    @Override
    public void add() {
        String customerCode;
        do {
            System.out.print("sample: [C * * * *] /* is a number/ \n" +
                    "Enter customer Code: ");
            customerCode = scanner.nextLine();
            ValidateInputData.checkCustomerCode(customerCode);
        } while (!ValidateInputData.checkCustomerCode(customerCode));
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
        System.out.print("Enter identity card number: ");
        try {
            int iDNo = inputIdentityCardNumber();
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
            int customerType = chooseCustomerType();
            System.out.print("Enter address: ");
            address = scanner.nextLine();
            Customer newCustomer = new Customer(customerCode, name, birthday, gender, iDNo, phone, email, CUSTOMER_TYPE_LIST[customerType - 1], address);
            customerList.add(newCustomer);
            System.out.println("successfully added new " + newCustomer);
        } catch (UserException userException) {
            System.out.println(userException.getMessage());
        }
    }

    public List<Customer> search(String name) {
        customerListFounded.clear();
        for (Customer c : customerList
        ) {
            if (c.getName().contains(name)) {
                customerListFounded.add(c);
            }
        }
        return customerListFounded;
    }

    @Override
    public void edit() {
        System.out.print("enter customer name: ");
        String name = scanner.nextLine();
        search(name);
        if (customerListFounded.size() != 0) {
            for (Customer e : customerListFounded) {
                System.out.println(e);
            }
            System.out.print("enter customer code need edit: ");
            String cusCode = scanner.nextLine();
            for (Customer e : customerListFounded) {
                if (cusCode.equals(e.getCustomerCode())) {
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
                                    "7.Customer Type \n" +
                                    "8.Address \n" +
                                    "0.End update and exit \n" +
                                    "------->: ");
                            String choice = scanner.nextLine();
                            switch (choice) {
                                case "1":
                                    //
                                    System.out.print("enter new Customer's name: ");
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
                                                "enter new Gender: ");
                                        gender = scanner.nextLine();
                                        ValidateInputData.checkGender(gender);
                                    } while (!ValidateInputData.checkGender(gender));
                                    e.setGender(gender);
                                    break;
                                case "4":
                                    //
                                    int iDNo = inputIdentityCardNumber();
                                    e.setiDNo(iDNo);
                                    break;
                                case "5":
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
                                    do {
                                        System.out.print("email sample: [huutrung02@gmail.com] \n" +
                                                "Enter new email: ");
                                        email = scanner.nextLine();
                                        ValidateInputData.checkEmail(email);
                                    } while (!ValidateInputData.checkEmail(email));
                                    e.setEmail(email);
                                    break;
                                case "7":
                                    //
                                    System.out.print("choose new customer Type : ");
                                    int customerType = chooseCustomerType();
                                    e.setTypeOfCustomer(CUSTOMER_TYPE_LIST[customerType - 1]);
                                    break;
                                case "8":
                                    System.out.print("Enter new address: ");
                                    address = scanner.nextLine();
                                    e.setAddress(address);
                                case "0":
                                    //exit
                                    System.out.println("----------------End update processing---------- ");
                                    flag = false;
                                    break;
                                default:
                                    System.out.println("not a choice!");
                                    break;
                            }
                        } while (flag);
                    } catch (UserException userException) {
                        {
                            System.out.println(userException.getMessage());
                        }
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
        for (Customer c : customerList
        ) {
            System.out.println("=========Customer List ========");
            System.out.println(c);
        }
    }

    public int chooseCustomerType() throws UserException {
        System.out.print("Customer Type List \n" +
                "1.Diamond\n" +
                "2.Platinum\n" +
                "3.Gold\n" +
                "4.Silver\n" +
                "5.Member\n" +
                "Choose Type: ");
        String choice = scanner.nextLine();
        if (!choice.matches("^[1-5]$")) {
            throw new UserException("Choice must be a number from 1 to 5! ");
        }
        return Integer.parseInt(choice);
    }

    private int inputIdentityCardNumber() throws UserException {
        System.out.print("Enter identity card number: ");
        String iD = scanner.nextLine();
        if (!iD.matches("^[+]?\\d+$")) {
            throw new UserException("identity card number is invalid!, it must be a number!");
        }
        return Integer.parseInt(iD);
    }

    //save data ~~ write to file
    public void saveToFile() {
        ReadAndWriteFile.writeFileCustomer(CUSTOMER_SOURCE_FILE, CustomerServiceImpl.getCustomerList());
    }
}
