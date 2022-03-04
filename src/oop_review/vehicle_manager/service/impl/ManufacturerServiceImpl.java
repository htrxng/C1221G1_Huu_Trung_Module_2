package oop_review.vehicle_manager.service.impl;

import oop_review.vehicle_manager.model.Manufacturer;

import java.util.ArrayList;
import java.util.Scanner;

public class ManufacturerServiceImpl {

    static ArrayList<Manufacturer> manufacturerList = new ArrayList<Manufacturer>(7);
    Scanner scanner = new Scanner(System.in);

    static {
        Manufacturer manufacturer1 = new Manufacturer("HSX-001", "Yamaha", "Nhật Bản");
        Manufacturer manufacturer2 = new Manufacturer("HSX-002", "Honda", "Nhật Bản");
        Manufacturer manufacturer3 = new Manufacturer("HSX-003", "Dongfeng", "Trung Quốc");
        Manufacturer manufacturer4 = new Manufacturer("HSX-004", "Huyndai", "Hàn Quốc");
        Manufacturer manufacturer5 = new Manufacturer("HSX-005", "Ford", "Mỹ");
        Manufacturer manufacturer6 = new Manufacturer("HSX-006", "Toyota", "Nhật Bản");
        Manufacturer manufacturer7 = new Manufacturer("HSX-007", "Hino", "Nhật Bản");
        manufacturerList.add(manufacturer1);
        manufacturerList.add(manufacturer2);
        manufacturerList.add(manufacturer3);
        manufacturerList.add(manufacturer4);
        manufacturerList.add(manufacturer5);
        manufacturerList.add(manufacturer6);
        manufacturerList.add(manufacturer7);
    }

    Manufacturer chooseManufacturer() {
        System.out.println("Manufacturer List: ");
        for (int i = 0; i < manufacturerList.size(); i++) {
            System.out.println((i + 1) + "." + manufacturerList.get(i));
        }
        System.out.println("choose manufacturer:");
        int choose = Integer.parseInt(scanner.nextLine());

        return manufacturerList.get(choose - 1);
    }

}
