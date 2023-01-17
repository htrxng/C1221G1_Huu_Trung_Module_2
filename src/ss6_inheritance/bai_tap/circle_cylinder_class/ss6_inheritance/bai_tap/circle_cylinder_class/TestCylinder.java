package ss6_inheritance.bai_tap.circle_cylinder_class.ss6_inheritance.bai_tap.circle_cylinder_class;

public class TestCylinder {
    public static void main(String[] args) {
       Cylinder cylinder1 = new Cylinder();

        cylinder1.setRadius(5);
        cylinder1.areaCalculator();
        cylinder1.setHeigth(5);
        cylinder1.volumneCalculator();
        System.out.println(cylinder1);


       Circle circle1 = new Circle();

        circle1.setRadius(7);
        circle1.setColor("Grey");
        circle1.areaCalculator();
        System.out.println(circle1);
    }

}
