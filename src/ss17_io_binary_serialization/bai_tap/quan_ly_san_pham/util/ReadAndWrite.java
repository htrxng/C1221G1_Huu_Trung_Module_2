package ss17_io_binary_serialization.bai_tap.quan_ly_san_pham.util;

import ss17_io_binary_serialization.bai_tap.quan_ly_san_pham.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite   {
    public static List<Product> read(String path) {
        //hàm đọc vào bộ nhớ tạm
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
