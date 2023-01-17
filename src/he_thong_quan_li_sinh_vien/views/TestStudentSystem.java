package he_thong_quan_li_sinh_vien.views;

import he_thong_quan_li_sinh_vien.controllers.StudentSystemController;

public class TestStudentSystem {
    public static void main(String[] args) {
        StudentSystemController studentSystemController = new StudentSystemController();
        studentSystemController.displayMainMenu();
    }
}
