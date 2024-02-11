package strategy;

public class CamelCaseConverter implements CaseConverter {
    @Override
    public String convert(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1).toLowerCase());
            }
        }
        return result.toString();
    }
}

