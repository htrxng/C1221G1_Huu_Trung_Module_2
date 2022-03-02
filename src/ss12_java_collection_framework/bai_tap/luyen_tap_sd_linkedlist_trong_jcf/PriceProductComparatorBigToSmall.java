package ss12_java_collection_framework.bai_tap.luyen_tap_sd_linkedlist_trong_jcf;

import ss12_java_collection_framework.bai_tap.luyen_tap_sd_arraylist_trong_jcf.Product;

import java.util.Comparator;

public class PriceProductComparatorBigToSmall implements Comparator<ss12_java_collection_framework.bai_tap.luyen_tap_sd_arraylist_trong_jcf.Product> {
    @Override
    public int compare(ss12_java_collection_framework.bai_tap.luyen_tap_sd_arraylist_trong_jcf.Product o1, Product o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}
