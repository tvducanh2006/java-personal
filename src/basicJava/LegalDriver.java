package basicJava;

import java.util.Scanner;

public class LegalDriver {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please input your age: ");
        int age = scan1.nextInt();
        System.out.println("Please answer whether you have a driver's license (true/false): ");
        boolean hasDriverLicense = scan1.nextBoolean();
        if (age >= 21 & hasDriverLicense){
            System.out.println("You're a legal driver.");
        }
        else {
            System.out.println("You're not a legal driver.");
        }
    }
}
