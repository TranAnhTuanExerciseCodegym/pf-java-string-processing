package validateAccount;

public class AccountExampleTest {
    private static AccountExample accountExample = new AccountExample();
    private static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};

    public static void main(String[] args) {
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }
    }
}
