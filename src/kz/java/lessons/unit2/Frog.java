package kz.java.lessons.unit2;

public class Frog {
    public void move(){
        System.out.println("The frog moved forward 3 steps.");
    }

    public void move(int numbers){
        System.out.println(" " + numbers+ " hops.");
    }

    public void move(String direction, int hops){
        System.out.println("direction = " + direction);
        System.out.println("hops = " + hops);
    }

    public static void main(String[] args) {
        Frog frog1 = new Frog();
        frog1.move();

        Frog frog2 = new Frog();
        frog2.move("left", 6);
        frog2.move(2);
    }
}
