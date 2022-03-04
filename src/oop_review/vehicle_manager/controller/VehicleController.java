package oop_review.vehicle_manager.controller;


import oop_review.vehicle_manager.service.IService;
import oop_review.vehicle_manager.service.impl.BikeServiceImpl;
import oop_review.vehicle_manager.service.impl.CarServiceImpl;
import oop_review.vehicle_manager.service.impl.TruckServiceImpl;

import java.util.Scanner;

public class VehicleController {
    Scanner scanner = new Scanner(System.in);

    IService carServiceImpl = new CarServiceImpl();
    IService truckServiceImpl = new TruckServiceImpl();
    IService bikeServiceImpl = new BikeServiceImpl();

    public void addVehicle() {
        System.out.println("Vehicle type list: \n" +
                "1.Car \n" +
                "2.Truck \n" +
                "3.Bike \n");
        System.out.println("choose type of vehicle to add: ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                //car
                carServiceImpl.add();
                break;
            case 2:
                //truck
                truckServiceImpl.add();
                break;
            case 3:
                //bike
                bikeServiceImpl.add();
                break;
            default:
                //
        }
    }

    public void displayVehicleList() {
        System.out.println("Vehicle type list: \n" +
                "1.Car \n" +
                "2.Truck \n" +
                "3.Bike \n");
        System.out.println("choose type of vehicle which you want to display: ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                // display car list
                carServiceImpl.display();
                break;
            case 2:
                // display truck list
                truckServiceImpl.display();
                break;
            case 3:
                // display bike list
                bikeServiceImpl.display();
                break;
        }
    }

    public void deleteVehicle() {
        System.out.println("enter license plate of vehicle want to delete: ");
        String licensePlate = scanner.nextLine();
        carServiceImpl.delete(licensePlate);
        truckServiceImpl.delete(licensePlate);
        bikeServiceImpl.delete(licensePlate);
    }
}


