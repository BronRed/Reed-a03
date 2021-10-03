/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
public class Solution31 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        float restingRate = calc.getRate();
        float age = calc.getAge();
        calc.print(age, restingRate);
    }
}
