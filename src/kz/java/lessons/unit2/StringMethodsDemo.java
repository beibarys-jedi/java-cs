package kz.java.lessons.unit2;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String wordDay = new String("computational");
        System.out.println(wordDay.indexOf("n"));
        System.out.println(wordDay.indexOf("a"));
        System.out.println(wordDay.indexOf("c"));

        System.out.println(wordDay.substring(8, 12));
        System.out.println(wordDay.substring(8));

        String word1 = "word1";
        String word2 = "word2";
        System.out.println(word1.length());
        System.out.println(word1.equals(word2));
        System.out.println(word1.compareTo(word2));


    }
}
