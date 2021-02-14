import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment3 {

    public static void main(String[] args) {
        String name="John";
        Pattern myPattern = Pattern.compile("^[A-Z][a-z]+");
        Matcher nameMatcher = myPattern.matcher(name);
        System.out.println(nameMatcher.find());

        String username="s20surname";
        Pattern usernamePattern=Pattern.compile("^[a-z][0-9]{2}[a-z]+");
        Matcher usernameMatcher= usernamePattern.matcher(username);
        System.out.println(usernameMatcher.find());

        String personCodeOfLatvian="121200-11311";
        Pattern personCodePattern=Pattern.compile("^[0-9]{6}-[0-9]{5}");
        Matcher personCodeMatcher= personCodePattern.matcher(personCodeOfLatvian);
        System.out.println(personCodeMatcher.find());

    }
}
