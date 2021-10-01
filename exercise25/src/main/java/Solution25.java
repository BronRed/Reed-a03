/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class Solution25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution25 sol = new Solution25();
        //prompt user for password
        System.out.print("PLease enter a password: ");
        String password = sc.next();
        //pass password to passwordValidator
        String validatorString = sol.passwordValidator(password);
        //have some other function validate weak, strong, very strong password
        //print weak, strong, very strong
        System.out.println("The password "+password+" is "+validatorString);
    }
    public String passwordValidator(String password){
        //case1: contains only numbers < 8
        //case2: contains only letters < 8
        //case3: at least 8 characters letters numbers
        //case4: at least 8 characters contains special characters numbers and letters
        int hasDigit=0;
        int hasNumber=0;
        int hasSpecial=0;
        for(int i=0;i<password.length();i++){
            if(Character.isDigit(password.charAt(i))){
                hasDigit++;
            }
            else if(Character.isLetter(password.charAt(i))){
                hasNumber++;
            }
            else{
                hasSpecial++;
            }
        }
        if(hasDigit>0 && hasNumber==0 && hasSpecial==0 && password.length()<8)
            return "a very weak password.";
        else if(hasDigit==0 && hasNumber>0 && hasSpecial==0 && password.length()<8)
            return "a weak password.";
        else if(hasDigit>0 && hasNumber>0 && hasSpecial==0 && password.length()>=8)
            return "a strong password.";
        else if(hasDigit>0 && hasNumber>0 && hasSpecial>0 && password.length()>=8)
            return "a very strong password.";
        else
            return "a password of unknown strength.";
    }
}
