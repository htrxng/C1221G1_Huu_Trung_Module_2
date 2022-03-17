package case_study_md2.furama_resort.services.impl;

import case_study_md2.furama_resort.models.Facility;
import case_study_md2.furama_resort.models.House;
import case_study_md2.furama_resort.models.Room;
import case_study_md2.furama_resort.models.Villa;
import case_study_md2.furama_resort.services.FacilityService;
import case_study_md2.furama_resort.utils.ValidateInputData;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static List<Facility> facilityListMaintenance = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    String codeService;
    String nameService;
    String usableArea;
    String cost;
    String maximumNumberOfPeople;
    String rentalForm;
    private String poolArea;
    String floorNumber;
    String roomStandard;

    static {
        Villa villa1 = new Villa("SVVL-0001", "Rent", "1000", "2000$", "20", "3 days", "5 star", "50", "2");
        Villa villa2 = new Villa("SVVL-0002", "Rent", "500", "1500$", "15", "1 week", "4 star", "50", "2");
        Villa villa3 = new Villa("SVVL-0003", "Rent", "700", "1800$", "20", "5 days", "5 star", "50", "3");
        House house1 = new House("SVHO-0001", "Rent", "150", "100", "10", "2 days", "5 star", "2");
        House house2 = new House("SVHO-0002", "Rent", "120", "100", "10", "3 days", "5 star", "3");
        House house3 = new House("SVHO-0003", "Rent", "170", "100", "10", "4 days", "5 star", "4");
        Room room1 = new Room("SVRO-0001", "Rent", "40", "20", "5", "1 days", "dry cleaning");
        Room room2 = new Room("SVRO-0002", "Rent", "40", "20", "4", "2 days", "dry cleaning");
        Room room3 = new Room("SVRO-0003", "Rent", "40", "20", "3", "3 days", "dry cleaning");
        facilityIntegerMap.put(villa1, 0);
        facilityIntegerMap.put(villa2, 0);
        facilityIntegerMap.put(villa3, 0);
        facilityIntegerMap.put(house1, 0);
        facilityIntegerMap.put(house2, 0);
        facilityIntegerMap.put(house3, 0);
        facilityIntegerMap.put(room1, 0);
        facilityIntegerMap.put(room2, 0);
        facilityIntegerMap.put(room3, 0);
    }

    @Override
    public void displayListFacility() {
        System.out.println("-----Facility List----");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()
        ) {
            System.out.println(entry.getKey());
        }
    }

    @Override
    public void displayListFacilityMaintenance() {
        if (facilityListMaintenance.size() == 0) {
            System.out.println("All of facility are still good!");
        } else {
            System.out.println("----Maintenance Facility List----");
            for (Facility e : facilityListMaintenance
            ) {
                System.out.println(e);
            }
        }
    }

    @Override
    public void addNewFacility() {
        boolean flag = true;
        do {
            System.out.print("Menu Add New Facility \n" +
                    "1.Add new Villa \n" +
                    "2.Add new House \n" +
                    "3.Add new Room \n" +
                    "0.Back to menu \n" +
                    "---Choose function: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    //add new Villa
                    addNewVilla();
                    break;
                case "2":
                    //add new House
                    addNewHouse();
                    break;
                case "3":
                    //add new Room
                    addNewRoom();
                    break;
                case "0":
                    //back to menu
                    flag = false;
                    break;
                default:
            }
        } while (flag);
    }

    @Override
    public void enterBaseInfo() {
        do {
            System.out.print("enter name of service: ");
            nameService = scanner.nextLine();
            ValidateInputData.checkServiceName(nameService);
        } while (!ValidateInputData.checkServiceName(nameService));
        do {
            System.out.print("|Usable area must be greater than 30m^2| \n" +
                    "enter usable area: ");
            usableArea = scanner.nextLine();
            ValidateInputData.checkUsableAreaOrPoolArea(usableArea);
        } while (!ValidateInputData.checkUsableAreaOrPoolArea(usableArea));
        do {
            System.out.print("enter cost: ");
            cost = scanner.nextLine();
            ValidateInputData.checkCost(cost);
        } while (!ValidateInputData.checkCost(cost));
        do {
            System.out.print("|maximum number of people < 20| \n" +
                    "enter maximum number of people: ");
            maximumNumberOfPeople = scanner.nextLine();
            ValidateInputData.checkMaximumNumberOfPeople(maximumNumberOfPeople);
        } while (!ValidateInputData.checkMaximumNumberOfPeople(maximumNumberOfPeople));
        do {
            System.out.print("enter rental form: ");
            rentalForm = scanner.nextLine();
            ValidateInputData.checkRentalForm(rentalForm);
        } while (!ValidateInputData.checkRentalForm(rentalForm));
    }

    @Override
    public void addNewVilla() {
        String caller = "Villa";
        do {
            System.out.print("||Form service code ---> [S V V L - * * * *] ('*' is a number)|| \n" +
                    "enter service code: ");
            codeService = scanner.nextLine();
            ValidateInputData.checkServiceCode(codeService, caller);
        } while (!ValidateInputData.checkServiceCode(codeService, caller));
        enterBaseInfo();
        do {
            System.out.print("Enter room standard: ");
            roomStandard = scanner.nextLine();
            ValidateInputData.checkRoomStandard(roomStandard);
        } while (!ValidateInputData.checkRoomStandard(roomStandard));
        do {
            System.out.print("|pool area >= 30| \n" +
                    "enter pool area: ");
            poolArea = scanner.nextLine();
            ValidateInputData.checkUsableAreaOrPoolArea(poolArea);
        } while (!ValidateInputData.checkUsableAreaOrPoolArea(poolArea));
        do {
            System.out.print("enter floor number: ");
            floorNumber = scanner.nextLine();
            ValidateInputData.checkFloorNumber(floorNumber);
        } while (!ValidateInputData.checkFloorNumber(floorNumber));
        Villa newVilla = new Villa(codeService, nameService, usableArea, cost, maximumNumberOfPeople, rentalForm, roomStandard, poolArea, floorNumber);
        facilityIntegerMap.put(newVilla, 0);
        System.out.println("successfully added new " + newVilla);
    }

    @Override
    public void addNewHouse() {
        String caller = "House";
        do {
            System.out.print("||Form service code ---> [S V H O - * * * *] ('*' is a number)|| \n" +
                    "enter service code: ");
            codeService = scanner.nextLine();
            ValidateInputData.checkServiceCode(codeService, caller);
        } while (!ValidateInputData.checkServiceCode(codeService, caller));
        enterBaseInfo();
        do {
            System.out.print("Enter room standard: ");
            roomStandard = scanner.nextLine();
            ValidateInputData.checkRoomStandard(roomStandard);
        } while (!ValidateInputData.checkRoomStandard(roomStandard));
        do {
            System.out.print("|Floor number > 0| \n" +
                    "enter floor number: ");
            floorNumber = scanner.nextLine();
            ValidateInputData.checkFloorNumber(floorNumber);
        } while (!ValidateInputData.checkFloorNumber(floorNumber));
        House newHouse = new House(codeService, nameService, usableArea, cost, maximumNumberOfPeople, rentalForm, roomStandard, floorNumber);
        facilityIntegerMap.put(newHouse, 0);
        System.out.println("successfully added new " + newHouse);
    }

    @Override
    public void addNewRoom() {
        String caller = "Room";
        do {
            System.out.print("||Form service code ---> [S V R O - * * * *] ('*' is a number)|| \n" +
                    "enter service code: ");
            codeService = scanner.nextLine();
            ValidateInputData.checkServiceCode(codeService, caller);
        } while (!ValidateInputData.checkServiceCode(codeService, caller));
        enterBaseInfo();
        System.out.print("enter freeServiceIncluded: ");
        String freeServiceIncluded = scanner.nextLine();
        Room newRoom = new Room(codeService, nameService, usableArea, cost, maximumNumberOfPeople, rentalForm, freeServiceIncluded);
        facilityIntegerMap.put(newRoom, 0);
        System.out.println("successfully added new " + newRoom);
    }
}
