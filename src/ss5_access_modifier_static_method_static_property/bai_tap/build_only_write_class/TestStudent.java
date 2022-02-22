package ss5_access_modifier_static_method_static_property.bai_tap.build_only_write_class;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setClasses("C1221G1");
        student1.setName("Hữu Trung");
        System.out.println("Name: " + student1.getName() );
        System.out.println("Class: " + student1.getClasses() );

        Student student2 = new Student("12A9","TVHT");
        System.out.println("Name: "+ student2.getName());
    }
}
