package ss5_access_modifier_static_method_static_property.bai_tap.manger_student;

import ss10_dsa_danh_sach.bai_tap.array_list.Student;

import java.util.Scanner;

public class StudentManager {
    private static Student[] students = new Student[100];

    static {
        students[0] = new Student(1, "Trung", "18-8", "c12");
        students[1] = new Student(2, "Trọng", "1-8", "c12");
        students[2] = new Student(3, "Trường", "3-8", "c12");
        students[3] = new Student(4, "Trịnh", "6-8", "c12");
    }

    public void showListStudent() {
        for (Student s : students) {
            if (s != null) {
                System.out.println(s);
            } else {
                break;
            }
        }
    }

    public void add(String name, String birthday, String classname) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                index = i;
                break;
            }
        }
        students[index] = new Student(index + 1, name, birthday, classname);
    }

    public void edit(int id) {
            int indexEdit = -1;
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < students.length; i++) {
                if (students[i].getId() == id) {
                    indexEdit = i;
                    break;
                }
            }
            System.out.println("student " + students[indexEdit]);
            int edit = -1;
            do {
                System.out.println("choose infor need edit: \n" +
                        "1. edit name\n" +
                        "2. edit birthday\n" +
                        "3. edit classname\n" +
                        "4. exit"
                );
                edit = Integer.parseInt(scanner.nextLine());
                switch (edit) {
                    case 1:
                        System.out.println("Enter New Name: ");
                        String name = scanner.nextLine();
                        students[indexEdit].setName(name);
                        showListStudent();
                        break;
                    case 2:
                        System.out.println("Enter New Birthday: ");
                        String birthday = scanner.nextLine();
                        students[indexEdit].setBirthday(birthday);
                        showListStudent();
                        break;
                    case 3:
                        System.out.println("enter new class: ");
                        String newclass = scanner.nextLine();
                        students[indexEdit].setClassname(newclass);
                        showListStudent();
                        break;
                    default:
                        System.out.println("not a choice!");
                        break;
                }
            } while (edit != 4);
    }
}
