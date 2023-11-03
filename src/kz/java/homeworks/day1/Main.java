package kz.java.homeworks.day1;

public class Main {
    public static void main(String[] args) {
        Animal Anuar = new Animal();
        Animal Zhanuar = new Animal();

        System.out.println(Anuar.type1);
//        System.out.println(Anuar.type2);

        meanThreeNumbers(500, 450, 500);

    }

    public static void meanThreeNumbers(int a, int b, int c){
        System.out.println((a+b+c)/3);
    }

}
