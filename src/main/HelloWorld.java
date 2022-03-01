package main;


public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, World! \n");

        int myFavoriteNumber;

        myFavoriteNumber = 7;
        System.out.println("My favorite number is : " + myFavoriteNumber);

        char charToAdd1 = '?';

        String myString;
        myString = "What am I doing ";
        System.out.println(myString + "with my life" + charToAdd1);

//         long myNumber = 123;
        float myNumber = (float) 3.14;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);



//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//
//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y *= x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);
    }
}






