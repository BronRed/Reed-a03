/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void printTest(){
        Calculator calc = new Calculator();
        calc.print(22, 65);
    }
}