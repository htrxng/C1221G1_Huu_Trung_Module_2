package case_study_md2.furama_resort.views;

import case_study_md2.furama_resort.controllers.FuramaController;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
}
