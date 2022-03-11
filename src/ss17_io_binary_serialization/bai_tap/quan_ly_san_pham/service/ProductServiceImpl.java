package ss17_io_binary_serialization.bai_tap.quan_ly_san_pham.service;

import ss17_io_binary_serialization.bai_tap.quan_ly_san_pham.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IService {
    private List<Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> search(String productName) {
        List<Product> productListSearched = new ArrayList<>();
        for (Product p : productList
        ) {
            if (p.getProductName().contains(productName)) {
                productListSearched.add(p);
            }
        }
        return productListSearched;
    }

    @Override
    public void create(Product product) {
        productList.add(product);
    }

    @Override
    public void delete(Product product) {
        productList.remove(product);
        System.out.println("successful delete!");
    }

    @Override
    public void display() {
        for (Product product : productList
        ) {
            System.out.println(product);
        }
    }

    @Override
    public void update() {

    }
}
