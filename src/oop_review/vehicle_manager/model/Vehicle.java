package oop_review.vehicle_manager.model;

public abstract class Vehicle {
    private String licensePlate;
    private Manufacturer manufacturer;
    private int manufacturerYear;
    private String owner;

    public Vehicle(String licensePlate, Manufacturer manufacturer, int manufacturerYear, String owner) {
        this.licensePlate = licensePlate;
        this.manufacturer = manufacturer;
        this.manufacturerYear = manufacturerYear;
        this.owner = owner;
    }

    public Vehicle() {
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManufacturerYear() {
        return manufacturerYear;
    }

    public void setManufacturerYear(int manufacturerYear) {
        this.manufacturerYear = manufacturerYear;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return
                "licensePlate='" + licensePlate + '\'' +
                        ", manufacturer='" + manufacturer + '\'' +
                        ", manufacturerYear=" + manufacturerYear +
                        ", owner='" + owner + '\'' +
                        '}';
    }
}
