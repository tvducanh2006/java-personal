package basicJava;

import java.util.Scanner;

public class DoNDrills {
    public static void main(String[] args) {
        for (int i=0 ; i<10 ; i++){
            System.out.print(i + "; ");
        }
        System.out.println();

        for (int i=0 ; i<11 ; i++){
            System.out.print(i + "; ");
        }
        System.out.println();

        for (int i=10 ; i>=0 ; i--){
            System.out.print(i + "; ");
        }
        System.out.println();

        for (int i=1 ; i<33 ; i*=2){
            System.out.print(i + "; ");
        }
        System.out.println();

        for (int i=1 ; i<26 ; i+=2){
            System.out.print(Math.sqrt(i) + "; ");
        }
        System.out.println();

        for (int i=10 ; i>0 ; i--){
            System.out.print(i + "; ");
        }
        System.out.println();

        for (int i=32 ; i>0 ; i/=2){
            System.out.print(i + "; ");
        }
        System.out.println();

        for (int i=2 ; i<11 ; i++){
            System.out.print("1/ " + i + "; ");
        }
        System.out.println();

        // First way
//        Scanner scan1 = new Scanner(System.in);
//        System.out.println("Please input a number: ");
//        int numRows = scan1.nextInt();
//        for(int row = 1 ; row < numRows+1 ; row++){
//            for(int space = numRows-row; space>0 ; space--){
//                System.out.print(" ");
//            }
//            for(int star = 1 ; star < row*2 ; star++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Second way
        Scanner scan1= new Scanner(System.in);
        System.out.println("Please input a number: ");
        int numRows = scan1.nextInt();
        int maxStars = 2*numRows;
        for(int starsInRow=1 ; starsInRow < maxStars ; starsInRow+=2) {
            for (int numSpace = numRows - 1; numSpace > 0; numSpace--) {
                System.out.print(" ");
            }
            numRows--;
            for (int numStars = 0; numStars < starsInRow; numStars++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0 ; i<5 ; i++){
            System.out.print("  X");
        }
        System.out.println();
        System.out.print("  ");
        for(int i=0 ; i<4 ; i++){
            System.out.print("  X");
        }
        System.out.println();
        for(int i=0 ; i<5 ; i++){
            System.out.print("  X");
        }
    }
}
