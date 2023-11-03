package kz.java.homeworks.day3;

public class Bill {
    public static double divideBill(int numberFriends, double totalBill){
        double bill = totalBill/numberFriends;
        return bill;
    }
    //this is a method for calculating
    public static void main(String[] args) {
        System.out.println(divideBill(4, 12345.33));
    }
}
