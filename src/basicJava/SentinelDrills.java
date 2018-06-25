package basicJava;

import java.util.Scanner;

public class SentinelDrills {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int inputNumber = scan1.nextInt();
        int times = 0;
        while (inputNumber != 1){
            times++;
            inputNumber /= 2;
        }
        System.out.println("The times we needed to divide is " + times);
    }
}
