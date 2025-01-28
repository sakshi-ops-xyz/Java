package stringUtil;
import org.apache.commons.lang3.StringUtils;

public class MyClass {
}

class Main {
    public static void main(String[] args) {
        // Initialize strings
        String str = "   Hello, Java World!   ";
        String str2 = "hello, JAVA world!";

        System.out.println("Length of str: " + StringUtils.length(str));  // 23

        System.out.println("Trimmed string: '" + StringUtils.trim(str) + "'");

        System.out.println("Uppercase: " + StringUtils.upperCase(str)); // "HELLO, JAVA WORLD!"
        System.out.println("Lowercase: " + StringUtils.lowerCase(str2)); // "hello, java world!"

        System.out.println("Are str and str2 equal (case-sensitive)? " + StringUtils.equals(str, str2)); // false

        System.out.println("Are str and str2 equal (case-insensitive)? " + StringUtils.equalsIgnoreCase(str, str2)); // true

        System.out.println("Does str start with 'Hello'? " + StringUtils.startsWith(str, "Hello")); // true

        System.out.println("Does str end with 'World!'? " + StringUtils.endsWith(str, "World!")); // true

        System.out.println("Character at index 5: " + StringUtils.substring(str, 5, 6));  // ,

        System.out.println("Substring (7 to 15): " + StringUtils.substring(str, 7, 15)); // "Java Jav"

        String replaced = StringUtils.replace(str, "Java", "C++");
        System.out.println("Replaced string: " + replaced); // "   Hello, C++ World!   "

        String[] parts = StringUtils.split(str, ',');
        System.out.println("Split string:");
        for (String part : parts) {
            System.out.println("'" + StringUtils.trim(part) + "'");
        }

        System.out.println("Index of 'Java': " + StringUtils.indexOf(str, "Java")); // 7

        System.out.println("Compare str and str2 (lexicographically): " + StringUtils.compare(str, str2));  // Positive value

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.delete(0, 1);
        System.out.println("Modified StringBuilder: " + sb);  // "ello, World"

        String emptyStr = "";
        System.out.println("Is emptyStr empty? " + StringUtils.isEmpty(emptyStr));  // true
        System.out.println("Is emptyStr blank? " + StringUtils.isBlank(emptyStr));  // true
    }
}
