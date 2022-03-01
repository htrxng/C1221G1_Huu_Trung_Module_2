package oop_review.vehicle_manager;

import java.util.Scanner;

public class TestVehicleManager {
    public static void main(String[] args) {
        VehicleManager vehicleManager = new VehicleManager();
//        vehicleManager.addVehicle(1);

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int chooseFunction;
        do {
            System.out.println("Vehicle Manage Programmer \n " +
                    "Choose function \n" +
                    "1.Add new vehicle \n " +
                    "2.Display vehicle \n" +
                    "3.Delete vehicle \n" +
                    "4.Exit");
            chooseFunction = Integer.parseInt(scanner.nextLine());
            switch (chooseFunction) {
                case 1:
                    //add function
                    vehicleManager.addVehicle();
                    break;
                case 2:
                    //display vehicle
                    vehicleManager.displayVehicleList();
                    break;
                case 3:
                    //delete vehicle
                    vehicleManager.deleteVehicle();
                    break;
                case 4:
                    //exit
                    flag = false;
                    break;
            }
        } while (flag);

    }
}
