package oop_review.vehicle_manager;

import java.util.ArrayList;
import java.util.Scanner;

public class BikeManager {
    static ArrayList<Bike> bikeArrayList = new ArrayList<Bike>(10);
    Scanner scanner = new Scanner(System.in);

    public void addNewBike() {
        System.out.println("enter licenseplate");
        String licensePlate = scanner.nextLine();
        System.out.println("choose manufaturer:");
        ManufacturerManager manufacturerManager = new ManufacturerManager();
        Manufacturer manufacturer = manufacturerManager.chooseManufacturer();
        System.out.println("enter manufacturer year");
        int manufacturerYear = Integer.parseInt(scanner.nextLine());
        System.out.println("enter owner name");
        String owner = scanner.nextLine();
        System.out.println("enter wattage");
        double wattage = Double.parseDouble(scanner.nextLine());
        Bike newBike = new Bike(licensePlate, manufacturer, manufacturerYear, owner, wattage);
        bikeArrayList.add(newBike);
    }

    public void displayBikeList() {
        for (Bike b : bikeArrayList
        ) {
            System.out.println(b);
        }
    }

    public void deleteBike(String licensePlate) {
        for (Bike b : bikeArrayList
        ) {
            if (b.getLicensePlate().equals(licensePlate)) {
                System.out.println(b);
                System.out.println("Do you want delete this vehicle? \n +" +
                        "1.Yes \n" +
                        "2.No \n");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        bikeArrayList.remove(b);
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
