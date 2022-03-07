package collection_review.service.impl;

import collection_review.model.InternCandidate;
import collection_review.service.IService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InternCandidateServiceImpl implements IService {
    static List<InternCandidate> internCandidateList = new ArrayList<InternCandidate>();
    Scanner input = new Scanner(System.in);
    String candidateId,firstName,lastName,birthDate,address,phoneNumber,email;
    static {
        InternCandidate internCandidate1 = new InternCandidate("Intern1", "Vo", "Tong", "21", "Hue", "0935607333", "huutrungg02@gmail.com", "Intern Candidate", "IT", 2, "None");
        InternCandidate internCandidate2 = new InternCandidate("Intern2", "Nguyen", "Thi Thao Ly ", "2/10", "Da Nang", "09355151333", "nguyenandly@gmail.com", "Intern Candidate", "Foreign Trade", 4, "KT");
        internCandidateList.add(internCandidate1);
        internCandidateList.add(internCandidate2);
    }

    @Override
    public void add() {
        this.enterBaseInfo();
        String candidateType = "Intern Candidate";
        System.out.print("Enter majors:");
        String major = input.nextLine();
        System.out.print("Enter semester:");
        int semester = Integer.parseInt(input.nextLine());
        System.out.print("Enter University Name:");
        String university = input.nextLine();
        InternCandidate newInternCandidate = new InternCandidate(candidateId, firstName, lastName, birthDate, address, phoneNumber, email, candidateType, major, semester, university);
        internCandidateList.add(newInternCandidate);
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
        for (InternCandidate internCandidate : internCandidateList) {
            System.out.println(internCandidate);
        }
    }

    @Override
    public void search(String keyword) {
        ArrayList<InternCandidate> internCandidateArrayListSearched = new ArrayList<InternCandidate>();

        for (InternCandidate internCandidate : internCandidateList
        ) {
            if (internCandidate.getFirstName().toLowerCase().contains(keyword) || internCandidate.getLastName().toLowerCase().contains(keyword)) {
                internCandidateArrayListSearched.add(internCandidate);
            }
        }
        System.out.println("===========INTERN CANDIDATE============");
        for (InternCandidate internCandidate : internCandidateArrayListSearched
        ) {
            System.out.println(internCandidate + "\n");
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
