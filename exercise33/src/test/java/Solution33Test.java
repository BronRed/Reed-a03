/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import org.junit.jupiter.api.Test;

class Solution33Test {
    @Test
    void getStringTest(){
        Solution33 sol = new Solution33();
        String response = sol.getString();
        if(response.equals("Yes")||response.equals("No")||response.equals("Maybe")||response.equals("Ask again later")){
            assert true;
        }
        else
            assert false;
    }

}