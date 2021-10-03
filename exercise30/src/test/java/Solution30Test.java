/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {
    @Test
    void tableTest2times2(){
        Solution30 sol = new Solution30();
        int[][] array = sol.table();
        assertEquals(9, array[3][3]);
    }

}