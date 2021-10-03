/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class PasswordGenerator {
    public void run(){
        ArrayList<Character> letters = getLetters();
        ArrayList<Character> specials = getSpecials();
        ArrayList<Character> numbers = getNumbers();
        int passLength = getLength();
        int numSpecials = getNumSpecials();
        int numNumbers = getNumNumbers();
        char[] password = generatePassword(passLength, numSpecials, numNumbers, letters, numbers, specials);
        //print randomly generated password
        System.out.print("Your password is ");
        for (char c : password) {
            System.out.print(c);
        }
    }
    private int getLength() {
        //prompt user for length of password
        Scanner sc = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        return sc.nextInt();
    }
    private int getNumNumbers() {
        //prompt user for number of numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers?  ");
        return sc.nextInt();
    }
    private int getNumSpecials() {
        //prompt user for number of special characters
        Scanner sc = new Scanner(System.in);
        System.out.print("How many special characters? ");
        return sc.nextInt();
    }
    public ArrayList getLetters(){
        //pre-generated arraylist for letters, numbers, special characters
        String alphabetAaBb = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        ArrayList<Character> letters = new ArrayList<>();
        for(char ch: alphabetAaBb.toCharArray()){
            letters.add(ch);
        }
        return letters;
    }
    public ArrayList getSpecials(){
        //pre-generated arraylist for letters, numbers, special characters
        String specialChars = "!@#&()–[{}]:;'?/*$^+=<>";
        ArrayList<Character> specials = new ArrayList<>();
        for(char ch: specialChars.toCharArray()){
            specials.add(ch);
        }
        return specials;
    }
    public ArrayList getNumbers(){
        //pre-generated arraylist for letters, numbers, special characters
        String numberChars = "0123456789";
        ArrayList<Character> numbers = new ArrayList<>();
        for(char ch: numberChars.toCharArray()){
            numbers.add(ch);
        }
        return numbers;
    }
    public char[] generatePassword(int numPassword, int numSpecials, int numNumbers, ArrayList letters, ArrayList numbers, ArrayList special){
        Random rand = new Random();
        StringBuilder password = new StringBuilder();
        for(int i=0;i<numPassword-numSpecials-numNumbers;i++){
            //get random letters
            password.append(letters.get(rand.nextInt(letters.size())));
        }
        for(int i=0;i<numSpecials;i++){
            //get random special characters equal to chosen number
            password.append(special.get(rand.nextInt(special.size())));
        }
        for(int i=0;i<numNumbers;i++){
            //get random numbers equal to chosen number
            password.append(numbers.get(rand.nextInt(numbers.size())));
        }
        char[] arr = password.toString().toCharArray();
        for(int i=arr.length-1;i>0;i--){
            //mix characters together in random order
            int j = rand.nextInt(i+1);
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}