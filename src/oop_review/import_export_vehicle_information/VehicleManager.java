package oop_review.import_export_vehicle_information;

public class VehicleManager {
    private static Vehicle[] vehicles = new Vehicle[100];

    static {
        vehicles[0] = new Vehicle("Trung", 150, 120);
        vehicles[1] = new Vehicle("Toan", 100, 50);
        vehicles[2] = new Vehicle("Vien Lau", 200, 150);
    }

    public void showVehiclesList() {
        for (Vehicle v : vehicles) {
            if (v != null) {
                v.taxCalculator(v.getCylinderCapacity(), v.getValueofVehicle());
                System.out.println(v);
            } else {
                break;
            }
        }
    }

    public void add(String nameOfOwner, double valueOfVehicle, double cylinderCapacity) {
        int index = -1;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                index = i;
                break;
            }
        }
        vehicles[index] = new Vehicle(nameOfOwner, valueOfVehicle, cylinderCapacity);
    }

}
