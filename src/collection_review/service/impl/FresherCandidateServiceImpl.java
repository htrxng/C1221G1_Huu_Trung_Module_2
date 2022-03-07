package collection_review.service.impl;

import collection_review.model.FresherCandidate;
import collection_review.service.IService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FresherCandidateServiceImpl implements IService {
    static List<FresherCandidate> fresherCandidateServiceList = new ArrayList<FresherCandidate>();
    Scanner input = new Scanner(System.in);
    String candidateId,firstName,lastName,birthDate,address,phoneNumber,email;

    static {
        FresherCandidate fresherCandidate1 = new FresherCandidate("Fresher1", "Tran", "Van Huu ", "18", "Hue", "01245607333", "huutrungg02@gmail.com", "Fresher Candidate", 2, 2000, "None");
        FresherCandidate fresherCandidate2 = new FresherCandidate("Fresher2", "Nguyen", "Van A", "18", "Sai gon ", "09355151333", "cadadada@gmail.com", "Fresher Candidate", 4, 10, "BK");
        FresherCandidate fresherCandidate3 = new FresherCandidate("Fresher3", "Nguyen", "Van B", "18", "Nghe an", "093561241433", "ettttaa02@gmail.com", "Fresher Candidate", 3, 1, "DUT");
        fresherCandidateServiceList.add(fresherCandidate1);
        fresherCandidateServiceList.add(fresherCandidate2);
        fresherCandidateServiceList.add(fresherCandidate3);
    }

    @Override
    public void add() {
        this.enterBaseInfo();
        String candidateType = "Fresher Candidate";
        System.out.print("Enter graduation date:");
        int graduationDate = Integer.parseInt(input.nextLine());
        System.out.print("Enter graduation rank:");
        int graduationRank = Integer.parseInt(input.nextLine());
        System.out.print("Enter education:");
        String education = input.nextLine();
        FresherCandidate newFresherCandidate = new FresherCandidate(candidateId, firstName, lastName, birthDate, address, phoneNumber, email, candidateType, graduationDate, graduationRank, education);
        fresherCandidateServiceList.add(newFresherCandidate);
        askContinue();
    }

    public void askContinue() {
        System.out.print("Do you want to continue (Y/N)?.");
        String choose = input.nextLine();
        if (choose.equals("N") || choose.equals("n")) {
            display();
        } else if (choose.equals("Y") || choose.equals("y")) {
            add();
        }
    }

    @Override
    public void display() {
        for (FresherCandidate fresherCandidate : fresherCandidateServiceList) {
            System.out.println(fresherCandidate);
        }
    }

    @Override
    public void search(String keyword) {
        ArrayList<FresherCandidate> fresherCandidateArrayListSearched = new ArrayList<FresherCandidate>();
        for (FresherCandidate fresherCandidate : fresherCandidateServiceList
        ) {
            if (fresherCandidate.getFirstName().toLowerCase().contains(keyword) || fresherCandidate.getLastName().toLowerCase().contains(keyword)) {
                fresherCandidateArrayListSearched.add(fresherCandidate);
            }
        }
        System.out.println("==========FRESHER CANDIDATE==============");
        for (FresherCandidate fresherCandidate : fresherCandidateArrayListSearched
        ) {
            System.out.println(fresherCandidate + "\n");
        }
    }

    @Override
    public void enterBaseInfo() {
        System.out.print("Enter Candidate ID:");
        candidateId = input.nextLine();
        System.out.print("Enter first name:");
        firstName = input.nextLine();
        System.out.print("Enter last name:");
        lastName = input.nextLine();
        System.out.print("Enter Birth date");
        birthDate = input.nextLine();
        System.out.print("Enter address");
        address = input.nextLine();
        System.out.print("Enter Phone Number:");
        phoneNumber = input.nextLine();
        System.out.print("Enter Email:");
        email = input.nextLine();
    }
}
