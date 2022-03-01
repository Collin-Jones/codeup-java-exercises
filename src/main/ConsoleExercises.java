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

        Scanner wordInput = new Scanner(System.in);
        System.out.println("Enter three words : ");
        String firstWord = wordInput.next();
        String secondWord = wordInput.next();
        String thirdWord = wordInput.next();
        System.out.printf("%s %s %s %n", firstWord, secondWord, thirdWord);



        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the strings: ");
        String userInput = input1.next();
        System.out.println(userInput);


        System.out.print("Length of the room is %n");
        String lengthOfRoom= input.nextLine();
        System.out.print("Width of the room is ");
        String widthOfRoom= input.nextLine();

        int length = Integer.parseInt(lengthOfRoom);
        int width = Integer.parseInt(widthOfRoom);
        int area = length * width;
        int perimeter = (2 * length) + (2 * width);
        System.out.printf("Area of the room is %d %n Perimeter of the room is %d %n", area, perimeter);
    }
}









