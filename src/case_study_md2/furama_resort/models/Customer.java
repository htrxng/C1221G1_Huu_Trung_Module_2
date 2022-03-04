package case_study_md2.furama_resort.models;

public class Customer extends Person {
    private int customerCode;
    private String typeOfCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, int iDNo, int phoneNumber, String email, int customerCode, String typeOfCustomer, String address) {
        super(name, birthday, gender, iDNo, phoneNumber, email);
        this.customerCode = customerCode;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
