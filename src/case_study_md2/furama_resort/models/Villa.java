package case_study_md2.furama_resort.models;

public class Villa extends Facility {
    private String roomStandard;
    private Float poolArea;
    private int floorNumber;

    public Villa() {
    }

    public Villa(String nameService, Double usableArea, Double cost, int maximumNumberOfPeople, String rentalForm, String roomStandard, Float poolArea, int floorNumber) {
        super(nameService, usableArea, cost, maximumNumberOfPeople, rentalForm);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Float poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
