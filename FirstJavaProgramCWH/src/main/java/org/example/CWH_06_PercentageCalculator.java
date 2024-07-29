/* Exercise 01: Write a program to calculate percentage of a given
student in CBSE board exam. His marks from 5 subjects must be taken
as input from the keyboard(Marks are out of 100).
* */

package org.example;
import java.util.Scanner;

public class CWH_06_PercentageCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter the marks of the subject as stated");
        Scanner sc = new Scanner(System.in);

        String subjects [] = {"Math","Physics","Chemistry","Biology","Sociology"};
        int markSum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print(subjects[i] + " marks : ");
            if (sc.hasNextInt()) {
                int subjectMarks = sc.nextInt();
                if (subjectMarks < 0 || subjectMarks > 100) {
                    System.out.println("Please enter marks between 0 and 100");
                    subjectMarks = sc.nextInt();
                } else {
                    markSum = markSum + subjectMarks;
                }
            }
        }

        int avg = markSum/5;
        System.out.println("Average marks : " + avg);


//        System.out.print("Math marks : ");
//        int mathMarks = sc.nextInt();
//
//        System.out.print("Physics marks : ");
//        int physicsMarks = sc.nextInt();
//
//        System.out.print("Chemistry marks : ");
//        int chemistryMarks = sc.nextInt();
//
//        System.out.print("Biology marks : ");
//        int biologyMarks = sc.nextInt();
//
//        System.out.print("Sociology marks : ");
//        int sociologyMarks = sc.nextInt();

//        int avg = (mathMarks + physicsMarks + chemistryMarks + biologyMarks + sociologyMarks)/5;

    }
}
