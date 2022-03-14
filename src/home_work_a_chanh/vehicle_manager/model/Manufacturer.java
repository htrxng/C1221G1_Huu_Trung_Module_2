package home_work_a_chanh.vehicle_manager.model;

public class Manufacturer {
    private String id;
    private String brandName;
    private String countryName;

    public Manufacturer() {
    }

    public Manufacturer(String id, String brandName, String countryName) {
        this.id = id;
        this.brandName = brandName;
        this.countryName = countryName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", brandName='" + brandName + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}