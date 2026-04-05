package Calender.util;

public class Validator {
    public static boolean isValidDate(String date) {
        return date != null && date.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    public static boolean isValidTime(String time) {
        return time != null && !time.trim().isEmpty();
    }
}