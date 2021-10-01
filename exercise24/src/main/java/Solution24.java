/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
import java.util.Arrays;
public class Solution24 {
    public static void main(String[] args){
        Solution24 n = new Solution24();
        //declare 2 strings
        String first;
        String second;
        //output "Enter two strings and I'll tell you if they are anagrams:"
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        //prompt "Enter the first string:"
        System.out.print("Enter the first string: ");
        //get first string
        first = n.getString();
        //prompt "Enter the second string:"
        System.out.print("Enter the second string: ");
        //get second string
        second = n.getString();
        //compare first string and second string and determine if is anagram
        boolean status = n.isAnagram(first, second);
        if (status) {
            System.out.println("\"" + first + "\"" + " and " + "\"" + second + "\"" + " are anagrams.");
        } else {
            System.out.println("\"" + first + "\"" + " and " + "\"" + second + "\"" + " are not anagrams.");
        }
    }
    public String getString(){
        //reads next string and passes back to main
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    public boolean isAnagram(String first, String second) {
        boolean status;
        //remove blank space to read anagram properly
        String s1 = first.replaceAll("\\s", "");
        String s2 = second.replaceAll("\\s", "");
        //check if string sizes are equal
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            //set both strings to lowercase to properly read anagram
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            //sort arrays by value to read anagram properly
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            //strings should now be equal if anagram: true
            //otherwise: false
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        return status;
    }
}