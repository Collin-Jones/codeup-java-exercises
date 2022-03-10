import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {"adorable", "adventurous", "aggressive", "alert", "alive", "better", "calm", "careful", "", };
    public static String[] nouns = {"cat", "dog", "lizard", "water", "snow", "rice", "milk", "ring", "mouse", "door"};

    public static void main(String[] args){
        System.out.println("Chosen name: ");
        System.out.println(getWord(adjectives) + " " + getWord(nouns));
    }

    private static String getWord(String[] choices) {
        Random random = new Random();
        int randomNumber = random.nextInt(choices.length);
        return choices[randomNumber];
    }
}
