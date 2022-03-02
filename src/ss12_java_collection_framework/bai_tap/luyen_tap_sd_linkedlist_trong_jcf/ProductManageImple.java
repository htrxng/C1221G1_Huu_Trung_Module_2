package ss12_java_collection_framework.bai_tap.luyen_tap_sd_linkedlist_trong_jcf;

import ss12_java_collection_framework.bai_tap.luyen_tap_sd_arraylist_trong_jcf.ProductManager;

import java.util.Scanner;

public class ProductManageImple {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("-----Product Manager----- \n" +
                    "1.Add new product\n" +
                    "2.Edit product\n" +
                    "3.Delete\n" +
                    "4.Display Product\n" +
                    "5.Search Product \n" +
                    "6.Arrange small to big \n " +
                    "6.Arrange big to small \n " +
                    "0.exit \n ");
            System.out.println("choose function");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    // add
                    productManager.addnewProduct();
                    break;
                case 2:
                    //edit
                    productManager.editProduct();
                    break;
                case 3:
                    //delete
                    productManager.deleteProduct();
                    break;
                case 4:
                    //display
                    productManager.displayProductList();
                    break;
                case 5:
                    //search
                    productManager.searchProduct();
                    break;
                case 6:
                    //arrange
                    productManager.arrangeAscendingtoPriceSmallToBig();
                    break;
                case 7:
                    productManager.arrangeAscendingtoPriceBigToSmall();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("not a choice!");
            }
        } while (flag);
    }
}
