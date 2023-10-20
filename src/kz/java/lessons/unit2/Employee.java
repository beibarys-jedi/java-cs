package kz.java.lessons.unit2;

public class Employee {
    private String name;
    private String empID;
    private int pay;

    public Employee() {
    }

    public Employee(String name, String empID, int pay) {
        this.name = name;
        this.empID = empID;
        this.pay = pay;
    }

    public Employee(String name, String empID) {
        this.name = name;
        this.empID = empID;
    }
}

