/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {
    @Test
    void calculateAverageTest(){
        Statistics stats = new Statistics();
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);
        assertEquals(400.0, stats.calculateAverage(numbers));
    }
    @Test
    void findMinimumTest(){
        Statistics stats = new Statistics();
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);
        assertEquals(100.0, stats.findMin(numbers));
    }
    @Test
    void findMaximumTest(){
        Statistics stats = new Statistics();
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);
        assertEquals(1000.0, stats.findMax(numbers));
    }
    @Test
    void calculateStdTest(){
        Statistics stats = new Statistics();
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);
        assertEquals(353.5533905932738, stats.calculateStd(numbers));
    }
}