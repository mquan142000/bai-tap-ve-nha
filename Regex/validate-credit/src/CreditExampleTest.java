import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class CreditExampleTest {

    private static final String[] VALID_CREDIT = new String[]{"4678-4215-2153-2134", "5678 2445 9849 1245"};
    private static final String[] INVALID_CREDIT = new String[]{"2134-12421-124211-122", "23-214-242-1122"};

    public static void main(String[] args) {
        for (String credit : VALID_CREDIT) {
            boolean isValid = CreditExample.validate(credit);
            System.out.println("Credit card: " + credit + " is valid: " + isValid);
        }
        for (String credit : INVALID_CREDIT) {
            boolean isValid = CreditExample.validate(credit);
            System.out.println("Credit card: " + credit + " is valid: " + isValid);
        }
    }
}
