/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class Calculator {
    float restingPulse;
    float age;
    public float getRate(){
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        String tempStr;
        //prompt user for age and heart rate
        while(status){
            try{
                System.out.print("Enter your resting heart rate: ");
                tempStr = sc.next();
                restingPulse = Integer.parseInt(tempStr);
                status = false;
            } catch(Exception a){
                System.out.println("Enter only numbers...");
                tempStr = sc.next();
            }
        }
        return restingPulse;
    }
    public float getAge(){
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        String tempStr;
        //prompt user for age and heart rate
        while(status){
            try{
                System.out.print("Enter your age: ");
                tempStr = sc.next();
                age = Integer.parseInt(tempStr);
                status = false;
            } catch(Exception b){
                System.out.println("Enter only numbers...");
                tempStr = sc.next();
            }
        }
        return age;
    }
    public void print(float passedAge, float restingRate){
        System.out.println(passedAge);
        System.out.println(restingRate);
        System.out.println("Intensity   | Rate");
        System.out.println("------------|----------");
        for (int i = 55; i <= 95; i += 5) {
            //use TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
            float rate = (((220 - passedAge) - restingRate) * i/100) + restingRate;
            //return result and put into table
            System.out.println(i + "%" + "         | " + Math.round(rate) + " bpm");
        }
    }
}
