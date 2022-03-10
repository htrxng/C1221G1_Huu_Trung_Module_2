package ss17_io_binary_serialization.bai_tap.quan_ly_san_pham.service;

import ss17_io_binary_serialization.bai_tap.quan_ly_san_pham.model.Product;
import ss17_io_binary_serialization.bai_tap.quan_ly_san_pham.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements IService {
    List<Product> productList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    List<Product> productArrayListSearched = new ArrayList<>();
    public void search() {
        System.out.print("enter name product : ");
        String nameProduct = scanner.nextLine();
        List<Product> productDataFromFile1 = ReadAndWrite.read("ss17_io_binary_serialization\\bai_tap\\quan_ly_san_pham\\data\\productList.dat");
        for (Product product : productDataFromFile1) {
            if(product.getProductName().contains(nameProduct)) {
                productArrayListSearched.add(product);
            }
        }
        for (Product product : productArrayListSearched) {
            System.out.println(product);
        }
    }

    @Override
    public void create() {
        System.out.print("Enter product's id: ");
        int idProduct = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter product's name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter manufacturer: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Enter product's price: ");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.print("Enter anotherDescription: ");
        String description = scanner.nextLine();
        Product newProduct = new Product(idProduct,productName,manufacturer,price,description);
        productList.add(newProduct);
        ReadAndWrite.writeToFile("ss17_io_binary_serialization\\bai_tap\\quan_ly_san_pham\\data\\productList.dat", productList);
    }

    @Override
    public void delete() {
//        System.out.print("Enter product's ID want to delete: ");
//        int deleteId = Integer.parseInt(scanner.nextLine());
//        ReadAndWrite.writeToFile(PRODUCT_LIST_DAT);
    }

    @Override
    public void display() {
        List<Product> productDataFromFile = ReadAndWrite.read("ss17_io_binary_serialization\\bai_tap\\quan_ly_san_pham\\data\\productList.dat");
        for (Product product : productDataFromFile) {
            System.out.println(product);
        }
    }

    @Override
    public void edit() {
    }
}
