package org.example;

import java.util.Scanner;
import java.util.Arrays;

public class cwh_29_array_practiceSet {
    public static void main(String[] args) {

        /**-- 01 : Create an array fo 5 floats and calculate their sum --**/
    //        float[] num = new float[5];
    //        num = new float[]{2.4f,4.5f,5.6f,6.3f,7.8f};
    //        float sum = 0.0f;
    //        for (int i = 0; i < num.length ; i++) {
    //            sum = sum + num[i];
    //        }
    //        System.out.println(sum);

        System.out.println("-------------------------------------");

        /**-- 02 : Write a program to find out weather a given integer is present in an array or not? --**/
    //        int[] intNum = {1,2,3,4,5};
    //        Scanner scanner = new Scanner(System.in);
    //        System.out.println("Enter an integer number : ");
    //        int num2 = scanner.nextInt();
    //        boolean isPresent = false;
    //        for (int i = 0; i < intNum.length; i++) {
    //            if (intNum[i] == num2){
    //                isPresent = true;
    //                break;
    //            }
    //        }
    //        if (isPresent){
    //            System.out.println("Present");
    //        }else {
    //            System.out.println("Not Present");
    //        }
        System.out.println("-------------------------------------");

        /**-- 03 : Calculate the average marks from an array containing marks of all students in Physics using for-each loop  --**/

    //        int[] physicsMarks = {56,78,38,90,34};
    //        int sum = 0;
    //        for (int element : physicsMarks){
    //            sum = sum + element;
    //        }
    //        int avgPhysicsMarks = sum / physicsMarks.length;
    //        System.out.println("Average : " + avgPhysicsMarks);

        System.out.println("-------------------------------------");

        /**-- 04 : Create a Java program to add two matrix of size 2*3 --**/

    //        int[][] num1 = {{3,4,5},{7,8,9}};
    //        int[][] num2 = {{1,2,3},{4,5,6}};
    //        int[][] sum = new int[2][3];
    //        for (int i = 0; i < 2; i++) {
    //            for (int j = 0; j < 3; j++) {
    //                sum[i][j] = num1[i][j] + num2[i][j];
    //            }
    //
    //        }
    //        for (int i = 0; i < 2; i++) {
    //            for (int j = 0; j < 3; j++) {
    //                System.out.println(sum[i][j] + " ");
    //            }
    //        }

        System.out.println("-------------------------------------");

        /**-- 05 : Write a java program to reverse an array  --**/
        
        int[] array = {1,2,3,4,5};

        /** While Loop **/
//        int i = 0;
//        while (i < (array.length/2)){
//            int temp = array[i];
//            array[i] = array[(array.length-1) - i];
//            array[(array.length-1) -i] = temp;
//            i++;
//        }
//        for (int element: array){
//            System.out.print(element + " ");
//        }

        /** For loop **/
//        for (int i = 0; i < (array.length/2) ; i++) {
//            int temp = array[i];
//            array[i] = array[(array.length-1) - i];
//            array[(array.length-1) -i] = temp;
//        }
//        for (int element: array){
//            System.out.print(element + " ");
//        }

        System.out.println("-------------------------------------");

        /**-- 06 : Write a java program to find the maximum element in an array  --**/

//        int[] array2 = {1,2,3,4,5,6,7,8,9,10};
//        int maxElement = 0;
//        for(int element : array2){
//            if (element > maxElement) {
//             maxElement = element;
//            }
//        }
//        System.out.println("Maximum element in the array : " + maxElement);

        System.out.println("-------------------------------------");

        /**-- 07 : Write a Java program to find the minimum element of an array  --**/
//            int[] array2 = {1,2,3,4,5,6,7,8,9,10};
//            int minElement = 1;
//            for(int element : array2){
//                if (element < minElement) {
//                 minElement = element;
//                }
//            }
//            System.out.println("Minimum element in the array : " + minElement);
        System.out.println("-------------------------------------");

        /**-- 08 : Write a Java program to find weather an array is sorted or not  --**/
//            int[] array3 = {1,2,4,3,5};
//            boolean isSorted = true;
//            for (int i = 0; i < array3.length-1; i++) {
//                if (array3[i] > array3[i+1]) {
//                    isSorted = false;
//                    break;
//                }
//            }
//            if (isSorted) {
//                System.out.println("The array is Sorted");
//            }else {
//                System.out.println("The array is not Sorted");
//            }
        System.out.println("-------------------------------------");

       
    }
}
