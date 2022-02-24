package ss7_interface_and_abstract_class.thuc_hanh.develope_interface_comparator_class_to_compare_geometry_class;

import ss6_inheritance.thuc_hanh.Circle;
import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
