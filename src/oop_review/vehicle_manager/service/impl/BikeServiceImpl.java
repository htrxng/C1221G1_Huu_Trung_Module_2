package oop_review.vehicle_manager.service.impl;

import oop_review.vehicle_manager.model.Bike;
import oop_review.vehicle_manager.model.Manufacturer;
import oop_review.vehicle_manager.service.IService;

import java.util.ArrayList;
import java.util.Scanner;

public class BikeServiceImpl implements IService {
    static ArrayList<Bike> bikeArrayList = new ArrayList<Bike>(10);
    Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        System.out.println("enter licenseplate");
        String licensePlate = scanner.nextLine();
        System.out.println("choose manufaturer:");
        ManufacturerServiceImpl manufacturerServiceImpl = new ManufacturerServiceImpl();
        Manufacturer manufacturer = manufacturerServiceImpl.chooseManufacturer();
        System.out.println("enter manufacturer year");
        int manufacturerYear = Integer.parseInt(scanner.nextLine());
        System.out.println("enter owner name");
        String owner = scanner.nextLine();
        System.out.println("enter wattage");
        double wattage = Double.parseDouble(scanner.nextLine());
        Bike newBike = new Bike(licensePlate, manufacturer, manufacturerYear, owner, wattage);
        bikeArrayList.add(newBike);
    }
    @Override
    public void display() {
        for (Bike b : bikeArrayList
        ) {
            System.out.println(b);
        }
    }
    @Override
    public void delete(String licensePlate) {
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
