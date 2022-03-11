package ss19_string_regex.bai_tap.validate_so_dien_thoai;

import java.util.*;

public class TestValidatePhone {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<String, String>() {
        };
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        String name;
        boolean flag = true;
        do {
            do {
                System.out.print("Enter Phone Number(model:(xx)-(0xxxxxxxxx)): ");
                phoneNumber = scanner.nextLine();
                System.out.print("Enter Name: ");
                name = scanner.nextLine();
                ValidatePhone.checkPhone(phoneNumber);
            } while (!ValidatePhone.checkPhone(phoneNumber));
            phoneBook.put(name, phoneNumber);

            //hỏi tiếp tục
            System.out.println("do you want add new Phone(Y/N):");
            String choose = scanner.nextLine();
            if ("Y".equals(choose) || "y".equals(choose)) {
                System.out.println("continue the process of creating contacts...");
            } else if ("N".equals(choose) || "n".equals(choose)) {
                flag = false;
            }
        } while (flag);

        //duyệt hashmap danh bạ.
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Name:" + entry.getKey() + "<~~~>" + entry.getValue());
        }
    }
}
