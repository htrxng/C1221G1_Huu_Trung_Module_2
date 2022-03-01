package oop_review.vehicle_manager;

public class Car extends Vehicle {
    String type;
    int seats;

    public Car() {
    }

    public Car(String licensePlate, Manufacturer manufacturer, int manufacturerYear, String owner, String type, int seats) {
        super(licensePlate, manufacturer, manufacturerYear, owner);
        this.type = type;
        this.seats = seats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                "type='" + type + '\'' +
                ", seats=" + seats +
                '}';
    }
}
