package case_study_md2.furama_resort.models;

public abstract class Facility {
    private String serviceCode;
    private String nameService;
    private String usableArea;
    private String cost;
    private String capacity;
    private String rentalForm;

    public Facility() {
    }

    public Facility(String serviceCode, String nameService, String usableArea, String cost, String capacity, String rentalForm) {
        this.serviceCode = serviceCode;
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.cost = cost;
        this.capacity = capacity;
        this.rentalForm = rentalForm;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getRentalForm() {
        return rentalForm;
    }

    public void setRentalForm(String rentalForm) {
        this.rentalForm = rentalForm;
    }

    @Override
    public String toString() {
        return
                "serviceCode='" + serviceCode + '\'' +
                ", nameService='" + nameService + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", cost='" + cost + '\'' +
                ", maximumNumberOfPeople='" + capacity + '\'' +
                ", rentalForm='" + rentalForm + '\'';
    }

    public String getInforToCSV(){
        return serviceCode+","+nameService+","+usableArea+","+cost+","+ capacity +","+rentalForm;
    }

}
