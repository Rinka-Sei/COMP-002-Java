package BSIT2ndSem.methodsandclasses;

public class StringMethods {

    public static void main(String[] args) {
        String riverName = "Mississippi";

        System.out.println("String Length: " + riverName.length());

        System.out.println("Character at 3rd Position: " + riverName.charAt(3));

        System.out.println("Substring starting at index 3: " + riverName.substring(3));

        System.out.println("Substring starting at index 2 ending at index 5: " + riverName.substring(2, 5));

        String firstPart = "Missi";
        String secondPart = "ssipi";

        System.out.println("Concatenated string: " + firstPart.concat(secondPart));

        String hobbyQuote = "JAV All Day Everyday";
        System.out.println("Index of 'Everyday': " + hobbyQuote.indexOf("Everyday"));

        System.out.println("Index of 'y': " + hobbyQuote.indexOf('y', 3));

        boolean isEqual = "JAV".equals("jav");
        System.out.println("Checking equality: " + isEqual);

        isEqual = "JAV".equals("JAV");
        System.out.println("Checking equality: " + isEqual);

        isEqual = "JAV".equalsIgnoreCase("JaV");
        System.out.println("Checking equality: " + isEqual);

        int asciiDifference = firstPart.compareTo(secondPart);
        System.out.println("The Diff between ASCII values is: " + asciiDifference);

        String brandName = "JavGuru";
        System.out.println("Changing to LowerCase: " + brandName.toLowerCase());
        System.out.println("Changing to UpperCase: " + brandName.toUpperCase());

        String phraseToTrim = "JAV ALL DAY EVERYDAY ";
        System.out.println("Trim the word: " + phraseToTrim.trim());

        String misspelledRiver = "Mittittipi";
        System.out.println("Original String: " + misspelledRiver);
        System.out.println("Replaced 't' with 's': " + misspelledRiver.replace('t', 's'));
    }
}
