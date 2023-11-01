package kz.java.lessons.unit2;

public class StringDemo {
    public static void main(String[] args) {
        String name1 = "Jadon Java";
        // String - class, name1 - variable, Jadon Java - String literal

        String name2 = new String("Jessica Java");
        // String - new String class using new keyword with parameter

        String name3 = new String(name1);
        // name1 will be pointing to actual parameter

        // Strings objects are immutable, which means unable to be changed
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        int age = 17;
        String Jadon = name1 + age;
        System.out.println(Jadon);
        name2 += 16;
        System.out.println(name2);

        // Escaping Sequences: \\ - a backslash, \n - new line

        String word1 = "Jadon Java";
        String word2 = new String("Jessica Java");

        System.out.println("\"" + word1 + "\"");
        System.out.println("\\" + word2 + "\\");
        System.out.println(word2 + "\n");
        System.out.println("examples of sequences of 2.6 sec");




    }
}
