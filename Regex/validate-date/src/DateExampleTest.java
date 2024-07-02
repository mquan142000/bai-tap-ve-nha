public class DateExampleTest {

    private static DateExample dateExample;

    private static final String[] validDate = new String[]{"2/7/2024", "12-11-2023", "13/4/2024"};
    private static final String[] invalidDate = new String[]{"2,29,2024", "13 13 2024", "30.12.2023"};

    public static void main(String[] args) {
        dateExample = new DateExample();
        for (String date : validDate) {
            boolean isValid = dateExample.validate(date);
            System.out.println("Date: " + date + " is valid: " + isValid);
        }
        for (String date : invalidDate) {
            boolean isValid = dateExample.validate(date);
            System.out.println("Date: " + date + " is valid: " + isValid);
        }
    }
}
