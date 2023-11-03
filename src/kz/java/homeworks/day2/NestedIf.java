package kz.java.homeworks.day2;

public class NestedIf {
    public static void main(String[] args) {
        int n = 3;

        if ( n > 0) {
            if( n >= 10 || n < 2) {
                System.out.println(n + "is not a digit");
            }
            System.out.println(n + " is a digit");
        }
    }
}
