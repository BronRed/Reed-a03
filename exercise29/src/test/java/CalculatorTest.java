/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void calculateYearsTest4(){
        Calculator calc = new Calculator();
        int result = calc.calculateYears(4);
        assertEquals(18, result);
    }
}