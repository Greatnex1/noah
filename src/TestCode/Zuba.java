package TestCode;

import java.util.Scanner;

public class Zuba {


    public static void main(String... good) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int userInput = input.nextInt();


        if (userInput % 2 == 1)
            System.out.println("Odd Number");

        if (userInput % 2 == 0)
            System.out.println("Even Number");


    }

}
// ODD 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49,
// Even 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, and 50