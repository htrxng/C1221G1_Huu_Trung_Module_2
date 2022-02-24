package ss7_interface_and_abstract_class.bai_tap.develop_interface_resizeable_for_geometry_class;

public class Rectangle extends Shape implements Resizeable {
    private double height;
    private double width;
    private double areaRectangle;

    public Rectangle() {

    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getAreaRectangle() {
        return areaRectangle;
    }

    public void setAreaRectangle(double areaRectangle) {
        this.areaRectangle = areaRectangle;
    }

    public double areaCalculator() {
        return areaRectangle = this.width * this.height;
    }

    @Override
    public void resize(double percent) {
        this.height *= percent;
        this.width *= percent;
    }
}
