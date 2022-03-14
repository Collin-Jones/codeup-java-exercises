import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Addition method: " + addition(5, 5));
        System.out.println("Subtraction method: " + subtraction(8, 3));
        System.out.println("Multiplication method: " + multiplication(9, 9));
        System.out.println("Division method: " + division(10, 5));
        System.out.println("Modulus method: " + modulus(3, 4));
    }

    private static int addition(int num1, int num2) {
        return num1 + num2;
    }
    private static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    private static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    private static int division(int num1, int num2) {
        return num1 / num2;
    }
    private static int modulus(int num1, int num2) {
        return num1 % num2;
    }


    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = Integer.parseInt(scan.nextLine());

        if(userInput < min){
            System.out.println("Number is invalid.");
            return getInteger(min, max);
        }else if(userInput > max){
            System.out.println("Number is invalid.");
            return getInteger(min, max);
        }else {
            System.out.println("Number is valid.");
            return userInput;
        }
    }

    public static void factorial(){
        int userInput = getInteger(1, 10);
        long total = 1L;
        System.out.println("You have entered " + userInput);
        for (int fact = userInput; fact > 0; fact--) {
            total = total * fact;
        }
    }

}


