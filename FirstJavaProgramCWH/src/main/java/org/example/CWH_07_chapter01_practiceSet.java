package org.example;
import java.util.Scanner;

public class CWH_07_chapter01_practiceSet {
    public static void main(String[] args) {
        /* ----- Q-01 : Write a program to sum three numbers in Java ----- */
//        Scanner numberInput = new Scanner(System.in);
//        float sumOfFloat = 0;
//
//        for (int i = 0; i < 3; i++) {
//            System.out.print("Enter number " + (i+1) + " : " );
//            if (numberInput.hasNextInt()) {
//                int intValue = numberInput.nextInt();
//                sumOfFloat = sumOfFloat + intValue;
//            }else {
//                float floatValue = numberInput.nextFloat();
//                sumOfFloat = sumOfFloat + floatValue;
//            }
//        }
//
//        System.out.println("Addition of the 3 numbers : " + sumOfFloat);


        /* ----- Q-02 : Write a program to calculate CGPA using marks of three subjects(out of 100) ----- */
//        Scanner marksInput = new Scanner(System.in);
//        float sumOfCgpa = 0.0f;
//
//        for (int i = 0; i < 3; i++) {
//            System.out.print("Enter marks of subject " + (i+1) + " : " );
//            float obtainedMarks = marksInput.nextFloat();
//           if (obtainedMarks >= 80 && obtainedMarks <= 100){
//               float cgpa = 5.0f;
//               sumOfCgpa = sumOfCgpa + cgpa;
//           }else if (obtainedMarks >= 60 && obtainedMarks <= 79) {
//               float cgpa = 4.5f;
//               sumOfCgpa = sumOfCgpa + cgpa;
//           }else if (obtainedMarks >= 40 && obtainedMarks <= 59) {
//               float cgpa = 4.0f;
//               sumOfCgpa = sumOfCgpa + cgpa;
//           }else if (obtainedMarks >= 30 && obtainedMarks <= 39) {
//               float cgpa = 3.0f;
//               sumOfCgpa = sumOfCgpa + cgpa;
//           }else if (obtainedMarks >= 0 && obtainedMarks <= 29) {
//               float cgpa = 2.0f;
//               sumOfCgpa = sumOfCgpa + cgpa;
//           }
//        }
//        System.out.println("Students CGPA according to obtained marks :" + sumOfCgpa/3);
//

        /* Q-03 : Write a Java program which asks the user his/her name and greet them with "Hello <name>, have a good day" text */
//        Scanner stringInput = new Scanner(System.in);
//        System.out.println("What is your name ?");
//        String yourName = stringInput.nextLine();
//        System.out.println("Hello " + yourName + ", have a good day!");


        /* Q-04 : Write a Java program to convert Kilometers to miles */
//        Scanner doubleInput = new Scanner(System.in);
//        System.out.println("Give me the distance in Kilometer : ");
//        double distanceInKilo = doubleInput.nextDouble();
//        System.out.println(distanceInKilo + " Kilometers is equal to : " + distanceInKilo * 0.621371);


        /* Q-05 : Write a Java program to detect weather a number entered by the user is integer or not. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Integer or not : ");
        String input = scanner.nextLine();
        // The `try` block contains the code that might throw an exception
        try {
            Integer.parseInt(input);
            System.out.println("INTEGER");
        } catch (NumberFormatException e) { //The `catch` block contains the code that runs if an exception of the specified type occurs.
            System.out.println("NOT INTEGER ");
        }
        /* NOTE : `NumberFormatException` is a subclass of `IllegalArgumentException`, which is thrown by methods
                   like Integer.parseInt(String s) when the input string cannot be parsed as an integer.*/
        /* So, `NumberFormatException e` is there to catch any exceptions that occur when the input string cannot
                be parsed into an integer, allowing the program to handle this situation gracefully by printing
                "NOT INTEGER" instead of crashing.*/
        }

    }

