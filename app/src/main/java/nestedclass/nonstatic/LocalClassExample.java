package nestedclass.nonstatic;

/**
 * Created by lixiaoye on 2019/3/12.
 */

public class LocalClassExample {
    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {
        final int numberLength = 11;
        class PhoneNumber {//本地内部类
            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber) {
                String currentNumber = phoneNumber.replaceAll(regularExpression, "");
                if (currentNumber.length() == numberLength) {
                    formattedPhoneNumber = currentNumber;
                } else {
                    formattedPhoneNumber = null;
                }
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }
        }
        PhoneNumber num1 = new PhoneNumber(phoneNumber1);
        PhoneNumber num2 = new PhoneNumber(phoneNumber2);
        if (num1.getNumber() == null)
            System.out.println("First number is invalid");
        else
            System.out.println("First number is " + num1.getNumber());
        if (num2.getNumber() == null)
            System.out.println("Second number is invalid");
        else
            System.out.println("Second number is " + num2.getNumber());
    }

    public static void main(String[] args) {
        validatePhoneNumber("123-456-789-10", "456-789");
    }
    /**
     * First number is 12345678910
     Second number is invalid
     */
}
