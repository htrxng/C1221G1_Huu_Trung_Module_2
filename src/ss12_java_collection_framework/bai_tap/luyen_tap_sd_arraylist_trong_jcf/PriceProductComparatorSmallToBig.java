package ss12_java_collection_framework.bai_tap.luyen_tap_sd_arraylist_trong_jcf;

import java.util.Comparator;

public class PriceProductComparatorSmallToBig implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}

