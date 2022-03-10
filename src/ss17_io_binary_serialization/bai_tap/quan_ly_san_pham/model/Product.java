package ss17_io_binary_serialization.bai_tap.quan_ly_san_pham.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int productId;
    private String productName;
    private String manufacturer;
    private float price;
    private String anotherDescription;

    public Product() {
    }

    public Product(int productId, String productName, String manufacturer, float price, String anotherDescription) {
        this.productId = productId;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
        this.anotherDescription = anotherDescription;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAnotherDescription() {
        return anotherDescription;
    }

    public void setAnotherDescription(String anotherDescription) {
        this.anotherDescription = anotherDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", anotherDescription='" + anotherDescription + '\'' +
                '}';
    }
}
