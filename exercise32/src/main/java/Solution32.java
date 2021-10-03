/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
public class Solution32 {
    //if secret number is less than number "you guessed too high"
    //if secret number is higher than number "you guessed too low"
    //if secret number = number "you guessed the number in X turns!""do you want to play again?"
    public static void main(String[] args){
        NumberGame ng = new NumberGame();
        ng.playGame();
    }
}
