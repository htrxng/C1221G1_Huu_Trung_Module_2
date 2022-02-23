package ss6_inheritance.bai_tap.circle_cylinder_class;

public class Cylinder extends Circle {
    private double heigth;
    private double volumne;


    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double h) {
        this.heigth = h;
    }

    public double getVolumne() {
        return volumne;
    }

    public void setVolumne(double volumne) {
        this.volumne = volumne;
    }

    public double volumneCalculator() {
        return volumne = heigth * getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "heigth=" + heigth +
                ", volumne=" + volumne +
                '}';
    }
}
