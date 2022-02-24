package ss6_inheritance.bai_tap.point_2d_point_3d_class;

public class TestPoint2D3D {
    public static void main(String[] args) {
        Point2D point2DI = new Point2D();
        point2DI.setXY(5, 10);
        point2DI.getXY();
        System.out.println(point2DI);

        Point3D point3DI = new Point3D();
        point3DI.setXYZ(15, 20, 25);
        point3DI.getXYZ();
        System.out.println(point3DI);
    }
}
