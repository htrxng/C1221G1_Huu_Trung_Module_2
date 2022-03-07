package collection_review.view;

import collection_review.controller.CandidateController;

public class View {
    public static void main(String[] args) {
        CandidateController candidateController = new CandidateController() {
            @Override
            public void mainMenu() {
                super.mainMenu();
            }
        };
        candidateController.mainMenu();
    }
}
