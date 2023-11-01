package kz.java.lessons.unit2;

public class Lamp {
    private boolean isOn;

    public void turnOn(){
        isOn = true;
        System.out.println("Lamp is on!");
    }

    public void turnOff(){
        isOn = false;
        System.out.println("Lamp is off");
    }

    public static void main(String[] args) {
        Lamp lamp1 = new Lamp();
        lamp1.turnOn();
        Lamp lamp2 = new Lamp();
        lamp2.turnOff();
    }

}
