/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import java.util.Random;
import java.util.Scanner;
public class Solution33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution33 sol = new Solution33();
    //prompt user for a question
        System.out.print("What's your question?\n> ");
        String question = sc.nextLine();
        String response = sol.getString();
    //output random solution
        System.out.println(response);
    }
    public String getString(){
        Random random = new Random();
    //pre generated solutions to answer associated with number
        String[] responses = {"Yes","No","Maybe","Ask again later"};
        int randomResponseIndex = random.nextInt(responses.length);
    //choose solution based on random number generation.
        return responses[randomResponseIndex];
    }
}
