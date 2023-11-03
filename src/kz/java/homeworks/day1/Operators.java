package kz.java.homeworks.day1;

public class Operators {
    public static void main(String[] args) {
        //Arithmetics Operators
        int a = 100, b = 3;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //Relational >, <, ==, !=

        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>=b);

        //Logical operators - AND, OR, NOT
        boolean isFound = false;
        System.out.println(!isFound); // NOT
        int count = 20;
        if (count > 10 || count < -10) { // && AND, || OR
            System.out.println("This is a solution");;
        } else {
            System.out.println("It is not a solution");
        }


    }
}
