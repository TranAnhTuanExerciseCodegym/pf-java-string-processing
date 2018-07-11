package validateNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumber {
    private Pattern pattern;
    private Matcher matcher;
    private static final String NUMBER_REGEX = "\\([0-9]{2}\\)\\-+[0-9]{10}";

    public ValidateNumber() {
    }

    public boolean validate(String number) {
        pattern = Pattern.compile(NUMBER_REGEX);
        matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
