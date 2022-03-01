package oop_review.vehicle_manager;


import java.util.Scanner;

public class VehicleManager {
    Scanner scanner = new Scanner(System.in);

    CarMangager carMangager = new CarMangager();
    TruckManager truckManager = new TruckManager();
    BikeManager bikeManager = new BikeManager();


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
                carMangager.addNewCar();
                break;
            case 2:
                //truck
                truckManager.addNewTruck();
                break;
            case 3:
                //bike
                bikeManager.addNewBike();
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
                carMangager.displayCarList();
                break;
            case 2:
                // display truck list
                truckManager.displayTruckList();
                break;
            case 3:
                // display bike list
                bikeManager.displayBikeList();
                break;
        }
    }

    public void deleteVehicle() {
        System.out.println("enter license plate of vehicle want to delete: ");
        String licensePlate = scanner.nextLine();
        carMangager.deleteCar(licensePlate);
        truckManager.deleteTruck(licensePlate);
        bikeManager.deleteBike(licensePlate);
    }
}


