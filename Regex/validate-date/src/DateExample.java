import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Phân tích
//^ và $: Đây là các ký tự bắt đầu và kết thúc của chuỗi
//[0-9]{1,2}: Đại diện cho một hoặc hai chữ số, tức là ngày hoặc tháng có thể có giá trị từ 1 đến 31 hoặc từ 1 đến 12.
//[-|/]: Là ký tự phân tách, có thể là dấu gạch ngang (-) hoặc dấu cách (/).
//[0-9]{4}: Đại diện cho bốn chữ số của năm.

public class DateExample {
    private static final String DATE_FORMAT = "^[0-9]{1,2}[-|\\/][0-9]{1,2}[-|\\/][0-9]{4}$";

    public DateExample() {
    }

    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(DATE_FORMAT);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
