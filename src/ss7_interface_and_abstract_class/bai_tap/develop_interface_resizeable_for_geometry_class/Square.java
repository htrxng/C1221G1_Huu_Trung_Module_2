package ss7_interface_and_abstract_class.bai_tap.develop_interface_resizeable_for_geometry_class;

public class Square extends Shape implements Resizeable {
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

    public double getAreaSquare() {
        return areaSquare;
    }

    public void setAreaSquare(double areaSquare) {
        this.areaSquare = areaSquare;
    }

    public double areaCalculator() {
        return areaSquare = this.edge * this.edge;
    }

    @Override
    public void resize(double percent) {
        this.edge *= percent;
    }
}
