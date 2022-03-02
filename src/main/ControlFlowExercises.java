package main;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int aNumber= 5;
//        while(aNumber<=15){
//            System.out.println(aNumber + "");
//            aNumber++;
//        }
//        long aNumber2 = 2;
//
//        do {
//            System.out.println(aNumber2);
//            aNumber2*=aNumber2;
//        } while (aNumber2 < 1000000L);

//        for (int aNumber = 5; aNumber<=15; aNumber++){
//            System.out.println(aNumber);
//        }
//        for (int aNumber2 = 2; aNumber2 < 1000000L; aNumber2++) {
//            System.out.println(aNumber2);
//        }

//        for (int aNumber3 = 1; aNumber3 <= 100; aNumber3++) {
//            if (aNumber3 % 3 == 0 && aNumber3 % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (aNumber3 % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (aNumber3 % 3 == 0){
//                System.out.println("Fizz");
//            }else{
//                System.out.println(aNumber3);
//            }
//
//        }

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer: " );
        String userInput = input.nextLine();
        int userNum = Integer.parseInt(userInput);

        System.out.println(userNum);
        System.out.println("number | squared | cubed\n");
        System.out.println("------ | ------- | -----\n");
        for (int i = 1; i <= userNum ; i++) {
            System.out.printf("%d   | %d   | %d \n" , i, i*i, (i*i*i));
        }
    }
}
