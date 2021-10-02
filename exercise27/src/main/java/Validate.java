/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
public class Validate {
    public Validate(String firstName, String lastName, String zip, String id) {
        int flag = validateFirstName(firstName);
        int flag2 = validateLastName(lastName);
        int flag3 = validateZIP(zip);
        int flag4 = validateID(id);
        if(flag==1||flag2==1||flag3==1||flag4==1){
            System.out.println("There were no errors found.");
        }
    }
    private int validateFirstName(String firstName){
        if(firstName.length()<2){
            System.out.println("The first name must be at least 2 characters long.");
            return 1;
        }
        return 0;
    }
    private int validateLastName(String lastName){
        if(lastName.length()<2){
            System.out.println("The last name must be at least 2 characters long.");
            return 1;
        }
        return 0;
    }
    private int validateZIP(String zip){
        if(zip.length()<5){
            System.out.println("The zipcode must be a 5 digit number");
            return 1;
        }
        return 0;
    }
    private int validateID(String id){
        if(id.matches("[a-zA-Z]{2}[-][0-9]{4}")){
            return 0;
        }
        else{
            System.out.println("The employee ID must be in the format of AA-1234.");
            return 1;
        }
    }
}
