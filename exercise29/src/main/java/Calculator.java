/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class Calculator {
    //getRate
    //calculateYears
    //try catch for illegal input EG: denominator 0, alphabetical input
    int returnRate;
    public int getReturnRate(){
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        System.out.print("What is the rate of return? ");
        String tempStr = sc.next();
        while(repeat){
            try{
                returnRate = Integer.parseInt(tempStr);
                repeat = false;
            } catch (Exception a) {
                System.out.println("Sorry. That's not a valid input.");
                System.out.print("What is the rate of return? ");
                tempStr = sc.next();
            }
        }
        return returnRate;
    }
    public int calculateYears(int returnRate){
        int calcYears=0;
        boolean repeat = true;
        while(repeat){
            try{
                calcYears = 72 / returnRate;
                repeat = false;
            } catch (Exception e) {
                System.out.println("Sorry. That's not a valid input.");
                returnRate=getReturnRate();
            }
        }
        return calcYears;
    }

}
