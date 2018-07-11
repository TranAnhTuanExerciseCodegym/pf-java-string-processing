package validateEmail;


public class EmailExampleTest {
    private static ValidateEmail validateEmail;
    private static final String[] email = new String[]{"agmail.com", " ab@yahoo.com", "abc@hotmail.com", "abc%hotmail.com"};

    public static void main(String[] args) throws Exception {
        validateEmail = new ValidateEmail();
        for (String email : email) {
            System.out.println(email);
        }
        for (String email : email) {
            boolean isValid = validateEmail.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);

        }
    }
}
