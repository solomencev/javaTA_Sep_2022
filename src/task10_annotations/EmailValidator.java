package task10_annotations;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class EmailValidator {
    public EmailValidator(String email) {
        try {
            Pattern emailCheck = Pattern.compile("^\\w*@\\w*\\.[a-z]{1,3}$");
            boolean emailCheckResult = emailCheck.matcher(email).find();
            System.out.println(emailCheckResult);
            if (emailCheckResult == true) {
                System.out.println("E-mail Validated");
            } else {
                System.out.println("Incorrect E-mail");

            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect E-mail Exception" + e);
        }

    }
}