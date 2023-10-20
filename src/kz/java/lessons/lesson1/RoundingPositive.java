package kz.java.lessons.lesson1;

public class RoundingPositive {
    public static void main(String[] args) {
        double number = 11.0 / 4;
        int roundedNumber = (int)(number + 0.5);
        System.out.println("11.0 / 4 = " + number);
        System.out.println("11.0 / 4 = " + (int) number);
        System.out.println("11.0 / 4 rounded will be " + roundedNumber);
    }
}
