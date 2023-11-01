package kz.java.lessons.unit2;

public class WrapperDouble {
    public static void main(String[] args) {
        Double score1 = new Double(89.45);
        System.out.println("score1 = " + score1);
        
        Double score2 = new Double(92.38);
        Double score3 = new Double(100.01);
        Double meanScore = (score1 + score2 + score3)/3;
        System.out.println("meanScore = " + meanScore);
        
        double mean2 = meanScore.doubleValue();
        System.out.println("mean2 = " + mean2);

        System.out.println(meanScore.getClass());
    }
}
