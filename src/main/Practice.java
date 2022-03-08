package main;
//Write a static function called mapValueToColor that takes an int parameter called colorVal and returns a string that is the associated color.
// If no color maps to the given colorVal then return an empty string. The color table is as follows:
//        1	Blue
//        2 Red
//        3	Orange
//        4	Yellow
//        5 Violet
//        6	Black
//        7	White
//        example:
//        String myColor = MondayWork.mapValueToColor(3);
//        System.out.println(myColor); // prints “Orange”
public class Practice {
    public static void mapValueToColor() {
        int colorVal = 1;

        switch(colorVal){
            case 1 :
                System.out.println("Blue");
                break;
            case 2 :
                System.out.println("Red");
                break;
            case 3 :
                System.out.println("Orange");
                break;
            case 4 :
                System.out.println("Yellow");
                break;
            case 5 :
                System.out.println("Violet");
                break;
            case 6 :
                System.out.println("Black");
                break;
            case 7 :
                System.out.println("White");
                break;
            default :
                System.out.println("");
                break;
        }
    }
}
