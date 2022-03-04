package ss12_java_collection_framework.bai_tap.luyen_tap_sd_arraylist_trong_jcf;

import java.util.*;

public class ProductManager {
    static ArrayList<Product> productArrayList = new ArrayList<Product>(10);
    Scanner scanner = new Scanner(System.in);

    public void addnewProduct() {
        System.out.println("enter id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("enter name of product");
        String productName  = scanner.nextLine();
        System.out.println("enter price of product");
        double price = Double.parseDouble(scanner.nextLine());
        Product newProduct = new Product(id,productName,price);
        productArrayList.add(newProduct);
    }

    public void editProduct() {
        System.out.println("enter product's id need edit");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        for (Product p : productArrayList
                ) {
            if(p.getId() == id) {
                System.out.println(p);
                System.out.println("choose infomation need edit \n "+
                        "1.edit product's name " +
                        "2.edit product's price" +
                        "3.exit");
                int choose = Integer.parseInt(scanner.nextLine());
                do {
                switch (choose) {
                    case 1:
                        //edit name
                        System.out.println("enter new productname: ");
                        String newProductName = scanner.nextLine();
                        p.setProductName(newProductName);
                        break;
                    case 2:
                        //edit price
                        System.out.println("enter new price");
                        double newPrice = Double.parseDouble(scanner.nextLine());
                        p.setPrice(newPrice);
                    case 3:
                        flag = false;
                        break;
                } } while (flag);
            }
        }
    }

    public void deleteProduct(){
        System.out.println("enter product's id need delete ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        System.out.println();
        for (Product p: productArrayList
             ) {
            if(p.getId()== id) {
                System.out.println("Delete " +  p);
                productArrayList.remove(p);
                System.out.println("successfully delete!");
                flag = true;
            }
        }
        if(!flag) {
        System.out.println("ID not exist");
        }
    }

    public void displayProductList() {
        System.out.println(" ----------------Product List----------");
        for (Product p: productArrayList
             ) {
            System.out.println(p);
        }
    }

    public void searchProduct() {
        System.out.print("Enter product's name:");
        String productName = scanner.nextLine();
        for (Product p : productArrayList
        ) {
          if(p.getProductName().contains(productName)) {
              System.out.println(p);
          }
        }System.out.println("not exist!");
    }

    public void arrangeAscendingtoPriceSmallToBig() {
        Collections.sort(productArrayList, new PriceProductComparatorSmallToBig());
        for (Product p: productArrayList
             ) {
            System.out.println(p);
        }
    }

    public void arrangeAscendingtoPriceBigToSmall () {
        Collections.sort(productArrayList, new PriceProductComparatorBigToSmall());
        for (Product p: productArrayList
        ) {
            System.out.println(p);
        }
    }
}
