package case_study_md2.furama_resort.services.impl;

import case_study_md2.furama_resort.models.Customer;
import case_study_md2.furama_resort.services.CustomerService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static List<Customer> customerList = new LinkedList<>();
    List<Customer> customerListFounded = new ArrayList<>();
    static String[] customerTypeList = {"Diamond","Platinum","Gold","Silver","Member"};
    static Scanner scanner = new Scanner(System.in);
    static {
        Customer customer1  = new Customer("Tom","1991","Male",191911410,"0519151111","tommysheldby@gmail.com","Vip1","Diamond","Birmingham");
        Customer customer2  = new Customer("Grace","1995","FeMale",191911140,"0519111232111","grace@gmail.com","Vip2","Diamond","London");
        Customer customer3  = new Customer("Polly","1890","FeMale",19515110,"0141414156","polly@gmail.com","Vip3","Diamond","Birmingham");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
    }
    @Override
    public void add() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Birthday: ");
        String birthday = scanner.nextLine();
        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter identity card number: ");
        int iDNo =Integer.parseInt(scanner.nextLine());
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter email: ");
        String email= scanner.nextLine();
        System.out.print("Enter customer code: ");
        String customerCode = scanner.nextLine();
        String customerType = chooseCustomerType(); //choose customerType
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        Customer newCustomer = new Customer(name,birthday,gender,iDNo,phone,email,customerCode,customerType,address);
        customerList.add(newCustomer);
        System.out.println("successful add!");
    }

    public List<Customer> search(String name) {
        customerListFounded.clear();
        for (Customer c: customerList
             ) {
            if(c.getName().contains(name)){
                customerListFounded.add(c);
            }
        }
        return customerListFounded;
    }
    @Override
    public void edit() {
        System.out.print("enter customer name: ");
        String name = scanner.nextLine();
        System.out.println(search(name));
    }

    @Override
    public void display() {
        for (Customer c: customerList
             ) {
            System.out.println("=========Customer List ========");
            System.out.println(c);
        }
    }
    public String chooseCustomerType() {
        String customerType = null;
        System.out.print("Customer Type List \n" +
                "1.Diamond\n" +
                "2.Platinum\n" +
                "3.Gold\n" +
                "4.Silver\n" +
                "5.Member\n"+
                "Choose Type: ");
        int choose = Integer.parseInt(scanner.nextLine());
         return customerTypeList[choose-1];
    }
}
