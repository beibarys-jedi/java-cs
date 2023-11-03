package kz.java.homeworks.day2.examples;

public class OverflowErrors {
    public static void main(String[] args) {
        // example1
        int num1 = 462001478;
        double num2 = 15237444.12;
        int result = (int) (num1 * num2);

        System.out.println(result);

        // example1 - java: integer number too large
        int num11 = 12;
        double num21 = 15237444.12;
        int result2 = (int) (num11 * num21);

        System.out.println(result2);

    }
}
