package task10_annotations;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class DataValidator {
    public DataValidator(String date) {
        try {
            Pattern dateCheck = Pattern.compile("^\\(\\d{4}-(Jan|Mar|May|Jul|Aug|Oct|Dec)-\\d{2}\\)$");
            boolean dateCheckResult = dateCheck.matcher(date).find();
            System.out.println(dateCheckResult);
            if (dateCheckResult == true) {
                System.out.println("Date Validated");
            } else {
                System.out.println("Incorrect Date");

            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect E-mail Exception" + e);
        }
    }
}