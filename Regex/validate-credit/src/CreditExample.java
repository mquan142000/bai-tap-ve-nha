import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Phân tích
//^ và $: Đây là các ký tự bắt đầu và kết thúc của chuỗi
//[0-9]{4}: Một nhóm gồm 4 chữ số (từ 0 đến 9).
//[-| ]: Là ký tự phân tách, có thể là dấu gạch ngang (-) hoặc dấu cách ( ).

public class CreditExample {
    private static final String CREDIT_REGEX = "^[0-9]{4}[-| ][0-9]{4}[-| ][0-9]{4}[-| ][0-9]{4}$";

    public CreditExample() {
    }

    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CREDIT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
