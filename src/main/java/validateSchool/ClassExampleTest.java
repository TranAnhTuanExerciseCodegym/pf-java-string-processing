package validateSchool;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExampleTest {
    private Matcher matcher;
    private Pattern pattern;
    private static final String CLASS_REGEX = "^[CAB]+[0-9]{4}+[GHIKLM]$";

    public ClassExampleTest() {
    }

    public boolean validate(String isvalidate) {
        pattern = Pattern.compile(CLASS_REGEX);
        matcher = pattern.matcher(isvalidate);
        return matcher.matches();
    }
}
