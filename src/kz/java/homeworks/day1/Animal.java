package kz.java.homeworks.day1;

// fields -

// methods - functions


public class Animal {
    public String type1 = "Person";
    private String type2 = "Haiuan";

    public static void main(String[] args) {
        System.out.println(myAge(1993));

//        System.out.println(romanToInt("III"));
    }

    public static int myAge(int birthYear){
        int c = 2023 - birthYear;
        return c;
    }

}
