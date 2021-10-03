/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class NumberGame {
    int difficulty;
    int secretNumber;
    public void init(){
        difficulty = getDifficulty();
        secretNumber = getSecretNumber(difficulty);
    }
    public int getDifficulty(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String temp;
        while(flag){
            try{
                //prompt user for difficulty level
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                temp = sc.next();
                secretNumber = Integer.parseInt(temp);
                flag = false;
            } catch (Exception a){
                System.out.println("Please enter a numerical value.");
            }
        }
        return secretNumber;
    }
    public int getSecretNumber(int difficulty){
        //pick random number based on difficulty number
        if(difficulty==1)
            return (int) (Math.random() * 10);
        else if(difficulty==2)
            return (int) (Math.random() * 100);
        else
            return (int) (Math.random() * 1000);
    }
    public void playGame(){
        int counter=0;
        boolean correctGuess=false;
        int intGuess;
        String strGuess;
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play Guess the Number!\n");
        init();
        System.out.print("I have my number. What's your guess? ");
        strGuess = sc.next();
        try{
            intGuess = Integer.parseInt(strGuess);
            //take input from user and compare to secret number
            if(intGuess==secretNumber){
                System.out.println("You’re a mind reader!");
                correctGuess=true;
            }
            else if(intGuess>secretNumber){
                //if secret number is less than number "you guessed too high"
                System.out.print("Too high. ");
                counter++;
            }
            else{
                //if secret number is higher than number "you guessed too low"
                System.out.print("Too low. ");
                counter++;
            }
        }catch(Exception c){
            System.out.print("Enter a number. ");
            counter++;
        }
        //make counting loop
        while(!correctGuess){
            System.out.print("What's your guess? ");
            strGuess = sc.next();
            try{
                intGuess = Integer.parseInt(strGuess);
                //inside loop take input from user and compare to secret number
                if(intGuess==secretNumber){
                    //if secret number = number "you guessed the number in X turns!""do you want to play again?"
                    System.out.println("You got it in "+(counter + 1)+" guesses!");
                    correctGuess=true;
                }
                else if(intGuess>secretNumber){
                    //if secret number is less than number "you guessed too high"
                    System.out.print("Too high. ");
                    counter++;
                }
                else{
                    //if secret number is higher than number "you guessed too low"
                    System.out.print("Too low. ");
                    counter++;
                }
            }catch(Exception b){
                System.out.print("Enter a number. ");
                counter++;
            }
        }
    }
}
