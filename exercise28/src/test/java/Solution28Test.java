/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {
    @Test
    void getTotalTest(){
        Solution28 sol = new Solution28();
        sol.getTotal();
        assertEquals(15, sol.getTotal());
    }
}