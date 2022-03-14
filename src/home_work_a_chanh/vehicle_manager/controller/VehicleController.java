package home_work_a_chanh.vehicle_manager.controller;


import home_work_a_chanh.vehicle_manager.service.IService;
import home_work_a_chanh.vehicle_manager.service.impl.BikeServiceImpl;
import home_work_a_chanh.vehicle_manager.service.impl.CarServiceImpl;
import home_work_a_chanh.vehicle_manager.service.impl.TruckServiceImpl;

import java.util.Scanner;

public class VehicleController {
    Scanner scanner = new Scanner(System.in);

    IService carServiceImpl = new CarServiceImpl();
    IService truckServiceImpl = new TruckServiceImpl();
    IService bikeServiceImpl = new BikeServiceImpl();

    public void addVehicle() {
        System.out.print("Vehicle type list: \n" +
                "1.Car \n" +
                "2.Truck \n" +
                "3.Bike \n");
        System.out.print("choose type of vehicle to add: ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                //car
                carServiceImpl.create();
                break;
            case 2:
                //truck
                truckServiceImpl.create();
                break;
            case 3:
                //bike
                bikeServiceImpl.create();
                break;
            default:
                //
                System.out.println("not a choice");
        }
    }

    public void displayVehicleList() {
        System.out.println("Vehicle type list: \n" +
                "1.Car \n" +
                "2.Truck \n" +
                "3.Bike \n");
        System.out.print("choose type of vehicle which you want to display: ");
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
            default:
                System.out.println("not a choice");
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