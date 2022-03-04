package case_study_md2.furama_resort.models;

public abstract class Person {
    private String name;
    private String birthday;
    private String gender;
    private int iDNo;
    private int phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name, String birthday, String gender, int iDNo, int phoneNumber, String email) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.iDNo = iDNo;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getiDNo() {
        return iDNo;
    }

    public void setiDNo(int iDNo) {
        this.iDNo = iDNo;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
