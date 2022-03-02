package ss12_java_collection_framework.bai_tap.luyen_tap_sd_linkedlist_trong_jcf;

import ss12_java_collection_framework.bai_tap.luyen_tap_sd_arraylist_trong_jcf.Product;

import java.util.Comparator;

public class PriceProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
