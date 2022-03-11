package ss19_string_regex.bai_tap.validate_so_dien_thoai;

public class ValidatePhone {
    public static boolean checkPhone(String phone) {
        String regex = "^\\d{2}-[0]\\d{9}$";
        return phone.matches(regex);
    }
}
