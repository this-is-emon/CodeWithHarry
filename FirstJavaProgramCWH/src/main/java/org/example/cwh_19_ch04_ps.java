package org.example;

import java.util.Scanner;

public class cwh_19_ch04_ps {
    public static void main(String[] args) {
        /**-- o1.What will be the output fo the program below? --**/
//            int a = 10;
//            if (a == 11) {
//                System.out.println("I am 11");
//            }else {
//                System.out.println("I am not 11");
//            }

        System.out.println("-----------------------------------");

        /**--
         o2.Write a program to find out weather a student is pass or fail;
         * if it requires total 40% and at least 33% in each subject to pass.
         * Assume 3 subjects and take marks as input for the user.
         --**/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the Math marks: ");
//        int mathMarks = scanner.nextInt();
//        System.out.println("Enter the Language marks: ");
//        int languageMarks = scanner.nextInt();
//        System.out.println("Enter the Science marks: ");
//        int scienceMarks = scanner.nextInt();
//
//        if (scienceMarks <= 33 || mathMarks <=33 || languageMarks <= 33) {
//            System.out.println("Fail");
//        } else if (((mathMarks + scienceMarks + languageMarks)/3) < 40) {
//            System.out.println("Fail");
//        }else {
//            System.out.println("Pass");
//        }
//          scanner.close();

        System.out.println("-----------------------------------");

        /**--
         o3.Calculate income-tax paid by an employee to the government as per the slots mentioned below :
         * Income-Scale     Tax
         * 2.5L - 5.0L      5%
         * 5.0L - 10.0L     20%
         * Above  10.0L     30%
         Note : there is no tax below 2.5L. Take input amount as an input from the user.
         --**/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your income in Lacs: ");
//        double grossIncome = scanner.nextDouble();
//        if (grossIncome < 2.5) {
//            System.out.println("No Income tax needed to be paid");
//        } else if (grossIncome > 2.5 && grossIncome < 5.0) {
//            System.out.println("Income tax amount:  " + (grossIncome*(5.0/100.0)));
//        } else if (grossIncome > 5.0 && grossIncome < 10.0) {
//            System.out.println("Income tax amount:  " + (grossIncome*(20.0/100.0)));
//        } else if (grossIncome > 10.0) {
//            System.out.println("Income tax amount:  " + (grossIncome*(30.0/100.0)));
//        }
//        scanner.close();
        System.out.println("-----------------------------------");

        /**-- o4.Write a Java program to find out the day of the week given the number :
         * [1 for Monday 2 for Tuesday... and so on!]
         --**/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the days number between 1 and 7 :");
//        int dayNumber = scanner.nextInt();
//
//        switch (dayNumber){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Make sure you enter number between 1 and 7");
//        }
//        scanner.close();

        System.out.println("-----------------------------------");
        /**-- o5.Write a Java program to find weather a year entered by the user is a 'leap-year' or not? --**/
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a year: ");
//        int year = scanner.nextInt();
//        boolean isLeapYear = false;
//        if (year % 4 == 0) {
//            if (year % 100 != 0 || year % 400 == 0) {
//                isLeapYear = true;
//            }
//        }
//        if (isLeapYear) {
//            System.out.println(year + " is a leap year.");
//        } else {
//            System.out.println(year + " is not a leap year.");
//        }
//
//        scanner.close();
        System.out.println("-----------------------------------");

        /**-- o6.Write a program to find out the type of website from the URL :
         * .com -> Commercial Website
         * .org -> Organization Website
         * .bd -> Bangladeshi Website
         * --**/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the url: ");
        String webUrl = scanner.next();
        if (webUrl.contains(".com")) {
            System.out.println("Commercial Website");
        } else if (webUrl.contains(".org")) {
            System.out.println("Organization Website");
        } else if (webUrl.contains(".bd")) {
            System.out.println("Bangladeshi website");
        }else {
            System.out.println("Unknown website type.");
        }

        //Alternate Solution
//        String url = scanner.nextLine();
//        if (url.endsWith(".com")) {
//            System.out.println("This is a Commercial Website.");
//        } else if (url.endsWith(".org")) {
//            System.out.println("This is an Organization Website.");
//        } else if (url.endsWith(".bd")) {
//            System.out.println("This is a Bangladeshi Website.");
//        } else {
//            System.out.println("Unknown website type.");
//        }

        scanner.close();


    }
}
