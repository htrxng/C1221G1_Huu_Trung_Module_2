package case_study_md2.furama_resort.models;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String nameService, Double usableArea, Double cost, int maximumNumberOfPeople, String rentalForm, String freeServiceIncluded) {
        super(nameService, usableArea, cost, maximumNumberOfPeople, rentalForm);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }
}
