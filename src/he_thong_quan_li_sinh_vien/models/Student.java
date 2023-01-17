package he_thong_quan_li_sinh_vien.models;

public class Student extends Person {
    private int classCode;

    public Student(int code, String name, String birthday, String gender, String phoneNumber, int classCode) {
        super(code, name, birthday, gender, phoneNumber);
        this.classCode = classCode;
    }

    public Student(int classCode) {
        this.classCode = classCode;
    }

    public int getClassCode() {
        return classCode;
    }

    public void setClassCode(int classCode) {
        this.classCode = classCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "classCode=" + classCode +
                '}';
    }
    public String getInformationToCsv() {
        return super.getInformationToCsv() + "," + classCode;
    }
}
