package oop_review.vehicle_manager;


public class VehicleManager {
    private static Vehicle[] vehicles = new Vehicle[100];

    static {
        vehicles[0] = new Car("38H1-1808","Limousine",2015,"Chanh","touring",16);
        vehicles[1] = new Bike("92A-1451","Honda",2019,"Khoa",120);
        vehicles[2] = new Truck("75F-1555","dongfeng",2009,"tai",15.0);
        }
    public void showVehicleList() {
        for (Vehicle v: vehicles
             ) {
            if(v != null) {
                System.out.println(v);
            }
        }
    }
    public void addVehicle(int chosse) {
        switch (chosse) {
            case 1:
                //car
                break;
            case 2:
                //truck
                break;
            case 3:
                //bike
                break;
            default:
                //
        }
    }

}

