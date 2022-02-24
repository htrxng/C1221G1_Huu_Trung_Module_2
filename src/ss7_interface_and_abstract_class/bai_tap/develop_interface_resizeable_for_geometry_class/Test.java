package ss7_interface_and_abstract_class.bai_tap.develop_interface_resizeable_for_geometry_class;

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        circle1.areaCalculator();
        System.out.println("Area Circle before resize = " + circle1.getArea());
        circle1.resize(Math.random() * (100 - 1 + 1) + 1);
        circle1.areaCalculator();
        System.out.println("Area Circle after resize = " + circle1.getArea());
        System.out.println("radius after resize= " + circle1.getRadius());
        System.out.println("\n");


        Square square1 = new Square(5);
        square1.areaCalculator();
        System.out.println("Area square before resize = " + square1.getAreaSquare());
        square1.resize(Math.random() * (100 - 1 + 1) + 1);
        square1.areaCalculator();
        System.out.println("area square after resize = " + square1.getAreaSquare());
        System.out.println("\n");


        Rectangle rectangle1 = new Rectangle(5, 10);
        rectangle1.areaCalculator();
        System.out.println("area rectangle before resize = " + rectangle1.getAreaRectangle());
        rectangle1.resize(Math.random() * (100 - 1 + 1) + 1);
        rectangle1.areaCalculator();
        System.out.println("area rectangle after resize= " + rectangle1.getAreaRectangle());


        
    }
}
