/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class PaymentCalculator {
    //prompt user for balance
    //prompt user for APR
    //prompt user for monthly payment
    //calculate months until paid off
    float balance=getBalance();
    float APR=getAPR();
    float monthlyPayment=getMonthlyPayment();

    private float getBalance(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your balance? ");
        balance = sc.nextFloat();
        return balance;
    }
    private float getAPR(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the APR on the card (as a percent)? ");
        APR = sc.nextFloat()/100;
        return APR;
    }
    private float getMonthlyPayment(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the monthly payment you can make? ");
        monthlyPayment = sc.nextFloat();
        return monthlyPayment;
    }
    public int calculateMonthsUntilPaidOff(){
        //use formula n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        //return the number of months
        float a = APR / 365;
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + balance / monthlyPayment * (1 - Math.pow(1 + a, 30))) / Math.log(1 + a));
    }
}