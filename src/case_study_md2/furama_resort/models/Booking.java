package case_study_md2.furama_resort.models;

import java.util.Date;

public class Booking {
    private int bookingCode;
    private Date dayStart;
    private Date dayEnd;
    private int customerCode;
    private String serviceName;
    private String serviceType;

    public Booking() {
    }

    public Booking(int bookingCode, Date dayStart, Date dayEnd, int customerCode, String serviceName, String serviceType) {
        this.bookingCode = bookingCode;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public Date getDayStart() {
        return dayStart;
    }

    public void setDayStart(Date dayStart) {
        this.dayStart = dayStart;
    }

    public Date getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(Date dayEnd) {
        this.dayEnd = dayEnd;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
