public class ClassNameTest {
    private static ClassName className;
    public static final String[] validClassName = new String[]{"C0318G","C1219H"};
    public static final String[] invalidClassName = new String[]{"M0318G", " P0323A"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String name : validClassName) {
            boolean isValid = className.validate(name);
            System.out.println("Class name is " + name + " is valid: " + isValid);
        }
        for (String name : invalidClassName) {
            boolean isvalid = className.validate(name);
            System.out.println("Account is " + name +" is valid: "+ isvalid);
        }
    }
}
