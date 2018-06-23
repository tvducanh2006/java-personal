package basicJava;

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("What percent do you got on the homework?: ");
        int percent = scan1.nextInt();
        String overall;
        overall = "";
        if (percent < 61) {
            overall = "F";
        }
        if (percent > 60){
            overall = "D";
        }
        if (percent > 70){
            overall = "C";
        }
        if (percent > 80){
            overall = "B";
        }
        if (percent >= 90){
            overall = "A";
        }
        System.out.println("Your overall grade is " + overall);
    }
}
