package case_study_md2.furama_resort.models;

public abstract class Facility {
    private String nameService;
    private Double usableArea;
    private Double cost;
    private int maximumNumberOfPeople;
    private String rentalForm;

    public Facility() {
    }

    public Facility(String nameService, Double usableArea, Double cost, int maximumNumberOfPeople, String rentalForm) {
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.cost = cost;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalForm = rentalForm;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(Double usableArea) {
        this.usableArea = usableArea;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalForm() {
        return rentalForm;
    }

    public void setRentalForm(String rentalForm) {
        this.rentalForm = rentalForm;
    }
}
