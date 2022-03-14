package ss17_io_binary_serialization.bai_tap.quan_ly_san_pham.controller;

import ss17_io_binary_serialization.bai_tap.quan_ly_san_pham.model.Product;
import ss17_io_binary_serialization.bai_tap.quan_ly_san_pham.service.ProductServiceImpl;
import ss17_io_binary_serialization.bai_tap.quan_ly_san_pham.util.ReadAndWrite;

import java.util.List;
import java.util.Scanner;

public class ControllerService {
    final static String PRODUCT_SOURCE_FILE = "src\\ss17_io_binary_serialization\\bai_tap\\quan_ly_san_pham\\data\\productList.dat";
    static ProductServiceImpl productService = new ProductServiceImpl();
    static Scanner scanner = new Scanner(System.in);

    static {
        productService.setProductList(ReadAndWrite.read(PRODUCT_SOURCE_FILE));
    }

    public void controlProductService() {
        boolean flag = true;
        do {
            System.out.println("Menu \n" +
                    "1.Add Product \n" +
                    "2.Display Product List \n" +
                    "3.Search Product Information \n" +
                    "4.Update Product \n" +
                    "5.Delete Product \n" +
                    "6.Save Data \n" +
                    "0.Exit \n" +
                    "-----------------------\n");
            System.out.print("please choose function: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    //create
                    addNewProduct();
                    break;
                case 2:
                    //display
                    displayProduct();
                    break;
                case 3:
                    //search
                    searchProduct();
                    break;
                case 4:
                    //update function is being developing...
                    break;
                case 5:
                    //delete
                    deleteProduct();
                    break;
                case 6:
                    //save date
                    saveToFile();
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

    public void saveToFile() {
        ReadAndWrite.writeToFile(PRODUCT_SOURCE_FILE, productService.getProductList());
    }

    public void addNewProduct() {
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
        Product newProduct = new Product(idProduct, productName, manufacturer, price, description);
        productService.create(newProduct);
        System.out.println("successfully added!");
    }

    public void searchProduct() {
        System.out.print("enter name product : ");
        String nameProduct = scanner.nextLine();
        List<Product> result = productService.search(nameProduct);
        for (Product product : result) {
            System.out.println(product);
        }
    }

    public void displayProduct() {
        productService.display();
    }

    public void deleteProduct() {
        searchProduct();
        System.out.print("Please Enter Product's ID: ");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (Product product : productService.getProductList()) {
            if (product.getProductId() == idDelete) {
                System.out.println(product);
                System.out.println("Continue delete?");
                System.out.println("Y or N");
                String choice = scanner.nextLine().toUpperCase();
                if ("N".equals(choice)) {
                    break;
                } else if ("Y".equals(choice)) {
                    productService.delete(product);
                    break;
                }
            }
        }
    }
}
