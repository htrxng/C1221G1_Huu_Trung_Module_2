package oop_review.import_export_vehicle_information;

import java.util.Scanner;

public class TestVehicleManager {
    static VehicleManager vehicleManager = new VehicleManager();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int chooseFunction;
        do {
            System.out.println("Main Menu: \n " +
                    "1.add new Vehicle \n" +
                    "2.display tax sheet of vehicle \n" +
                    "3.exit \n ");
            System.out.println("choose function");
            chooseFunction = Integer.parseInt(scanner.nextLine());
            switch (chooseFunction) {
                case 1:
                    // add
                    System.out.println("enter vehicle information ");
                    System.out.println("enter owner's name of vehicle: ");
                    String newOwnerName = scanner.nextLine();
                    System.out.println("enter price of vehicle:");
                    double priceOfVehicle = Double.parseDouble(scanner.nextLine());
                    System.out.println("enter cylinder capacity of vehicle:");
                    double cylinderCapacity = Double.parseDouble(scanner.nextLine());
                    vehicleManager.add(newOwnerName, priceOfVehicle, cylinderCapacity);
                    System.out.println("succesfully added! ");
                    break;
                case 2:
                    //display
                    System.out.println("Vehicle list");
                    vehicleManager.showVehiclesList();
                    break;
                case 3:
                    //exit
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
