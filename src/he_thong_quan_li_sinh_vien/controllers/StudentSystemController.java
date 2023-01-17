package he_thong_quan_li_sinh_vien.controllers;

import he_thong_quan_li_sinh_vien.service.imp.StudentServiceImpl;
import he_thong_quan_li_sinh_vien.service.imp.TeacherServiceImpl;

import java.util.Scanner;

public class StudentSystemController {
    Scanner scanner = new Scanner(System.in);

    public StudentSystemController() {
    }

    StudentServiceImpl studentService = new StudentServiceImpl();
    TeacherServiceImpl teacherService = new TeacherServiceImpl();

    public void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.print("Chương trình quản lí sinh viên \n" +
                    "Chọn chức năng theo số để tiếp tục \n" +
                    "1.Thêm mới sinh viên \n" +
                    "2.Xoá sinh viên \n" +
                    "3.Xem danh sách sinh viên \n" +
                    "4.Xem thông tin giáo viên \n" +
                    "5.Tìm kiếm sinh viên \n" +
                    "6.Thoát \n" +
                    "Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    //
                    studentService.add();
                    break;
                case "2":
                    //
                    studentService.delete();
                    break;
                case "3":
                    //
                    studentService.display();
                    break;
                case "4":
                    //
                    teacherService.display();
                    break;
                case "5":
                    //
                    studentService.searchStudent();
                    break;
                case "6":
                    //
                    studentService.saveToFile();
                    flag = false;
                    break;
                default:
                    System.out.println("Nhập sai!");
            }
        } while (flag);
    }
}
