package ss10_dsa_danh_sach.bai_tap.array_list;

public class TestMyList {
    public static void main(String[] args) {
        Student trung = new Student(1,"trung","18","c12");
        Student Khoa = new Student(2,"Khoa","1","c12");
        Student toan = new Student(3,"toan","14","c12");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(trung);
        studentMyList.add(trung);
        studentMyList.add(Khoa);
        studentMyList.add(toan);

        System.out.println(studentMyList.indexOf(trung));
        System.out.println(studentMyList.get(3));
    }
}
