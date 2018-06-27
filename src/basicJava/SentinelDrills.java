package basicJava;

import java.util.Scanner;

public class SentinelDrills {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int inputNumber1 = scan1.nextInt();
        int times = 0;
        while (inputNumber1 != 1){
            times++;
            inputNumber1 /= 2;
        }
        System.out.println("The times we needed to divide is " + times);

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int inputNumber2 = scan2.nextInt();
        while (inputNumber2 % 4 != 0){
            System.out.println(Math.sqrt(inputNumber2));
        }

        Scanner scan4 = new Scanner(System.in);
        System.out.println("What do you want to say?(stop to stop): ");
        String inputString1 = scan4.nextLine();
        while (inputString1 != "stop"){
            System.out.print(inputString1 + "; ");
        }
        System.out.println();



    }
}
