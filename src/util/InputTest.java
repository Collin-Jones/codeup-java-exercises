package util;

public class InputTest {
    public static void main(String[] args){
        Input input = new Input();
        System.out.println("Get integer between " + input.getInt(1, 10));
    }
}
