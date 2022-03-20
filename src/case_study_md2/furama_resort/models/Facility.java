package case_study_md2.furama_resort.models;

public abstract class Facility {
    private String serviceCode;
    private String nameService;
    private String usableArea;
    private String cost;
    private String maximumNumberOfPeople;
    private String rentalForm;

    public Facility() {
    }

    public Facility(String serviceCode, String nameService, String usableArea, String cost, String maximumNumberOfPeople, String rentalForm) {
        this.serviceCode = serviceCode;
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.cost = cost;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
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

    public String getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(String maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
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
                ", maximumNumberOfPeople='" + maximumNumberOfPeople + '\'' +
                ", rentalForm='" + rentalForm + '\'';
    }

    public String getInforToCSV(){
        return serviceCode+","+nameService+","+usableArea+","+cost+","+maximumNumberOfPeople+","+rentalForm;
    }

}
