/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
public class Solution26 {
    public static void main(String[] args){
        //make class PaymentCalculator
        PaymentCalculator calculator = new PaymentCalculator();
        //print number of months until paid off
        int monthsUntilPaid = calculator.calculateMonthsUntilPaidOff();
        System.out.println("It will take you " + monthsUntilPaid + " months to pay off this card.");
    }
}
