package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        Scanner Scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Type anything: ");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Enter yes or no: ");
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("y")){
            return true;
        }else {
            return false;
        }
    }

    public int getInt (int min, int max){
        System.out.println("Enter a number: ");
        int input = Integer.parseInt(scanner.nextLine());
        if (input < min || input > max){
            System.out.println("Try Again.");
            return getInt(min, max);
        }else {
            return input;
        }
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a number: ");
        double input = Double.parseDouble(scanner.nextLine());
        if (input < min || input > max){
            System.out.println("Try Again.");
            return getDouble(min, max);
        }else {
            System.out.println("Your number is: ");
            return input;
        }

    }

    public double getDouble() {
        double min = 1;
        double max = 10;
        return getDouble(min ,max);
    }
}
