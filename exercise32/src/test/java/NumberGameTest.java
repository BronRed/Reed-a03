/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import org.junit.jupiter.api.Test;

class NumberGameTest {
    @Test
    void getSecretNumberTest1(){
        NumberGame ng = new NumberGame();
        int secretNumber = ng.getSecretNumber(1);
        if(secretNumber >=0 && secretNumber <=10){
            assert true;
        }
        else
            assert false;
    }
    @Test
    void getSecretNumberTest2(){
        NumberGame ng = new NumberGame();
        int secretNumber = ng.getSecretNumber(2);
        if(secretNumber >=10 && secretNumber <=100){
            assert true;
        }
        else
            assert false;
    }
    @Test
    void getSecretNumberTest3(){
        NumberGame ng = new NumberGame();
        int secretNumber = ng.getSecretNumber(3);
        if(secretNumber >=100 && secretNumber <=1000){
            assert true;
        }
        else
            assert false;
    }
}

