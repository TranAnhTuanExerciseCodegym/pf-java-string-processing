package validateNumber;


public class ValidateNumberTest {
    private static ValidateNumber validateNumber = new ValidateNumber();
    private static String[] validNumber = new String[]{"(84)-0978489648", "a8-22222222"};

    public static void main(String[] args) {
        for (String x : validNumber) {
            boolean isvalidate = validateNumber.validate(x);
            System.out.println(x + isvalidate);
        }
    }
}
