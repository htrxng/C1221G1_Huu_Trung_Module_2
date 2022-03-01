package oop_review.vehicle_manager;

public class Truck extends Vehicle{
    Double tonnage;

    public Truck() {
    }

    public Truck(String licensePlate, String manufacturer, int manufacturerYear, String owner, Double tonnage) {
        super(licensePlate, manufacturer, manufacturerYear, owner);
        this.tonnage = tonnage;
    }

    public Double getTonnage() {
        return tonnage;
    }

    public void setTonnage(Double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString() +
                "tonnage=" + tonnage +
                '}';
    }
}
