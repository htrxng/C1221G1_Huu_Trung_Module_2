package case_study_md2.furama_resort.utils;

import case_study_md2.furama_resort.models.*;

import java.io.*;
import java.util.*;

public class ReadAndWriteFile {

    public static void writeFileCustomer(String filePath, List<Customer> list) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Customer customer : list) {
                bufferedWriter.write(customer.getInformationToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("file does not exist!");
            e.printStackTrace();
        }
    }

    public static void writeFileEmployee(String filePath, List<Employee> list) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Employee employee : list) {
                bufferedWriter.write(employee.getInformationToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("file does not exist");
            e.printStackTrace();
        }
    }

    public static List<Customer> readFileCustomer(String filePath) { //read file customer
        List<Customer> customerList = new LinkedList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            String[] arr;
            while ((line = br.readLine()) != null) {
                arr = line.split(",");
//                  public Customer(String customerCode, String name, String birthday, String gender, int iDNo, String phoneNumber, String email,  String typeOfCustomer, String address) {
                customerList.add(new Customer(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), arr[5], arr[6], arr[7], arr[8]));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File không tồn tại or nội dung có lỗi!");
        }
        return customerList;
    }

    public static List<Employee> readFileEmployee(String filePath) { //read file employee
        List<Employee> employeeList = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            String[] arr;
            while ((line = br.readLine()) != null) {
                arr = line.split(",");
                //public Employee( String employeeCode,String name, String birthday, String gender, int iDNo, String phoneNumber, String email, String academicLevel, String position, double wage)
                employeeList.add(new Employee(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9])));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File không tồn tại or nội dung có lỗi!");
        }
        return employeeList;
    }


    public static Map<Facility,Integer>  readFileVillaHouseRoom(String filePathVilla,String filePathHouse,String filePathRoom) {
        Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
        try {
            File fileVilla = new File(filePathVilla);
            File fileHouse = new File(filePathHouse);
            File fileRoom = new File(filePathRoom);
            if (!fileVilla.exists() ||!fileHouse.exists() ||!fileRoom.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader brVilla = new BufferedReader(new FileReader(fileVilla));
            BufferedReader brHouse = new BufferedReader(new FileReader(fileHouse));
            BufferedReader brRoom = new BufferedReader(new FileReader(fileRoom));
            String line = "";
            String[] arr;
            while ((line = brVilla.readLine()) != null) {
                arr = line.split(",");
                //serviceCode,nameService,usableArea,cost,maximumNumberOfPeople,rentalForm,roomStandard,poolArea,floorNumber
                facilityIntegerMap.put(new Villa(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]),Integer.parseInt(arr[9]));
            }
            while ((line = brHouse.readLine())!= null) {
                arr = line.split(",");
//                (codeService, nameService, usableArea, cost, maximumNumberOfPeople, rentalForm, roomStandard, floorNumber)
                facilityIntegerMap.put(new House(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7]),Integer.parseInt(arr[8]));
            }
            while ((line = brRoom.readLine())!= null) {
                arr = line.split(",");
                //codeService, nameService, usableArea, cost, maximumNumberOfPeople, rentalForm, freeServiceIncluded
                facilityIntegerMap.put(new Room(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6]),Integer.parseInt(arr[7]));
            }
            brVilla.close();
            brHouse.close();
            brRoom.close();
        } catch (Exception e) {
            System.out.println("file does not exist or error content!");
        }
        return facilityIntegerMap;
    }

    public static void writeToFileAllFacility(String filePathVilla, String filePathHouse, String filePathRoom, Map<Facility, Integer> facilityIntegerMap) {
        try {
            File fileVilla = new File(filePathVilla);
            File fileHouse = new File(filePathHouse);
            File fileRoom = new File(filePathRoom);
            if (!fileVilla.exists() || !fileHouse.exists() || !fileRoom.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter writerVilla = new FileWriter(fileVilla);
            FileWriter writerHouse = new FileWriter(fileHouse);
            FileWriter writerRoom = new FileWriter(fileRoom);
            BufferedWriter bufferedWriterVilla = new BufferedWriter(writerVilla);
            BufferedWriter bufferedWriterHouse = new BufferedWriter(writerHouse);
            BufferedWriter bufferedWriterRoom = new BufferedWriter(writerRoom);

            Set<Facility> set = facilityIntegerMap.keySet();
            for (Facility key : set
            ) {
                boolean checkVilla = key instanceof Villa;
                boolean checkHouse = key instanceof House;
                boolean checkRoom = key instanceof Room;
                if (checkVilla) {
                    bufferedWriterVilla.write(key.getInforToCSV() + "," + facilityIntegerMap.get(key));
                    bufferedWriterVilla.newLine();
                } else if (checkHouse) {
                    bufferedWriterHouse.write(key.getInforToCSV() + "," + facilityIntegerMap.get(key));
                    bufferedWriterHouse.newLine();
                } else if (checkRoom) {
                    bufferedWriterRoom.write(key.getInforToCSV() + "," + facilityIntegerMap.get(key));
                    bufferedWriterRoom.newLine();
                }
            }
            bufferedWriterVilla.close();
            bufferedWriterHouse.close();
            bufferedWriterRoom.close();
        } catch (IOException e) {
            System.out.println("file does not exist!");
            e.printStackTrace();
        }
    }
}
