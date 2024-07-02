import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Phân tích
//^ và $: Đây là các ký tự bắt đầu và kết thúc của chuỗi
//[0-1][0-9]: Giờ từ 00 đến 19.
//|: Toán tử OR, nghĩa là "hoặc".
//2[0-3]: Giờ từ 20 đến 23.
//:: Ký tự phân tách giữa giờ và phút.
//([0-5][0-9]): Đại diện cho phút, từ 00 đến 59.

public class TimeExample {
    private static final String TIME_REGEX = "^([0-1][0-9]|2[0-3]):([0-5][0-9])$";

    public TimeExample() {
    }

    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(TIME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
