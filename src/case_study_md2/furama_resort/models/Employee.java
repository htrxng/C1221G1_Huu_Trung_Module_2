package case_study_md2.furama_resort.models;

public class Employee extends Person {
    private String employeeCode;
    private String academicLevel;
    private String position;
    private double wage;

    public Employee() {
    }

    public Employee( String employeeCode,String name, String birthday, String gender, int iDNo, String phoneNumber, String email, String academicLevel, String position, double wage) {
        super(name, birthday, gender, iDNo, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.academicLevel = academicLevel;
        this.position = position;
        this.wage = wage;
    }

    public String getEmployeeCode() {
        return employeeCode;
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

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode='" + employeeCode + '\'' +
                super.toString() +
                ", academicLevel='" + academicLevel + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                '}';
    }

    // employeeCode,String name, String birthday, String gender, int iDNo, String phoneNumber, String email, String academicLevel, String position, double wage) {
    @Override
    public String getInformationToCSV() {
        return  employeeCode
                + "," + super.getInformationToCSV()
                + "," + academicLevel
                + "," + position
                + "," + wage;
    }

}
