package org.example;

import java.util.Random;
import java.util.Scanner;

public class cwh_20_rockPaperScissor_game {
    public static void main(String[] args) {
        /**-- Write a Rock, paper, scissors game program in Java --**/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write \'1 for Rock\', \'2 for Paper\',\'3 for Scissor\'");
//        int userInput = scanner.nextInt();
//        System.out.println(userInput);

//        Random rand = new Random();
//        int randomNum = rand.nextInt(3) + 1;
//        System.out.println(randomNum);

//        if (userInput == randomNum) {
//            System.out.println("Draw!");
//        } else if (userInput == 1 && randomNum == 2) {
//            System.out.println("You Loose..");
//
//        } else if (userInput == 1 && randomNum == 3) {
//            System.out.println("You win!");
//
//        } else if (userInput == 2 && randomNum == 1) {
//            System.out.println("You Win!");
//
//        } else if (userInput == 2 && randomNum == 3) {
//            System.out.println("Yor Loose..");
//
//        } else if (userInput == 3 && randomNum == 1) {
//            System.out.println("You Loose..");
//
//        } else if (userInput == 3 && randomNum == 2) {
//            System.out.println("You Win!!");
//        }

        System.out.println("-----------------------------------");


    /**-- Write a Rock, paper, scissors game program in Java (Alternate Solution) --**/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write Rock,Paper,Scissor");
        String userInput = scanner.next();
//        System.out.println(userInput);

        System.out.println("-----------------------------------");

        String words[] = {"Rock","Paper","Scissor"};
        Random rand = new Random();
        int randomNum = rand.nextInt(words.length);
        String computerGuess = words[randomNum];
//        System.out.println(computerGuess);

        if (computerGuess.equals(userInput)) {
            System.out.println("Draw");
        } else if (computerGuess.equals("Rock")  && userInput.equals("Paper") ) {
            System.out.println("You Win!");
        } else if (computerGuess.equals("Rock") && userInput.equals("Scissor") ) {
            System.out.println("You Loose");
        } else if (computerGuess.equals("Paper")  && userInput.equals("Rock")) {
            System.out.println("You Loose..");
        } else if (computerGuess.equals("Paper")  && userInput.equals("Scissor") ) {
            System.out.println("You win!");
        } else if (computerGuess.equals("Scissor")  && userInput.equals("Rock") ) {
            System.out.println("You Win!");
        } else if (computerGuess.equals("Scissor")  && userInput.equals("Paper") ) {
            System.out.println("Yor Loose..");
        } else {
            System.out.println("Check your input carefully!");
        }


        System.out.println("-----------------------------------");

    }
}
