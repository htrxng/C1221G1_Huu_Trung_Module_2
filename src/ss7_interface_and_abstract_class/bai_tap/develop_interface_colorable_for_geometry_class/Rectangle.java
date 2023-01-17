package ss7_interface_and_abstract_class.bai_tap.develop_interface_colorable_for_geometry_class;

public  class Rectangle {
    private double height;
    private double width;
    private double areaRectangle;

    public Rectangle() {

    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

//    @Override
//    public String getName() {
//        return "Rectangle";
//    }
//
//    @Override
//    public double getArea() {
//        return areaRectangle;
//    }
//
//    @Override
//    public void areaCalculator() {
//    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", areaRectangle=" + areaRectangle +
                '}';
    }
}
