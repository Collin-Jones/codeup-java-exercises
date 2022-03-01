package main;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

        System.out.format("The value of pi is approximately %.2f%n", pi);


        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number- ");
        int number = input.nextInt();
        System.out.println(number);

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the strings: ");
        String userInput = input1.next();
        System.out.println(userInput);
    }
}
