package stringMethods;

import java.util.Arrays;

public class stringMethods {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = new String("Hello");
        String str3 = "    1   23   ";
        String str4;

        str4=str.intern();   // will get stored in string pool
        System.out.println(str4);
        System.out.println(str4.equals(str));

        // Convert to uppercase and print
        System.out.println(str.toUpperCase());

        // Convert to lowercase and print
        System.out.println(str.toLowerCase());

        // Print the character at index 3
        System.out.println(str.charAt(3));

        // Find the index of the first occurrence of 'l'
        System.out.println(str.indexOf('l'));

        // Find the index of the substring "ll"
        System.out.println(str.indexOf("ll"));

        // Get and print the length of the string
        System.out.println(str.length());

        // Get and print the byte representation of the string
        System.out.println(Arrays.toString(str3.getBytes()));

        // Print the characters as an IntStream (need to collect to a list or array to print)
        str.chars().forEach(c -> System.out.print((char) c + " "));
        System.out.println(); // to move to the next line

        // Compare two strings lexicographically
        System.out.println(str.compareTo(str2));

        // Check if the two strings are equal
        System.out.println(str.equals(str2));

        // Print a substring from index 2 to index 4 (don;t include 4)
        System.out.println(str.substring(2, 4));

        // Concatenate the string " Bye" and print
        System.out.println(str.concat(" Bye"));

        // Concatenate using the + operator and print
        System.out.println(str + " !!");

        // Trim any leading or trailing spaces (no spaces in this case)
        System.out.println(str3.trim());

        // Remove leading and trailing whitespace using strip()
        System.out.println(str3.strip());

        // Converting to other data datatypes
        int a=124;
        System.out.println(String.valueOf(a));

        String myStr = "Split a ,string";
        String regex = ",";
        String[] myArray = myStr.split(regex);
        for (String s : myArray) {
            System.out.println(s);
        }
    }
}
