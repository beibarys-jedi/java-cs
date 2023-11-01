package kz.java.lessons.unit2;

public class MathDemo {
    public static void main(String[] args) {
        double powerOf2 = Math.pow(2.0, 7.0);
        System.out.println("powerOf2 = " + powerOf2);

        double num2 = 26.8;
        double expo = 4;

        double result1 = Math.abs(-144);

        System.out.println(Math.sqrt(result1));
        System.out.println(Math.random() * 10);
        System.out.println(Math.pow(4, 4));

        System.out.println((int)(Math.random() * 100)); // i can get any number from 0 to 99
        System.out.println((int)(Math.random() * 100) + 1); // i can get any number from 1 to 100
    }
}
