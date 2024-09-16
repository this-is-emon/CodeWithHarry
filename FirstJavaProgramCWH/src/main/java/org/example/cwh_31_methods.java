package org.example;

public class cwh_31_methods {
    static int logic(int x, int y){
        int z;
        if (x > y) {
            z = x + y;
        }else {
            z = (x + y) * 5;
        }
        return z; // returns integer type inside 'z'
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        int c;
        // As the 'logic' method and 'main' method are in the sam class, and 'logic' method has the keyword 'static' :
        // we do not need to create a new object while invoking the 'logic' method
        c = logic(a,b);

        int a1 = 2;
        int b1 = 1;
        int c1;
        // As the 'logic' method and 'main' method are in the sam class, and 'logic' method has the keyword 'static' :
        // we do not need to create a new object while invoking the 'logic' method
        c1 = logic(a1,b1);

        System.out.println(c);
        System.out.println(c1);

        /** Method invocation using Object creation, Remember :
         * While we invoke a method from another class
         * Or we invoke a method from same class, but the method doesn't have "Static" keyword while declaring
         **/
//        cwh_31_methods obj = new cwh_31_methods(); //Object creation
//        c = obj.logic(a,b);   // Method call upon object
//        System.out.println(c);
//
//        c1 = obj.logic(a1,b1);    // Object creation
//        System.out.println(c1);   // Method call upon object



    }
}
