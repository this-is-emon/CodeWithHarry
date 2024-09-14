package org.example;

public class cwh_26_array_theory {
    public static void main(String[] args) {
        /**-- 01 : How Array works in a Nut-Shell --**/

        System.out.println("-------------------------------------");

        /**-- 02 : Declaration --**/
        int[] marks; // "marks" is a 'reference variable'
        System.out.println("-------------------------------------");

        /**-- 03 : Memory Allocation --**/
        marks = new int[5]; // An integer Object is 'referred' to marks variable.
        /**
         * This Object(referred to variable marks) has the memory allocation of 5 integers
         * Each Integer is equals to 4 bytes
         * So the Total memory allocation of the Object is 5*4 = 20 bytes = 20*8 = 120 bits
         * **/
        System.out.println("-------------------------------------");

        /**-- 04 : Declaration + Memory Allocation --**/
        int[] marks2 = new int[5];
        System.out.println("-------------------------------------");

        /**-- 05 : Declaration + Initialize --**/
        int[] marks3 = {100, 70, 80, 71,98};

        System.out.println("-------------------------------------");

        /**-- 06 : Displaying an Array --**/
//        for (int i = 0; i <marks3.length ; i++) {
//            System.out.println(marks3[i]); // Array Traversal
//            /**-- Array Traversal : In Java, array traversal refers to the process of accessing or visiting each element in an array --**/
//        }

        System.out.println("-------------------------------------");

        /**--07. Write a Java program to print the elements of an array in reverse order.--**/
//        for (int i = (marks3.length - 1); i >= 0 ; i--) {
//            System.out.println(marks3[i]);
//        }
        System.out.println("-------------------------------------");

        /**--08. For-each loop in Java--**/
//        for (int element : marks3){
//            System.out.println(element); // Prints all the elements of marks3[]
//        }
        System.out.println("-------------------------------------");

        /**--09. Declaration of a 2-D Array --**/
        int[][] flats = new int[2][3]; //Declaring
        flats = new int[][]{{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}; //Assigning
        System.out.println(flats[1][1]); //50

        System.out.println("-------------------------------------");

        /**--10. Declaring, assigning and printing a 3-D array--**/
        int[][][] array = {
                {
                        {1, 2, 3},   // First 2D array, first row
                        {4, 5, 6}    // First 2D array, second row
                },
                {
                        {7, 8, 9},   // Second 2D array, first row
                        {10, 11, 12} // Second 2D array, second row
                }
        };

        System.out.println(array[1][1][1]); // 11

        System.out.println("-------------------------------------");

    }
}
