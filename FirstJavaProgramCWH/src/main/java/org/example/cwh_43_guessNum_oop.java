package org.example;

import java.util.Random;
import java.util.Scanner;

//1. Constructor to generate the random number
class Game{
    private int number;
    private int noOfGuesses;

    // 1. Constructor to generate the random number
    public Game(){
        Random random = new Random();
        this.number = random.nextInt(1, 11);
        this.noOfGuesses = 0;
    }

    //2. takeUserInput() to take a user input of number
    public int takeUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 to 10");
        int userInput = scanner.nextInt();
        noOfGuesses++;
        return userInput;
    }

    //3. isCorrectNumber() to detect whether the number entered by the user is true
    public boolean isCorrectNumber(int userInput){
        if (userInput == number) {
            System.out.println("You WIN! and you guessed " + this.noOfGuesses + " times.");
            return true;
        } else if (userInput > number) {
            System.out.print("Too high! Try again...");
        } else  {
            System.out.print("Too low! Try again....");
        }
        return false;
    }

}

public class cwh_43_guessNum_oop {
    public static void main(String[] args) {
         /**
         Create a class Game, which allows a user to play "Guess the Number" game once.
          Game should have the following methods :
          1. Constructor to generate the random number
          2. takeUserInput() to take a user input of number
          3. isCorrectNumber() to detect whether the number entered by the user is true
          Use properties such as noOfGuesses(int), etc to get this task done!
         **/
         Game game = new Game();

         boolean win = false;

         while (!win){
             boolean winIt = game.isCorrectNumber(game.takeUserInput());
             if (winIt) {
                 win = true;
             }else {

             }
         };



    }
}
