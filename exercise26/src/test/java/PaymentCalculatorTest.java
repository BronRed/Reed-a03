/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    @Test
    void calculateMonthsUntilPaidOff(){
        PaymentCalculator calculator = new PaymentCalculator();
        calculator.balance = 5000;
        calculator.APR = 12;
        calculator.monthlyPayment = 100;
        calculator.calculateMonthsUntilPaidOff();
        assertEquals(70, 70);
    }

}