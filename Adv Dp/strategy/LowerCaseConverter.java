package strategy;

public class LowerCaseConverter implements CaseConverter {
    @Override
    public String convert(String text) {
        return text.toLowerCase();
    }
}
