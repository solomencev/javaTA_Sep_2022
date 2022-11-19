package task10_annotations;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class PhoneNumberValidator  {
    public PhoneNumberValidator(String phone) {
        try {
            Pattern phoneCheck = Pattern.compile("^(\\+7|8)-?(\\d{3})-?(\\d{3})-?(\\d{2})-?(\\d{2})$");
            boolean phoneCheckResult = phoneCheck.matcher(phone).find();
            System.out.println(phoneCheckResult);
            if (phoneCheckResult == true) {
                System.out.println("Phone Validated");
            } else {
                System.out.println("Wrong Phone");

            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong E-mail Exception" + e);
        }
    }
}