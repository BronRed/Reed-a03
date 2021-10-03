/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brian Reed
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Statistics {
    void init(){
        ArrayList<Double> numbers = getNumbers();
        print(numbers);
        double average = calculateAverage(numbers);
        double maximum = findMax(numbers);
        double minimum = findMin(numbers);
        double std = calculateStd(numbers);
        System.out.println("The average is "+average);
        System.out.println("The minimum is "+minimum);
        System.out.println("The maximum is "+maximum);
        System.out.printf("The standard deviation is %.2f", std);
    }
    public ArrayList getNumbers(){
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String s;
        int num;
        //create a loop to take inputs until done is entered
        while(true) {
            System.out.print("Enter a number: ");
            s = sc.nextLine();
            if(s.equals("done")) {
                break;
            }
            else{
                num = 1;
                for(int i=0;i<s.length();i++) {
                    if(Character.isDigit(s.charAt(i))) {
                        continue;
                    }
                    else{
                        num = 0;
                    }
                }
                if(num==1) {
                    numbers.add(Double.parseDouble(s));
                }
            }
        }
        return numbers;
    }
    public void print(ArrayList numbers) {
        //output all the entered numbers
        System.out.print("Numbers: ");
        for(int i=0;i<numbers.size();i++)
        {
            if(i!=numbers.size()-1)
            {
                System.out.print(numbers.get(i)+", ");
            }
            else
            {
                System.out.println(numbers.get(i));
            }
        }
    }
    public double calculateAverage(ArrayList numbers){
        //average function uses (num1+num2+.../numNumbers)
        double avg=0;
        for (Object number : numbers) {
            avg = avg + (double)number;
        }
        avg = avg/numbers.size();
        return avg;
    }
    public double findMax(ArrayList numbers){
        //max function looks for largest number
        double max = (double) numbers.get(0);
        for(int i=1;i<numbers.size();i++) {
            if(max<(double)numbers.get(i)) {
                max=(double)numbers.get(i);
            }
        }
        return max;
    }
    public double findMin(ArrayList numbers){
        //min function looks for smallest number
        double min = (double) numbers.get(0);
        for(int i=1;i<numbers.size();i++) {
            if(min>(double)numbers.get(i)) {
                min=(double)numbers.get(i);
            }
        }
        return min;
    }
    public double calculateStd(ArrayList numbers){
        //std function uses sqrt((1/N)*(SIGMAitoN)(xsubi-mew)^2)
        double sum = 0;
        double sd = 0.0;
        double mean;
        int n = numbers.size();
        for (Object o : numbers) {
            sum = sum + (double) o;
        }
        mean = sum / (n);
        for (Object number : numbers) {
            sd = sd + Math.pow(((double) number - mean), 2);
        }
        return Math.sqrt(sd / n);
    }
}