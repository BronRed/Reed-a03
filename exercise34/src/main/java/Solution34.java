/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Solution34 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Solution34 sol = new Solution34();
        //create arraylist of employees{John Smith, Jackie Jackson, Chris Jones, Amanda Cullen, Jeremy Goodwin}
        ArrayList<String>names=new ArrayList<>();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        System.out.println("There are "+names.size()+" employees:");
        for (String name : names) {
            System.out.println(name);
        }
        //take input of name to delete
        System.out.print("\nEnter the name to delete: ");
        String remove = sc.nextLine();
        //remove name from arraylist
        sol.removeName(names, remove);
        System.out.println("\nThere are "+names.size()+" employees:");
        for (String name : names) {
            System.out.println(name);
        }
    }
    public boolean removeName(ArrayList names, String remove){
        //remove name from arraylist
        return names.remove(remove);
    }
}
