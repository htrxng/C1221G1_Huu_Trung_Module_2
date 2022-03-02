package oop_review.vehicle_manager;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckManager {
    static ArrayList<Truck> truckArrayList = new ArrayList<Truck>(10);
    Scanner scanner = new Scanner(System.in);

    public void addNewTruck() {
        System.out.println("enter licenseplate");
        String licensePlate = scanner.nextLine();
        System.out.println("choose manufaturer:");
        ManufacturerManager manufacturerManager = new ManufacturerManager();
        Manufacturer manufacturer = manufacturerManager.chooseManufacturer();
        System.out.println("enter manufacturer year");
        int manufacturerYear = Integer.parseInt(scanner.nextLine());
        System.out.println("enter owner name");
        String owner = scanner.nextLine();
        System.out.println("enter tonnage");
        double tonnage = Double.parseDouble(scanner.nextLine());
        Truck newTruck = new Truck(licensePlate, manufacturer, manufacturerYear, owner, tonnage);
        truckArrayList.add(newTruck);
    }

    public void displayTruckList() {
        for (Truck t : truckArrayList
        ) {
            System.out.println(t);
        }
    }

    public void deleteTruck(String licensePlate) {
        for (Truck t : truckArrayList
        ) {
            if (t.getLicensePlate().equals(licensePlate)) {
                System.out.println(t);
                System.out.println("Do you want delete this vehicle? \n +" +
                        "1.Yes \n" +
                        "2.No \n");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        truckArrayList.remove(t);
                        System.out.println("Succesfully Remove Vehicle");
                        break;
                    case 2:
                        break;
                }
            }
            break;
        }
    }
}
