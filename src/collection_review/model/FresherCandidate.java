package collection_review.model;

public class FresherCandidate extends Candidate {
    private int graduationDate;
    private int graduationRank;
    private String Education;

    public FresherCandidate() {
    }

    public FresherCandidate(String candidateId, String firstName, String lastName, String birthDate, String address, String phone, String email, String candidateType, int graduationDate, int graduationRank, String education) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        Education = education;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public int getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(int graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    @Override
    public String toString() {
        return "FresherCandidate{" + super.toString() +
                "graduationDate=" + graduationDate +
                ", graduationRank=" + graduationRank +
                ", Education='" + Education + '\'' +
                '}';
    }
}
