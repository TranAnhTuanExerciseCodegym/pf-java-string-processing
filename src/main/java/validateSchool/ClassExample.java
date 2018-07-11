package validateSchool;

public class ClassExample {
    private static ClassExampleTest classExampleTest = new ClassExampleTest();
    private static String[] validate = new String[]{"C1234G", "C0318G"};

    public static void main(String[] args) {
        for (String x : validate) {
            boolean isvalid = classExampleTest.validate(x);
            System.out.println(x + isvalid);
        }

    }
}
