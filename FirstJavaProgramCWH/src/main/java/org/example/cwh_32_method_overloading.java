package org.example;

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

    public static void main(String[] args) {
        /** Use of 'void' and 'static' keyword **/
//        tellJoke();

        /** Premitive vs Reference variable in a Java method **/
        // Case 1 : Passing a premitive variable inside a pre-defined Java method
        int x = 45;
        changeInPrimitive(x);
//        System.out.println(x); //45

        // Case 2 : Passing a reference variable inside a pre-defined Java method
        int[] marks = {52,73,89,98,94};
        changeInReference(marks);
//        System.out.println(marks[0]); //98
        /*-- In case of Arrays, the reference is passed, same is the case for Object passing in methods --*/

        /** Method Overloading**/
        foo();
        foo(100);
        foo(200,300);
    }
}
