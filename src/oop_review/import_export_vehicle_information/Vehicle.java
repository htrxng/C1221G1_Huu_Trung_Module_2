package oop_review.import_export_vehicle_information;

public class Vehicle {
    private String nameOfOwner;
    private double valueofVehicle;
    private double cylinderCapacity;
    private double tax;

    public Vehicle() {

    }

    public Vehicle(String nameOfOwner, double valueofVehicle, double cylinderCapacity) {
        this.nameOfOwner = nameOfOwner;
        this.valueofVehicle = valueofVehicle;
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public double getValueofVehicle() {
        return valueofVehicle;
    }

    public void setValueofVehicle(double valueofVehicle) {
        this.valueofVehicle = valueofVehicle;
    }

    public double getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(double cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public double getTax() {
        return tax;
    }

    public void taxCalculator(double cylinderCapacity, double valueofVehicle) {
        if (cylinderCapacity < 100 && cylinderCapacity > 0) {
            this.tax = this.valueofVehicle / 100;
        } else if (cylinderCapacity < 200) {
            this.tax = this.valueofVehicle / 100 * 3;
        } else {
            this.tax = this.valueofVehicle / 100 * 5;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "nameOfOwner='" + nameOfOwner + '\'' +
                ", valueofVehicle=" + valueofVehicle +
                ", cylinderCapacity=" + cylinderCapacity +
                ", task=" + tax + "$" +
                '}';
    }
}
