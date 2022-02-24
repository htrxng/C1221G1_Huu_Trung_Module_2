package ss7_interface_and_abstract_class.bai_tap.develop_interface_colorable_for_geometry_class;

public class Square extends Shape implements Colorable {
    private double edge;
    private double areaSquare;

    public Square() {

    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return areaSquare;
    }

    @Override
    public void areaCalculator() {
        areaSquare = this.edge * this.edge;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
