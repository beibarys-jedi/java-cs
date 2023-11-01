package kz.java.lessons.unit2;

public class WrapperPractice {
    public static void main(String[] args) {
        int num = 157;
        Integer num1 = new Integer(num);
        Integer integerNum = num;
        System.out.println("num = " + num);
        System.out.println("num1 = " + num1);
        System.out.println("integerNum = " + integerNum);

        int unNum1 = num1;
        System.out.println("unNum1 = " + unNum1);

        int sum = num + num1 + integerNum;
        System.out.println("sum = " + sum);
    }
}
