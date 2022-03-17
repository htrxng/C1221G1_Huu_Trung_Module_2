package case_study_md2.furama_resort.utils;

public class ValidateInputData {
    public static boolean checkServiceCode(String serviceCode,String caller){
        String regexVillaServiceCode = "^SV(VL)-\\d{4}$";
        String regexHouseServiceCode = "^SV(HO)-\\d{4}$";
        String regexRoomServiceCode = "^SV(RO)-\\d{4}$";
        String deputize = "";  //deputize: đại diện
        switch (caller) {
            case "Villa":
                deputize = regexVillaServiceCode;
                break;
            case "House":
                deputize = regexHouseServiceCode;
                break;
            case "Room":
                deputize = regexRoomServiceCode;
                break;
        }
        return serviceCode.matches(deputize);
    }

    public static boolean checkServiceName(String serviceName){
        String regexServiceName = "^[A-Z][a-z0-9\\s]+$";
        return  serviceName.matches(regexServiceName);
    }

    public static boolean checkUsableAreaOrPoolArea(String area){
        String regex = "^([3-9][0-9]|[1-9][0-9]{2,})$";
        return  area.matches(regex);
    }

    public static boolean checkCost(String cost){
        String regex = "^[1-9][0-9]*$";
        return  cost.matches(regex);
    }

    public static boolean checkMaximumNumberOfPeople(String maximumNumberOfPeople){
        String regex = "^([1-9]|[1][0-9])$";
        return  maximumNumberOfPeople.matches(regex);
    }

    public static boolean checkFloorNumber(String floorNumber){
            String regex = "^[1-9]+$";
            return  floorNumber.matches(regex);
        }

    public static boolean checkRentalForm(String rentalForm){
        String regexServiceName = "^[A-Z][a-z0-9\\s]+$";
        return  rentalForm.matches(regexServiceName);
    }

    public static boolean checkRoomStandard(String roomStandard){
        String regexServiceName = "^[A-Z][a-z0-9\\s]+$";
        return  roomStandard.matches(regexServiceName);
    }


// temp
// public static boolean checkServiceCode(String serviceCode){
//        String regex = "";
//        return  serviceCode.matches(regex);
//    }

}
