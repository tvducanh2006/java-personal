package basicJava;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int inputNumber = scan1.nextInt();
        if (inputNumber % 2 == 1){
            System.out.println("This is an odd number.");
        }
        else {
            System.out.println("This is an even number.");
        }
    }
}
