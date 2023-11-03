package kz.java.homeworks.day3;

public class Letter {
    public void writeLetter(){
        greeting();
        specialMessage();
        specialMessage();
        closing();
    }

    public void closing() {
        System.out.println("See you soon!");
    }

    public void specialMessage() {
        System.out.println("Computer science is awesome!");
    }

    public void greeting() {
        System.out.println("Hi, Friend");
    }

    public static void main(String[] args) {
        Letter friendLetter = new Letter();
        friendLetter.writeLetter();
    }

}
