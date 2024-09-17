package org.example;

public class cwh_35_method_practiceSet {
    /** Q-01 : Write a Java method to print multiplication tabale of a number 'n'  **/
    static void multiplicationTable(int n){
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
    /** Q-02 : Write a program using functions to print the following pattern
     *
     * *
     * * *
     * * * *
     --**/
    static void triangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /** Q-03 : Write a recursive function to calculate sum of first 'n' natural numbers  **/
    static int sumOfNum(int n){
        if (n==1) {
            return 1;
        }else {
            return n + sumOfNum(n-1);
        }
    }
    /** Q-04 : Write a program using functions to print the following pattern
     * * * *
     * * *
     * *
     *
     --**/
    static  void reverseTriangle(int n){
        for (int i = n; i >= 0 ; i--) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /** Q-05 : Write a function to print the n'th term of fibonacci series using recursion  **/
    static int fibonacci(int n){
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    /** Q-06 : Write a function to find average of a set of numbers passed as arguments  **/
    static double calculateAverage(int... numbers){
        int sum = 0;
        for (int num : numbers){
            sum = sum + num;
        }
        return sum/numbers.length;
    }

    /** Q-07 : Repeat 4 using Recursion  **/
    static int repeatFour(int n){
        if (n <= 0){
            return 0;
        }else {
            System.out.println("4");
            return repeatFour(n-1);
        }
    }
    /** Q-08 : Repeat 2 using Recursion  **/
    static void repeatTwo(int n){
        if (n <= 0){
            return;
        }
        System.out.println("2");
        repeatTwo(n-1);
    }

    public static void main(String[] args) {
        /** Q-01 : Write a Java method to print multiplication tabale of a number 'n'  **/
//        int num = 5;
//        multiplicationTable(5);
        System.out.println("--------------------------------");

        /** Q-02 :   **/
//        int star = 4;
//        triangle(star);
        System.out.println("--------------------------------");

        /** Q-03 : Write a recursive function to calculate sum of first 'n' natural numbers  **/
//        int number = 5;
//        System.out.println(sumOfNum(number));
        System.out.println("--------------------------------");

        /** Q-04 :   **/
//        reverseTriangle(4);
        System.out.println("--------------------------------");

        /** Q-05 : Write a function to print the n'th term of fibonacci series using recursion  **/
//        int nthTerm = 6;
//        System.out.println(fibonacci(nthTerm));
        System.out.println("--------------------------------");

        /** Q-06 : Write a function to find average of a set of numbers passed as arguments  **/
//        double average = calculateAverage(10,20,30,40,50);
//        System.out.println("The average is : " + average);
        System.out.println("--------------------------------");

        /** Q-07 : Repeat 4 using Recursion  **/
//        int times = 4;
//        repeatFour(times);
        System.out.println("--------------------------------");

        /** Q-08 : Repeat 2 using Recursion  **/
//        int times = 2;
//        repeatTwo(times);
        System.out.println("--------------------------------");
    }
}
