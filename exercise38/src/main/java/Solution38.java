/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Solution38 {
    public static void main(String[] args) {
        Solution38 sol = new Solution38();
        int[] numArray = sol.getNums();
        ArrayList numEvens = sol.filterEvenNumbers(numArray);
        System.out.print("The even numbers are: ");
        //print even numbers
        for (Object numEven : numEvens) {
            System.out.print(numEven+" ");
        }
    }
    public int[] getNums() {
        Scanner sc = new Scanner(System.in);
        //prompt user for list of numbers
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String line = sc.nextLine();
        int[] nums = new int[line.length() / 2 + 1];
        String[] str = line.trim().split("\\s+");
        //input numbers in an array
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }
        return nums;
    }
    public ArrayList<Integer> filterEvenNumbers(int[] numArray) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int j : numArray) {
        //use n%2=0 to determine even numbers
            if (j % 2 == 0) {
                newList.add(j);
            }
        }
        return newList;
    }
}