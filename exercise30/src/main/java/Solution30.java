/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
public class Solution30 {
    /*I made this more complicated than it needed
    to be just cuz I wanted to mess around a bit*/
    public static void main(String[] args) {
        Solution30 sol = new Solution30();
        int[][] tableArray = sol.table();
        sol.print(tableArray);
    }
    public int[][] table(){
        //create nested loop to multiply 1st number by 2nd number
        //1*1, 1*2, 1*3, ... , 1*12, 2*1, 2*2, 2*3, ... , 2*12, ...
        int[][] tableArray = new int[13][13];
        for(int i=1;i<=12;i++) {
            for(int j=1;j<=12;j++) {
                tableArray[i][j]=(i*j);
            }
        }
        return tableArray;
    }
    public void print(int[][] tableArray){
        //print each value and separate with
        for(int i=1;i<=12;i++){
            for(int j=1;j<=12;j++){
                System.out.print(tableArray[i][j] +"\t");
            }
            //print \n after each outer loop
            System.out.print("\n");
        }
    }
}
