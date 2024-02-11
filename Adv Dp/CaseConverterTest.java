// package strategy;

import strategy.CamelCaseConverter;
import strategy.CaseConverter;
import strategy.LowerCaseConverter;
import strategy.UpperCaseConverter;

public class CaseConverterTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String text = "This is a Test String";

        CaseConverter lowerCaseConverter = new LowerCaseConverter();
        CaseConverter upperCaseConverter = new UpperCaseConverter();
        CaseConverter camelCaseConverter = new CamelCaseConverter();

        System.out.println("Lowercase: " + lowerCaseConverter.convert(text));
        System.out.println("Uppercase: " + upperCaseConverter.convert(text));
        System.out.println("Camel Case: " + camelCaseConverter.convert(text));
    }
}

