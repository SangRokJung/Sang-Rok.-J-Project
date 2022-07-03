package hello0703;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z]$";
        String input = "Test String";

        System.out.println(Pattern.matches(regex, input));

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println(matcher.matches());
    }
}
