package validateAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    private Matcher matcher;
    private Pattern pattern;

    public AccountExample() {
    }

    public boolean validate(String regex) {
        pattern = Pattern.compile(ACCOUNT_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
