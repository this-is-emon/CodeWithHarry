package org.example;
import java.util.Scanner;

public class cwh_09_chapter03_strings {
    public static void main(String[] args) {
        //'String' is a class but can be used like a 'Data type'
        String name; // Here 'name' is a 'Reference type variable'
        // A 'Object' of 'String class' with value "Emon" is referred to the variable 'name'
        name = new String("Emon");
        System.out.println(name);

        //Alternate way to declare an String type variable:
        String name2 = "Emon2";
        System.out.println(name2);

        System.out.println("------------------");
        System.out.println();

        int a = 6;
        float b = 5.685f;
        System.out.printf("a = %d, b = %.2f",a,b);
        System.out.println();
        System.out.format("a : %d, b : %f",a,b);

        System.out.println("------------------");
        System.out.println();

        Scanner input = new Scanner(System.in);
//        String st = input.next();
//        System.out.println(st);
        String st2 = input.nextLine();
        System.out.println(st2);
    }
}
