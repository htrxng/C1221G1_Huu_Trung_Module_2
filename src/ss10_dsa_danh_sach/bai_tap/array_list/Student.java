package ss10_dsa_danh_sach.bai_tap.array_list;

public class Student {
    private int id;
    private String name;
    private String birthday;
    private String classname;
    static String school = "Codegym";

    public Student() {

    }

    public Student(int id, String name, String birthday, String classname) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.classname = classname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", classname='" + classname + '\'' +
                '}';
    }
}
