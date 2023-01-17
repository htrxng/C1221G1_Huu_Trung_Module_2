package he_thong_quan_li_sinh_vien.models;

public abstract class Person {
    private int code;
    private String name;
    private String birthday;
    private String gender;
    private String phoneNumber;

    public Person(int code, String name, String birthday, String gender, String phoneNumber) {
        this.code = code;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public Person() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return
                "code=" + code +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

//        public Person(int code, String name, String birthday, String gender, String phoneNumber) {
    public String getInformationToCsv() {
        return code + "," + name + "," + birthday + "," + gender + "," + phoneNumber;
    }
}
