/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
public class Solution29 {
    public static void main(String[] args){
        //build object calculator to hold all important data
        //use methods in calculator class to get important data
        //use try catch to handle an illegal input EG: denominator 0
        //pass calculated value to main and print result
        Calculator calc = new Calculator();
        int rate = calc.getReturnRate();
        int years = calc.calculateYears(rate);
        System.out.println("It will take "+ years +" years to double your initial investment.");
    }
}
