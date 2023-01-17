package case_study_md2.furama_resort.models;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String serviceCode, String nameService, String usableArea, String cost, String capacity, String rentalForm, String freeServiceIncluded) {
        super(serviceCode,nameService, usableArea, cost, capacity, rentalForm);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

//serviceCode,nameService,usableArea,cost,maximumNumberOfPeople,rentalForm,  freeServiceIncluded


    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                ", freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }

    @Override
    public String getInforToCSV() {
        return super.getInforToCSV() +","+freeServiceIncluded;
    }

}
