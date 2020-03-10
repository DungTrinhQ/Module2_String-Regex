public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;
    public static final String[] validPhoneNumber = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidPhoneNumber = new String[]{" (a8)-(22222222)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String class1 : validPhoneNumber) {
            boolean isvalid = phoneNumber.validate(class1);
            System.out.println("Phone number is " + class1 + " is valid: " + isvalid);
        }

        for (String class2 : invalidPhoneNumber) {
            boolean isvalid = phoneNumber.validate(class2);
            System.out.println("Phone number is " + class2 + " is valid: " + isvalid);
        }
    }
}
