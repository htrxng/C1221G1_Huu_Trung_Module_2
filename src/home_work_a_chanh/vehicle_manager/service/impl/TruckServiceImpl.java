package home_work_a_chanh.vehicle_manager.service.impl;


import home_work_a_chanh.vehicle_manager.model.Truck;
import home_work_a_chanh.vehicle_manager.service.IService;
import home_work_a_chanh.vehicle_manager.model.Manufacturer;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckServiceImpl implements IService {
    static ArrayList<Truck> truckArrayList = new ArrayList<Truck>(10);
    Scanner scanner = new Scanner(System.in);

    @Override
    public void create() {
        System.out.println("enter licenseplate:");
        String licensePlate = scanner.nextLine();
        System.out.println("choose manufaturer:");
        ManufacturerServiceImpl manufacturerServiceImpl = new ManufacturerServiceImpl();
        Manufacturer manufacturer = manufacturerServiceImpl.chooseManufacturer();
        System.out.println("enter manufacturer year");
        int manufacturerYear = Integer.parseInt(scanner.nextLine());
        System.out.println("enter owner name");
        String owner = scanner.nextLine();
        System.out.println("enter tonnage");
        double tonnage = Double.parseDouble(scanner.nextLine());
        Truck newTruck = new Truck(licensePlate, manufacturer, manufacturerYear, owner, tonnage);
        truckArrayList.add(newTruck);
    }

    @Override
    public void display() {
        for (Truck t : truckArrayList
        ) {
            System.out.println(t);
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete(String licensePlate) {
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