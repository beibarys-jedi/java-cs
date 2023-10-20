package kz.java.lessons.unit2;
public class Car {
    private String make;
    private boolean isSports;
    private String owner;

    public Car(String make, boolean isSports, String owner) {
        this.make = make;
        this.isSports = isSports;
        this.owner = owner;
    }

    public Car() {
        make = null;
        isSports = false;
        owner = null;
    }


}
