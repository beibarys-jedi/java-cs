package kz.java.homeworks.day2;

public class ControlStructures {
    public static void main(String[] args) {
        int grade = 5;

        if (grade > 5 || grade < 0) {
            System.out.println("illegal grade");
        } else if(grade == 5) {
            System.out.println("You are amazing");
        } else {
            System.out.println("grade = " + grade);
        }
    }
}
