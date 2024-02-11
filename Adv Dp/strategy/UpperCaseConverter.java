package strategy;

public class UpperCaseConverter implements CaseConverter {
    @Override
    public String convert(String text) {
        return text.toUpperCase();
    }
}
