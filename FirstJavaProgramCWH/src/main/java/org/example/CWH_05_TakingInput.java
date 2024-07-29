package org.example;
import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From User");

        /* *--Taking "int" input from the user--* */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int a = sc.nextInt();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        int sum = a + b;
//        System.out.print("The addition of 2 numbers: ");
//        System.out.print(sum);

        /* *--Taking "float" input from the user--* */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        float a = sc.nextFloat();
//        System.out.println("Enter number 2");
//        float b = sc.nextFloat();
//        float sum = a + b;
//        System.out.print("The addition of 2 numbers: ");
//        System.out.print(sum);

        /* *--Taking "boolean" input from the user--* */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer number");
//
//        boolean b1 = sc.hasNextInt();
//
//        if (b1 == true){
//            System.out.println("Thank you for giving us an integer number");
//        }else {
//            System.out.println("Enter an integer number please");
//        }

        /* *--Difference between "next()" and "nextLine()" method of "String"--* */
        Scanner sc = new Scanner(System.in);
        System.out.println("Give us the String input: ");

//        String str1 = sc.next();
//        System.out.println(str1);

        String str2 = sc.nextLine();
        System.out.println(str2);




    }
}
