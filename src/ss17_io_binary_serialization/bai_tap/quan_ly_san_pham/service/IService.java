package ss17_io_binary_serialization.bai_tap.quan_ly_san_pham.service;

import ss17_io_binary_serialization.bai_tap.quan_ly_san_pham.model.Product;

public interface IService {
    void create(Product product);
    void delete(Product product);
    void display();
    void update();


}
