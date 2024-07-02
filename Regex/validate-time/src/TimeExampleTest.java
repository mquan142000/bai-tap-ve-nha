public class TimeExampleTest {


    private static final String[] validTime = new String[]{"23:12", "10:13", "03:30"};
    private static final String[] invalidTime = new String[]{"24", "25:00", "25:60"};

    public static void main(String[] args) {
        for (String time : validTime) {
            boolean isValid = TimeExample.validate(time);
            System.out.println("Time: " + time + " is valid: " + isValid);
        }
        for (String time : invalidTime) {
            boolean isValid = TimeExample.validate(time);
            System.out.println("Time: " + time + " is valid: " + isValid);
        }
    }
}
