package regex;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("(a.)");
        Matcher match=pattern.matcher("Bacanabana");

        // matcher class methods
        System.out.println(match.matches());   // tries to match entire string
        System.out.println(match.find());      // find next match after match pointer (if used)
        while(match.find()) {
            System.out.println("Match: "+match.group());
            System.out.println("Found at index: "+match.start());
            System.out.println("End at index: "+match.end());
        }
        System.out.println(match.groupCount());


        // Pattern class methods
        System.out.println(pattern.matches(".*z", "Xyz"));    // Match entire string with regex without making matcher object

        String splits[]=pattern.split("Bananaana");
        System.out.println(Arrays.toString(splits));

        String a=pattern.pattern();
    }
}
