package kz.java.lessons.unit2;

public class WrapperInteger {
    public static void main(String[] args) {
        Integer num1 = new Integer(157);
        System.out.println("num1 = " + num1);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);

        int num1int = num1.intValue();
        System.out.println("num1int = " + num1int);

    }
}
