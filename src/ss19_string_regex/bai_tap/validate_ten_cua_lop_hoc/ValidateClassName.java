package ss19_string_regex.bai_tap.validate_ten_cua_lop_hoc;

public class ValidateClassName {
    public static boolean checkClassName(String className) {
        String regex = "^([CAP])\\d{4}([GHIKLM])$";
        return className.matches(regex);
    }
}
