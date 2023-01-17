package he_thong_quan_li_sinh_vien.models;

public class Teacher  extends  Person{
    public Teacher(int code, String name, String birthday, String gender, String phoneNumber) {
        super(code, name, birthday, gender, phoneNumber);
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
