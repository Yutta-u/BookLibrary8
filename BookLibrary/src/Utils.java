public class Utils {
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++)
            if (!(str.charAt(i) >= 48 && str.charAt(i) <= 57))
               return false;
        return true;
    }
}
