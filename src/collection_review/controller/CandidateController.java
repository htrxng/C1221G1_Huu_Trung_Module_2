package collection_review.controller;

import collection_review.model.Candidate;
import collection_review.service.IService;
import collection_review.service.impl.ExperienceCandidateServiceImpl;
import collection_review.service.impl.FresherCandidateServiceImpl;
import collection_review.service.impl.InternCandidateServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class CandidateController {
    public CandidateController() {
    }

    static List<Candidate> candidateListSearch = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    IService experienceCandidateServiceImpl = new ExperienceCandidateServiceImpl();
    IService fresherCandidateServiceImpl = new FresherCandidateServiceImpl();
    IService internCandidateServiceImpl = new InternCandidateServiceImpl();


    public void mainMenu() {
        boolean flagMain = true;
        System.out.println("CANDIDATE MANAGEMENT SYSTEM \n" +
                "1. Experience \n" +
                "2. Fresher \n" +
                "3. Internship \n" +
                "4. Searching \n" +
                "0. Exit \n" +
                "Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, 3 to Internship Candidate, 4 to Searching and 5 to Exit program ");
        do {
            System.out.print("Choose function:");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    //exp
                    experienceCandidateServiceImpl.add();
                    break;
                case 2:
                    //fresher
                    fresherCandidateServiceImpl.add();
                    break;
                case 3:
                    //internship
                    internCandidateServiceImpl.add();
                    break;
                case 4:
                    //search
                    searchCandidate();
                    break;
                case 0:
                    flagMain = false;
                    break;
                default:
                    System.out.println("not a choice!");
            }
        } while (flagMain);
    }

    public void searchCandidate() {
        System.out.print("Enter Candidate Name: ");
        String candidateName = input.nextLine();
        candidateName = candidateName.toLowerCase();
        experienceCandidateServiceImpl.search(candidateName);
        fresherCandidateServiceImpl.search(candidateName);
        internCandidateServiceImpl.search(candidateName);
    }


}
