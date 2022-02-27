package ss5_access_modifier_static_method_static_property.bai_tap.manger_student;

import java.util.Scanner;

public class TestManagerStudent {
    static StudentManager studentManager = new StudentManager();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int chooseFunction;
        do {
            System.out.println("Main Menu: \n" +
                    "1. add\n" +
                    "2. display\n" +
                    "3. edit\n" +
                    "4. delete\n" +
                    "5. search\n" +
                    "6. exit\n");
            System.out.println("choose function");
             chooseFunction  = Integer.parseInt(scanner.nextLine());
            switch (chooseFunction) {
                case 1:
                    // add function.
                    System.out.println("enter student information: ");
                    System.out.println("enter student name : ");
                    String newStudentName = scanner.nextLine();
                    System.out.println("enter student birthday : ");
                    String newStudentBirthday = scanner.nextLine();
                    System.out.println("enter student class : ");
                    String newStudentClass = scanner.nextLine();
                    studentManager.add(newStudentName, newStudentBirthday, newStudentClass);
                    studentManager.showListStudent();
                    break;
                case 2:
                    //display
                    System.out.println("student list");
                    studentManager.showListStudent();
                    break;
                case 3:
                    // edit
                    System.out.println("enter id need edit: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    studentManager.edit(id);
                    break;
                case 6:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
