package org.example;

public class cwh_11_chapter03_practiceSet {
    public static void main(String[] args) {
        /*-- 01.Write a Java program to convert a string to lowercase  --*/
            String nonConvertedString = "HELLO, THIS IS FANTASTIC!";
            System.out.println(nonConvertedString.toLowerCase());
            System.out.println("------------------------------------");

        /*-- 02.Write a Java program to replace spaces with underscores--*/
            String spacedWords = "Hi! How are you";
            String underScoredWords = spacedWords.replace(" ","_");
            System.out.println(underScoredWords);
            System.out.println("------------------------------------");

        /*--
        03.Write a Java program to fill in a letter template which looks like below :
        letter = "Dear, <|name|>, Thanks a lot"
        Replace <|name|> with a String(some name)
        --*/
            String letter = "Dear, <|name|>, Thanks a lot";
            String replacedLetter = letter.replace("<|name|>","Emon");
            System.out.println(replacedLetter);
            System.out.println("------------------------------------");

        /*-- 04.Write a Java program to detect double and triple spaces in a String--*/
            String str = "This is a  test string with   double  and triple   spaces.";
            // Check for double spaces
            if (str.contains("  ")) {
                System.out.println("Double spaces detected. Index of double space : "+ str.indexOf("  "));
            } else {
                System.out.println("No double spaces detected.");
            }

            // Check for triple spaces
            if (str.contains("   ")) {
                System.out.println("Triple spaces detected. Index of triple space : " + str.indexOf("   "));
            } else {
                System.out.println("No triple spaces detected.");
            }

            System.out.println("------------------------------------");

        /*--
        05.Write a Java program to format the following letter using escape sequence characters
        letter = "Dear Harry, This Java course is nice Thanks."
        --*/
            // Original letter
            String originalLetter = "Dear Harry, This Java course is nice Thanks.";

            // Formatting the letter using escape sequences
            String formattedLetter = "Dear Harry,\n\tThis Java course is nice.\nThanks.";

            // Output the formatted letter
            System.out.println("Original Letter: ");
            System.out.println(originalLetter);
            System.out.println("\nFormatted Letter: ");
            System.out.println(formattedLetter);
            System.out.println("------------------------------------");

    }
}
