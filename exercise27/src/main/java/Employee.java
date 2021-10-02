/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class Employee {
    //first name
    //last name
    //ZIP code
    //employee ID
    String firstName=getFirstName();
    String lastName=getLastName();
    String ZIP=getZIP();
    String ID=getID();
    Validate validate = new Validate(firstName, lastName, ZIP, ID);
    private String getFirstName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        return sc.next();
    }
    private String getLastName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last name: ");
        return sc.next();
    }
    private String getZIP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ZIP code: ");
        return sc.next();
    }
    private String getID(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee ID: ");
        return sc.next();
    }
}
