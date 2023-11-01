package kz.java.homeworks;

public class DataTypes {
    public static void main(String[] args) {
        
        // declaring x variable
        int x;
        int a, b, c;
        double k, y, z;
        boolean found;
        // initializing x variable
        x = 10;
        found = true;
        
        // declare and initialized
        int l = 20;
        
        int total = 1011, n = 4;
        double average;
        average = (double) total/n;
        System.out.println("average = " + average);

        int num = 5;
        double realNum = num;
        // I can cast from int to double with out declaring type casting
        int reverseNum = (int) realNum;

        //I have to write data type in brackets (int)
        // System.out.println(num); // output will be 5
        // System.out.println(realNum); // output will be 0.5

        Integer numb = 10;
       /* System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(numb.TYPE);*/

        // final
        final double TAX_RATE = 0.12;
        System.out.println(TAX_RATE);

//        TAX_RATE = 12.4;

        
    }
}
