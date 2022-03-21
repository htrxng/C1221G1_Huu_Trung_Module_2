package case_study_md2.furama_resort.utils;

public class ValidateInputData {
    static final String REGEX_VILLA_SERVICE_CODE = "^SV(VL)-\\d{4}$";
    static final String REGEX_HOUSE_SERVICE_CODE = "^SV(HO)-\\d{4}$";
    static final String REGEX_ROOM_SERVICE_CODE = "^SV(RO)-\\d{4}$";
    static final String REGEX_SERVICE_NAME = "^[A-Z][a-z0-9\\s]+$";
    static final String REGEX_USABLE_AREA_AND_POOL_AREA = "^([3-9][0-9]|[1-9][0-9]{2,})$";
    static final String REGEX_COST = "^[1-9][0-9]*$";
    static final String REGEX_MAXIMUM_NUMBER_OF_PEOPLE = "^([1-9]|[1][0-9])$";
    static final String REGEX_FLOOR_NUMBER = "^[1-9]+$";
    static final String REGEX_ROOM_STANDARD = "^[A-Z][a-z0-9\\s]+$";
    static final String REGEX_EMPLOYEE_CODE = "^[E][0-9]{4}$";
    static final String REGEX_CUSTOMER_CODE = "^[C][0-9]{4}$";
    static final String REGEX_EMAIL = "^[a-z0-9]+[a-z0-9]*@[a-z0-9]+(\\.[a-z0-9]+)$";
    static final String REGEX_PHONE = "[0]\\d{9}$";
    static final String REGEX_GENDER = "^((Male)|(Female)|(Others))$";
    static final String REGEX_RENTAL_FORM_NUMBER = "^[1-5]$";


    public static boolean checkServiceCode(String serviceCode,String caller){
        String deputize = "";  //deputize: đại diện
        switch (caller) {
            case "Villa":
                deputize = REGEX_VILLA_SERVICE_CODE;
                break;
            case "House":
                deputize = REGEX_HOUSE_SERVICE_CODE;
                break;
            case "Room":
                deputize = REGEX_ROOM_SERVICE_CODE;
                break;
        }
        return serviceCode.matches(deputize);
    }

    public static boolean checkServiceName(String serviceName){
        return  serviceName.matches(REGEX_SERVICE_NAME);
    }

    public static boolean checkUsableAreaOrPoolArea(String area){
        return  area.matches(REGEX_USABLE_AREA_AND_POOL_AREA);
    }

    public static boolean checkCost(String cost){
        return  cost.matches(REGEX_COST);
    }

    public static boolean checkMaximumNumberOfPeople(String maximumNumberOfPeople){
        return  maximumNumberOfPeople.matches(REGEX_MAXIMUM_NUMBER_OF_PEOPLE);
    }

    public static boolean checkFloorNumber(String floorNumber){
            return  floorNumber.matches(REGEX_FLOOR_NUMBER);
        }

    public static boolean checkRoomStandard(String roomStandard){
        return  roomStandard.matches(REGEX_ROOM_STANDARD);
    }

    public static boolean checkEmployeeCode(String employeeCode) { return employeeCode.matches(REGEX_EMPLOYEE_CODE);}

    public static boolean checkEmail(String email) {return email.matches(REGEX_EMAIL);}

    public static boolean checkPhone(String phone) {return phone.matches(REGEX_PHONE);}

    public static boolean checkGender(String gender) {return gender.matches(REGEX_GENDER);}

    public static boolean checkCustomerCode(String customerCode) {return customerCode.matches(REGEX_CUSTOMER_CODE);}

    public static boolean checkRentalFormNumber(String rentalForm) {return  rentalForm.matches(REGEX_RENTAL_FORM_NUMBER);}

// temp
// public static boolean checkServiceCode(String serviceCode){
//        String regex = "";
//        return  serviceCode.matches(regex);
//    }

}
