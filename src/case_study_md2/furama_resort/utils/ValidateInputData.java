package case_study_md2.furama_resort.utils;

public class ValidateInputData {
    static final String REGEX_VILLA_SERVICE_CODE = "^SV(VL)-\\d{4}$";
    static final String REGEX_HOUSE_SERVICE_CODE = "^SV(HO)-\\d{4}$";
    static final String REGEX_ROOM_SERVICE_CODE = "^SV(RO)-\\d{4}$";
    static final String REGEX_SERVICE_NAME = "^[A-Z][a-z0-9\\s]+$";
    static final String REGEX_USABLE_AREA_AND_POOL_AREA = "^([3-9][0-9]|[1-9][0-9]{2,})$";
    static final String REGEX_COST = "^[1-9][0-9]*$";
    static final String REGEX_CAPACITY = "^([1-9]|[1][0-9])$";
    static final String REGEX_FLOOR_NUMBER = "^[1-9]+$";
    static final String REGEX_ROOM_STANDARD = "^[A-Z][a-z0-9\\s]+$";
    static final String REGEX_EMPLOYEE_CODE = "^[E][0-9]{4}$";
    static final String REGEX_CUSTOMER_CODE = "^[C][0-9]{4}$";
    static final String REGEX_EMAIL = "^[a-z0-9]+[a-z0-9]*@[a-z0-9]+(\\.[a-z0-9]+)$";
    static final String REGEX_PHONE = "[0]\\d{9}$";
    static final String REGEX_GENDER = "^((Male)|(Female)|(Others))$";
    static final String REGEX_RENTAL_FORM_NUMBER = "^[1-5]$";

    static final String REGEX_TEMP = "^\\d+$";
    boolean check = "aaa".matches(REGEX_TEMP);

    /***
     *  * 0/n
     *  + 1/n
     *  ? 0/1
     * \d so
     * \s trống
     * \w chữ
     * \b a-zA-Z0-9
     */


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

    public static boolean checkCapacity(String capacity){
        return  capacity.matches(REGEX_CAPACITY);
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

//private static final String POSITIVE_INTEGERS_REGEX = "^\\+*\\d+$";
//private static final String POSITION_DOUBLE_REGEX = "^\\+*\\d+(\\.\\d+)*$";
//private static final String FULL_NAME_REGEX = "^\\p{Lu}\\p{Ll}+( \\p{Lu}\\p{Ll}+)*$";
//private static final String BIRTHDAY_REGEX = "^(?:0[1-9]|[12][0-9]|3[01])[-/.](?:0[1-9]|1[012])[-/.](?:19\\d{2}|20[01][0-9]|202[12])$";
//private static final String DATE_REGEX = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
//private static final String EMPLOYEE_ID_REGEX = "^E\\d{5}$";
//private static final String CUSTOMER_ID_REGEX = "^C\\d{5}$";
//private static final String GENDER_REGEX = "^[a-zA-Z]+$";
//private static final String ID_REGEX = "^\\d{9}|\\d{12}$";
//private static final String TELEPHONE_NUMBER_REGEX = "^[01]\\d{9}$";
//private static final String EMAIL_ADDRESS_REGEX = "^\\w+([.-]?\\w+)*@[a-z]+\\.(\\w+){2,}(\\.\\w{2,3})?";
//private static final String ADDRESS_REGEX = "^\\d*(\\s\\w+)+|(\\w+)(\\s\\w+)+$";
//private static final String INPUT_REGEX = "^\\w+(\\s\\w+)*$";
//private static final String AREA_REGEX = "^([3-9]\\d+(.\\d+)?)|[1-9](\\d){2,}(.\\d+)?$";
//private static final String VILLA_ID_REGEX = "^SVVL-\\d{4}$";
//private static final String ROOM_ID_REGEX = "^SVRO-\\d{4}$";
//private static final String HOUSE_ID_REGEX = "^SVHO-\\d{4}$";
//private static final String STANDARD_NAME_REGEX = "^[A-Z]\\w+$";
//private static final String MAXIMUM_PEOPLE_REGEX = "^([1-9]|(1\\d))$";
//private static final String BOOKING_CODE_REGEX = "^B\\d{6}$";
//private static final String DATE_LEAP_YEAR_REGEX = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
//        "(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?" +
//        "(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)" +
//        "(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
//private static final String REQUIRED_INPUT_REGEX = "^\\w+(\\s\\w+)*$";
}
