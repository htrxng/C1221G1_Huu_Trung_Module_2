package he_thong_quan_li_sinh_vien.service.imp;

import case_study_md2.furama_resort.services.impl.EmployeeServiceImpl;

import he_thong_quan_li_sinh_vien.models.Student;
import he_thong_quan_li_sinh_vien.service.StudentService;
import he_thong_quan_li_sinh_vien.utils.NotFoundStudentException;
import he_thong_quan_li_sinh_vien.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {
    private static List<Student> studentList = new ArrayList<Student>();
    List<Student> studentListSearched = new ArrayList<>();

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static void setStudentList(List<Student> studentList) {
        StudentServiceImpl.studentList = studentList;
    }

    static Scanner scanner = new Scanner(System.in);
    final static String STUDENT_SOURCE_FILE = "src\\he_thong_quan_li_sinh_vien\\data\\Students.csv";

    static {
        // copy data từ file vào list.
        StudentServiceImpl.setStudentList(ReadAndWriteFile.readFileStudent(STUDENT_SOURCE_FILE));
    }

    @Override
    public void add() {
        int studentCode;
        if(studentList.isEmpty()) {
            studentCode = 1;
        } else {
            studentCode = studentList.size() + 1;
        }
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter birthday: ");
        String birthday = scanner.nextLine();
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter class Code: ");
        int classCode = Integer.parseInt(scanner.nextLine());
        Student newStudent = new Student(studentCode,name,birthday,gender,phone,classCode);
        studentList.add(newStudent);
        System.out.println("Successfully added new student " + newStudent);
    }

    @Override
    public void delete() {
        String check;
        int tempCode = 0;
        try {
            int studentCode = inputStudentCode();
            for (Student s : studentList
            ) {
                if (s.getCode() == studentCode) {
                    System.out.println(s);
                    tempCode = studentCode;
                    break;
                }
            }
            System.out.print("Do you want delete this student? (Y/N): ");
            check = scanner.nextLine();
            if(check.equals("Y")) {
                studentList.remove(tempCode-1);
                System.out.println("Successfully delete student!");
                display();
            } else if(check.equals("N")) {
                System.out.println("Not delete!");
            }
        } catch (NotFoundStudentException notFoundStudentException) {
            System.out.println(notFoundStudentException.getMessage());
        }
    }
    public void searchStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        for (Student s: studentList
             ) {
            if(s.getName().contains(name)) {
                studentListSearched.add(s);
            }
        }
        if(studentListSearched.isEmpty()) {
            System.out.println("Student not exist!");
        } else {
            try {

                for (Student s : studentListSearched
                ) {
                    System.out.println(s);
                }
                int studentCode = inputStudentCode();
                for (Student s: studentListSearched
                     ) {
                    if(s.getCode() == studentCode) {
                        System.out.println(s);
                        break;
                    }
                }
            } catch (NotFoundStudentException notFoundStudentException) {
                System.out.println(notFoundStudentException.getMessage());
            }
        }
    }

    @Override
    public void display() {
        // hiện thị tên lớp học ?
        System.out.println("========Student List=========");
        for (Student s: studentList
             ) {
            System.out.println(s);
        }
    }

    private int inputStudentCode() throws NotFoundStudentException {
        System.out.print("Enter student's code: ");
        String studentCode = scanner.nextLine();
        if(!studentCode.matches("^\\d+$")) {
            throw new NotFoundStudentException("student must be a number!");
        }
        return Integer.parseInt(studentCode);
    }

    public void saveToFile() {
        ReadAndWriteFile.writeFileStudent(STUDENT_SOURCE_FILE, StudentServiceImpl.getStudentList());
    }
}
