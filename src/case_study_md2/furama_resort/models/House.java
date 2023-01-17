package case_study_md2.furama_resort.models;

public class House extends Facility {
    private String roomStandard;
    private String floorNumber;

    public House() {
    }

    public House(String serviceCode, String nameService, String usableArea, String cost, String capacity, String rentalForm, String roomStandard, String floorNumber) {
        super(serviceCode, nameService, usableArea, cost, capacity, rentalForm);
        this.roomStandard = roomStandard;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    //serviceCode,nameService,usableArea, cost, maximumNumberOfPeople, rentalForm,roomStandard, floorNumber) {


    @Override
    public String toString() {
        return "House{" +
                super.toString() +
                ", roomStandard='" + roomStandard + '\'' +
                ", floorNumber='" + floorNumber + '\'' +
                '}';
    }

    @Override
    public String getInforToCSV() {
        return super.getInforToCSV() + "," + roomStandard + "," + floorNumber;
    }

}
