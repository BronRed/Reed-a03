/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {
    @Test
    void removeNameTest(){
        Solution34 sol = new Solution34();
        ArrayList<String>names = new ArrayList<>();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        ArrayList<String>newNames = names;
        sol.removeName(newNames, "Amanda Cullen");
        assertEquals(names, newNames);
    }
}