package oop_review.vehicle_manager;

public class Bike extends Vehicle {
    double wattage;

    public Bike() {
    }

    public Bike(String licensePlate, Manufacturer manufacturer, int manufacturerYear, String owner, double wattage) {
        super(licensePlate, manufacturer, manufacturerYear, owner);
        this.wattage = wattage;
    }

    public double getWattage() {
        return wattage;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Bike{" +
                super.toString() +
                "wattage=" + wattage +
                '}';
    }
}
