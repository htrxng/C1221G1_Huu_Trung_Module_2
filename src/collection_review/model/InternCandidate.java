package collection_review.model;

public class InternCandidate extends Candidate {
    private String majors;
    private int semester;
    private String universityName;

    public InternCandidate() {
    }

    public InternCandidate(String candidateId, String firstName, String lastName, String birthDate, String address, String phone, String email, String
            candidateType, String majors, int semester, String universityName) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "InternCandidate{" + super.toString() +
                "majors='" + majors + '\'' +
                ", semester=" + semester +
                ", universityName=" + universityName +
                '}';
    }
}
