package ss5_access_modifier_static_method_static_property.bai_tap.build_only_write_class;

public class Student {
    private String name = "Trung";
    private String classes = "C12";

    Student() {

    }

    Student(String n, String cl) {
        name = n;
        classes = cl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}