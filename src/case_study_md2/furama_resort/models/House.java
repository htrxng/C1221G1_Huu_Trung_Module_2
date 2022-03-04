package case_study_md2.furama_resort.models;

public class House extends Facility {
    private String roomStandard;
    private int floorNumber;

    public House() {
    }

    public House(String nameService, Double usableArea, Double cost, int maximumNumberOfPeople, String rentalForm, String roomStandard, int floorNumber) {
        super(nameService, usableArea, cost, maximumNumberOfPeople, rentalForm);
        this.roomStandard = roomStandard;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

}
