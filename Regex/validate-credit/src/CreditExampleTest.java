public class CreditExampleTest {

    private static CreditExample creditExample;

    private static final String[] validCredit = new String[]{"4678-4215-2153-2134", "5678 2445 9849 1245"};
    private static final String[] invalidCredit = new String[]{"2134-12421-124211-122", "23-214-242-1122"};

    public static void main(String[] args) {
        creditExample = new CreditExample();
        for (String credit : validCredit) {
            boolean isValid = creditExample.validate(credit);
            System.out.println("Credit card: " + credit + " is valid: " + isValid);
        }
        for (String credit : invalidCredit) {
            boolean isValid = creditExample.validate(credit);
            System.out.println("Credit card: " + credit + " is valid: " + isValid);
        }
    }
}
