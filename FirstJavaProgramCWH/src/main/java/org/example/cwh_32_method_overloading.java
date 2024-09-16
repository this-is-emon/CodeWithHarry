package org.example;

import java.util.Scanner;

public class cwh_32_method_overloading {

    /** Use of 'void' and 'static' keyword **/
    static void tellJoke(){
        System.out.println("I invented a new word!\n" + "Plagiarism");
    }

    /** Premitive vs Reference variable in a Java method **/
    static void changeInPrimitive(int a){
        a = 98;
    }
    static void changeInReference(int[] arr){
        arr[0] = 98;
    }

    /** Method Overloading**/
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }
    // Method Overloading can not be performed by changing the return type of methods
    //    static int foo(int a, int b){
    //        System.out.println("Good morning " + a + " bro!");
    //        System.out.println("Good morning " + b + " bro!");
    //    }

    /** Quick Quiz 1 : Recursion Method (Factorial example) **/
    static int factorial(int n){

        if(n == 0 || n == 1){
            return 1;
        }else {
            return (n * factorial(n-1)); // Recursion : Calling a method inside the method itself
            /**
             * Work Through example of 'factorila(4)' :
             * 4 * factorial(3)
             * 4 * 3 * factorial(2)
             * 4 * 3 * 2 * factorial(1)
             * 4 * 3 * 2 * 1
             * factorial(4) = 24
             * **/
        }


    }

    /** Quick Quiz 2 :  print the Fibonacci sequence up to a number 'n' using a recursive function **/
    static int fibonacci(int n){
        if (n == 0) {
            return 0;
        }else if (n == 1) {
            return 1;
        }else {
            return fibonacci(n-1) + fibonacci(n-2);
            /**
             * Work Through example of 'fibonacci(4)' :
             * fibonacchi(4-1) + fibonacci(4-2)
             * fibonacchi(3-1) + fibonacci(2-1)
             * fibonacchi(2-1) + 1
             * 1 + 1
             * fibonacci(4) = 2
             * **/
        }
    }
    //printing the fibonacci series
    static void printFibonacci(int n){
        System.out.println("Fibonacci sequence up to " + n + " : ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        /** Use of 'void' and 'static' keyword **/
            //tellJoke();

        /** Premitive vs Reference variable in a Java method **/
//            Case 1 : Passing a premitive variable inside a pre-defined Java method
//            int x = 45;
//            changeInPrimitive(x);
//            System.out.println(x); //45

//            Case 2 : Passing a reference variable inside a pre-defined Java method
//            int[] marks = {52,73,89,98,94};
//            changeInReference(marks);
//            System.out.println(marks[0]); //98
              /** In case of Arrays, the reference is passed, same is the case for Object passing in methods **/

        /** Method Overloading**/
//            foo();
//            foo(100);
//            foo(200,300);
              /** Arguments ar actual **/


        /** Quick Quiz 1 : Recursion Method (Factorial example) **/
    //        int p = 4;
    //        System.out.println("Factorial of " + p + " is: " + factorial(p));

        /** Quick Quiz 2 :  print the Fibonacci sequence up to a number 'n' using a recursive function **/
            int f = 10;
            printFibonacci(f);

    }
}
