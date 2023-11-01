package kz.java.lessons.unit2;

import java.net.CacheRequest;

public class Calculator {
    public void calcAverage(int num1, double num2){
        double average = (num1 + num2)/2;
        System.out.println("The average is " + average);
    }

    public void printInfo(String name, double grade){
        System.out.println(name + " has a grade of " + grade);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calcAverage(20, 10.0);


        Calculator student1 = new Calculator();
        student1.printInfo("Hamilton", 78.1);

    }
}
