package case_study_md2.furama_resort.services.impl;

import case_study_md2.furama_resort.models.Customer;
import case_study_md2.furama_resort.services.CustomerService;
import case_study_md2.furama_resort.utils.ReadAndWriteFile;

import java.util.*;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    List<Customer> customerListFounded = new ArrayList<>();
    static String[] customerTypeList = {"Diamond", "Platinum", "Gold", "Silver", "Member"};
    static Scanner scanner = new Scanner(System.in);
    final static String CUSTOMER_SOURCE_FILE = "src\\case_study_md2\\furama_resort\\data\\customer.csv";

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    public static void setCustomerList(List<Customer> customerList) {
        CustomerServiceImpl.customerList = customerList;
    }

    static {
        //   copy data từ file vào list.
        CustomerServiceImpl.setCustomerList(ReadAndWriteFile.readFileCustomer(CUSTOMER_SOURCE_FILE));
    }

    //    static {
//        Customer customer1 = new Customer("Tom", "1991", "Male", 191911410, "0519151111", "tommysheldby@gmail.com", "Vip1", "Diamond", "Birmingham");
//        Customer customer2 = new Customer("Grace", "1995", "FeMale", 191911140, "0519111232111", "grace@gmail.com", "Vip2", "Diamond", "London");
//        Customer customer3 = new Customer("Polly", "1890", "FeMale", 19515110, "0141414156", "polly@gmail.com", "Vip3", "Diamond", "Birmingham");
//        customerList.add(customer1);
//        customerList.add(customer2);
//        customerList.add(customer3);
//    }

    @Override
    public void add() {
        System.out.print("Enter customer code: ");
        String customerCode = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Birthday: ");
        String birthday = scanner.nextLine();
        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter identity card number: ");
        int iDNo = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        String customerType = chooseCustomerType(); //choose customerType
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        Customer newCustomer = new Customer(customerCode,name, birthday, gender, iDNo, phone, email, customerType, address);
        customerList.add(newCustomer);
        System.out.println("successfully added new "+ newCustomer);
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
        if (search(name).size() != 0) {
            for (Customer e : search(name)
            ) {
                System.out.println(e);
            }
            System.out.print("enter customer code need edit: ");
            String cusCode = scanner.nextLine();
            for (Customer e : search(name)
            ) {
                if (cusCode.equals(e.getCustomerCode())) {
                    System.out.println(e);
                    boolean flag = true;
                    do {
                        System.out.print("choose information need update: \n" +
                                "1.Name \n" +
                                "2.Birthday \n" +
                                "3.Gender \n" +
                                "4.Identity Card Number \n" +
                                "5.Phone \n" +
                                "6.Email \n" +
                                "7.Customer Code \n" +
                                "8.Customer Type \n" +
                                "9.Address \n" +
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
                                //
                                System.out.print("enter new Gender: ");
                                String gender = scanner.nextLine();
                                if (!gender.equals("")) {
                                    e.setGender(gender);
                                }
                                break;
                            case "4":
                                //
                                System.out.print("enter new Identity Card Number: ");
                                int iDNo = Integer.parseInt(scanner.nextLine());
                                e.setiDNo(iDNo);
                                break;
                            case "5":
                                //
                                System.out.print("enter new phone: ");
                                String phone = scanner.nextLine();
                                if (!phone.equals("")) {
                                    e.setPhoneNumber(phone);
                                }
                                break;
                            case "6":
                                //
                                System.out.print("enter new email: ");
                                String email = scanner.nextLine();
                                if (!email.equals("")) {
                                    e.setEmail(email);
                                }
                                break;
                            case "7":
                                //
                                System.out.print("enter new Customer's Code : ");
                                String customerCode = scanner.nextLine();
                                if (!customerCode.equals("")) {
                                    e.setCustomerCode(customerCode);
                                }
                                break;
                            case "8":
                                //
                                System.out.println("choose new customerCode Type : ");
                                String customerType = chooseCustomerType();
                                if (!customerType.equals("")) {
                                    e.setTypeOfCustomer(customerType);
                                }
                                break;
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

    public String chooseCustomerType() {
//        String customerType = null;
        System.out.print("Customer Type List \n" +
                "1.Diamond\n" +
                "2.Platinum\n" +
                "3.Gold\n" +
                "4.Silver\n" +
                "5.Member\n" +
                "Choose Type: ");
        int choose = Integer.parseInt(scanner.nextLine());
        return customerTypeList[choose - 1];
    }

    //save data ~~ write to file
    public void saveToFile() {
        ReadAndWriteFile.writeFileCustomer(CUSTOMER_SOURCE_FILE,CustomerServiceImpl.getCustomerList());
    }
}
