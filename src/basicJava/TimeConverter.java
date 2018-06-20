package basicJava;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please input the number of hours: ");
        int hours = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please input the number of minutes: ");
        int minutes = scan2.nextInt();
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Please input the number of seconds");
        int seconds = scan3.nextInt();
        int finalseconds = hours * 3600 + minutes * 60 + seconds;
        System.out.println(finalseconds + " seconds");
    }
}
