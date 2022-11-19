package task10_annotations;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class IsbnValidator  {
    public IsbnValidator(String isbn) {
        try {
            Pattern isbnCheck = Pattern.compile("^(((ISBN-13:)(\\d{3})-?(\\d{10}))|((ISBN-10:)(\\d{10})))$");
            boolean isbnCheckResult = isbnCheck.matcher(isbn).find();
            System.out.println(isbnCheckResult);
            if (isbnCheckResult == true) {
                System.out.println("ISBN Validated");
            } else {
                System.out.println("Wrong ISBN");

            }
        } catch (InputMismatchException e) {
            System.out.println("mistaken ISBN error" + e);
        }
    }
}