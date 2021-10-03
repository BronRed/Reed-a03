/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Solution35 {
    public static void main(String[] args){
        Solution35 sol = new Solution35();
        //make arraylist
        ArrayList names = sol.getNames();
        //make random variable
        Random rand = new Random();
        sol.chooseWinner(names, rand);
        System.out.println("The winner is... "+sol.chooseWinner(names, rand)+"!");
    }
    public ArrayList getNames(){
        Scanner sc = new Scanner(System.in);
        String name;
        ArrayList<String>names=new ArrayList<>();
        //do{add name}
        do{
            System.out.print("Enter a name: ");
            name = sc.nextLine();
            names.add(name);
        }while(!name.isEmpty());    //while(string added is not empty)
        //remove empty name from list
        names.remove(names.size()-1);
        return names;
    }
    public String chooseWinner(ArrayList names, Random rand){
        //select name from list via variable
        return (String) names.get(rand.nextInt(names.size()));
    }
}
