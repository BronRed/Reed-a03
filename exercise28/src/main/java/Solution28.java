/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class Solution28 {
    //pass to function to handle loop inputs
    //pass values to calculation
    //add all numbers
    public static void main(String[] args) {
        Solution28 sol = new Solution28();
        int total = sol.getTotal();
        //print out total returned from getTotal
        System.out.println("The total is "+total+".");
    }
    public int getTotal(){
        //gets each inputs from loop
        //adds each input to last sum
        //returns total to main
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i=0;i<5;i++) {
            System.out.print("Enter a number: ");
            total+=sc.nextInt();
        }
        return total;
    }
}
