/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {
    @Test
    void chooseWinnerTestBart(){
        Solution35 sol = new Solution35();
        Random rand = new Random();
        ArrayList<String> names = new ArrayList<>();
        names.add("Bart");
        assertEquals("Bart", sol.chooseWinner(names, rand));
    }
}