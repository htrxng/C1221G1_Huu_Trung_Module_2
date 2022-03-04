package case_study_md2.furama_resort.models;

public class Employee extends Person {
    private int employeeCode;
    private String academicLevel;
    private String position;
    private double wage;

    public Employee() {
    }

    public Employee(int employeeCode,String name, String birthday, String gender, int iDNo, int phoneNumber, String email,  String academicLevel, String position, double wage) {
        super(name, birthday, gender, iDNo, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.academicLevel = academicLevel;
        this.position = position;
        this.wage = wage;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}
