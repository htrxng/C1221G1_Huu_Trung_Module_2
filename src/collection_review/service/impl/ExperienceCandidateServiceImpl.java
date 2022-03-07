package collection_review.service.impl;


import collection_review.model.ExperienceCandidate;
import collection_review.service.IService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExperienceCandidateServiceImpl implements IService {
    static List<ExperienceCandidate> experienceCandidateList = new ArrayList<ExperienceCandidate>();
    Scanner input = new Scanner(System.in);
    String candidateId,firstName,lastName,birthDate,address,phoneNumber,email;

    static {
        ExperienceCandidate experienceCandidate1 = new ExperienceCandidate("Exp1", "Tran", "Van Huu Trung", "18", "Hue", "0935607333", "huutrungg02@gmail.com", "ExperienceCandidate", 2, "None");
        ExperienceCandidate experienceCandidate2 = new ExperienceCandidate("Exp2", "Nguyen", "Van A", "18", "Da Nang", "09355151333", "cadadada@gmail.com", "ExperienceCandidate", 2, "None");
        ExperienceCandidate experienceCandidate3 = new ExperienceCandidate("Exp3", "Nguyen", "Van B", "18", "Ha Noi", "093561241433", "ettttaa02@gmail.com", "ExperienceCandidate", 2, "None");
        experienceCandidateList.add(experienceCandidate1);
        experienceCandidateList.add(experienceCandidate2);
        experienceCandidateList.add(experienceCandidate3);
    }

    @Override
    public void add() {
        this.enterBaseInfo();
        String candidateType = "ExperienceCandidate";
        System.out.print("Enter experience years");
        int expInYear = Integer.parseInt(input.nextLine());
        System.out.print("Enter Profesional Skill:");
        String proSkill = input.nextLine();
        ExperienceCandidate newExperienceCandidate = new ExperienceCandidate(candidateId, firstName, lastName, birthDate, address, phoneNumber, email, candidateType, expInYear, proSkill);
        experienceCandidateList.add(newExperienceCandidate);
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
        for (ExperienceCandidate experienceCandidate : experienceCandidateList) {
            System.out.println(experienceCandidate);
        }
    }

    @Override
    public void search(String keyword) {
        ArrayList<ExperienceCandidate> experienceCandidateArrayListSearched = new ArrayList<ExperienceCandidate>();

        for (ExperienceCandidate experienceCandidate : experienceCandidateList
        ) {
            if (experienceCandidate.getFirstName().toLowerCase().contains(keyword) || experienceCandidate.getLastName().toLowerCase().contains(keyword)) {
                experienceCandidateArrayListSearched.add(experienceCandidate);
            }
        }
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for (ExperienceCandidate expCandidate : experienceCandidateArrayListSearched
        ) {
            System.out.println(expCandidate + "\n");
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
