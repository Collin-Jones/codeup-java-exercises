package main;

public class Practice {
    public static void main(String[] args) {
        String myColor = Practice.mapValueToColor(1);
        System.out.println(myColor);
    }

        private static String mapValueToColor(int colorVal){

            switch(colorVal){
                case 1 :
                    System.out.println("1: Blue");

                case 2 :
                    System.out.println("2: Red");

                case 3 :
                    System.out.println("3: Orange");

                case 4 :
                    System.out.println("4: Yellow");

                case 5 :
                    System.out.println("5: Violet");

                case 6 :
                    System.out.println("6: Black");

                case 7 :
                    System.out.println("7: White");

                default :
                    System.out.println("");


            }
            return "";
        }


}
