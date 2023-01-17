package case_study_md2.furama_resort.services.impl;

import case_study_md2.furama_resort.models.Facility;
import case_study_md2.furama_resort.models.House;
import case_study_md2.furama_resort.models.Room;
import case_study_md2.furama_resort.models.Villa;
import case_study_md2.furama_resort.services.FacilityService;
import case_study_md2.furama_resort.utils.ReadAndWriteFile;
import case_study_md2.furama_resort.utils.ValidateInputData;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    public static Map<Facility, Integer> getFacilityIntegerMap() {
        return facilityIntegerMap;
    }

    public static void setFacilityIntegerMap(Map<Facility, Integer> facilityIntegerMap) {
        FacilityServiceImpl.facilityIntegerMap = facilityIntegerMap;
    }

    static List<Facility> facilityListMaintenance = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    final static String VILLA_SOURCE_FILE = "src\\case_study_md2\\furama_resort\\data\\villa.csv";
    final static String HOUSE_SOURCE_FILE = "src\\case_study_md2\\furama_resort\\data\\house.csv";
    final static String ROOM_SOURCE_FILE = "src\\case_study_md2\\furama_resort\\data\\room.csv";

    static { //copy data từ 3 file villa house và room vào map
        FacilityServiceImpl.setFacilityIntegerMap(ReadAndWriteFile.readFileVillaHouseRoom(VILLA_SOURCE_FILE, HOUSE_SOURCE_FILE, ROOM_SOURCE_FILE));
    }

    final static String[] RENTAL_FORM_LIST = {"Year", "Month", "Week", "Day", "Hour"};
    private String codeService;
    private String nameService;
    private String usableArea;
    private String cost;
    private String capacity;
    private String rentalForm;
    private String floorNumber;
    private String roomStandard;


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
                    System.out.println("Not a choice!");
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
            System.out.print("|capacity < 20| \n" +
                    "enter capacity: ");
            capacity = scanner.nextLine();
            ValidateInputData.checkCapacity(capacity);
        } while (!ValidateInputData.checkCapacity(capacity));
        do {
            System.out.print("-----Rental Form List---- \n" +
                    "1.Year \n" +
                    "2.Month \n" +
                    "3.Week \n" +
                    "4.Day \n" +
                    "5.Hour \n" +
                    "Enter number: ---> ");
            rentalForm = scanner.nextLine();
            ValidateInputData.checkRentalFormNumber(rentalForm);
        } while (!ValidateInputData.checkRentalFormNumber(rentalForm));
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
        String poolArea;
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
        Villa newVilla = new Villa(codeService, nameService, usableArea, cost, capacity, RENTAL_FORM_LIST[Integer.parseInt(rentalForm) - 1], roomStandard, poolArea, floorNumber);
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
        House newHouse = new House(codeService, nameService, usableArea, cost, capacity, RENTAL_FORM_LIST[Integer.parseInt(rentalForm) - 1], roomStandard, floorNumber);
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
        Room newRoom = new Room(codeService, nameService, usableArea, cost, capacity, RENTAL_FORM_LIST[Integer.parseInt(rentalForm) - 1], freeServiceIncluded);
        facilityIntegerMap.put(newRoom, 0);
        System.out.println("successfully added new " + newRoom);
    }

    public void saveDataFacility() {
        ReadAndWriteFile.writeToFileAllFacility(VILLA_SOURCE_FILE, HOUSE_SOURCE_FILE, ROOM_SOURCE_FILE, getFacilityIntegerMap());
    }
}
