package ss7_interface_and_abstract_class.bai_tap.develop_interface_resizeable_for_geometry_class;

public class Circle extends Shape implements Resizeable {
    private double radius;
    private double areaCircle;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return areaCircle;
    }

    public void setAreaCircle(double areaCircle) {
        this.areaCircle = areaCircle;
    }

    public double areaCalculator() {
        return areaCircle = this.radius * this.radius * 3.14;
    }

    @Override
    public void resize(double percent) {
        this.radius *= percent;
    }
}
