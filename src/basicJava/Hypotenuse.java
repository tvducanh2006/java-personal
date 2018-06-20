package basicJava;

public class Hypotenuse {
    public static void main(String[] args) {
        int side1 = 5;
        int side2 = 12;
        double hypo = Math.sqrt((Math.pow(side1, 2)) + (Math.pow(side2, 2)));
        System.out.println(hypo);
    }
}