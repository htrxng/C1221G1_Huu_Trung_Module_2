package case_study_md2.furama_resort.models;

public class Villa extends Facility {
    private String roomStandard;
    private String poolArea;
    private String floorNumber;

    public Villa() {
    }

    public Villa(String serviceCode, String nameService, String usableArea, String cost, String capacity, String rentalForm, String roomStandard, String poolArea, String floorNumber) {
        super(serviceCode, nameService, usableArea, cost, capacity, rentalForm);
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

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

//serviceCode,nameService,usableArea,cost,maximumNumberOfPeople,rentalForm,roomStandard,poolArea,floorNumber


    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                ", roomStandard='" + roomStandard + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", floorNumber='" + floorNumber + '\'' +
                '}';
    }

    public String getInforToCSV(){
        return super.getInforToCSV() + ","+ roomStandard+ ","+ poolArea+ ","+ floorNumber;
    }
}
