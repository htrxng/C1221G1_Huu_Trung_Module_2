package oop_review.vehicle_manager.service.impl;

import oop_review.vehicle_manager.model.Car;
import oop_review.vehicle_manager.model.Manufacturer;
import oop_review.vehicle_manager.service.IService;

import java.util.ArrayList;
import java.util.Scanner;

public class CarServiceImpl implements IService {
    static ArrayList<Car> carArrayList = new ArrayList<Car>(10);
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
        System.out.println("enter type of car");
        String type = scanner.nextLine();
        System.out.println("enter seats");
        int seats = Integer.parseInt(scanner.nextLine());
        Car newCar = new Car(licensePlate, manufacturer, manufacturerYear, owner, type, seats);
        carArrayList.add(newCar);
    }
    @Override
    public void display() {
        for (Car c : carArrayList
        ) {
            System.out.println(c);
        }
    }
    @Override
    public void delete(String licensePlate) {
        for (Car c : carArrayList        ) {
            if (c.getLicensePlate().equals(licensePlate)) {
                System.out.println(c);
                System.out.println("Do you want delete this vehicle? \n +" +
                        "1.Yes \n" +
                        "2.No \n");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        carArrayList.remove(c);
                        System.out.println("Succesfully Remove Vehicle");
                        break;
                    case 2:
                        break;
                }
                break;
            }
        }
        display();
    }
}
