package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {

        boolean runningOptions = true;
        while(runningOptions){
            System.out.println(displayMenu());
            int response = userChoices();
            runningOptions = theChoices(answer);
        }
    }
    // need to make the same display menu
    private static String displayMenu(){
        String choices = "What would you like to do?\n" +
                "0 - exit\n" +
                "1 - view all movies\n"+
                "2 - view movies in the animated category\n"+
                "3 - view movies in the drama category\n"+
                "4 - view movies in the horror category\n"+
                "5 - view movies in the scifi category\n";
        return choices;
    }
    //prompt a user input option
    private static int userChoices(){
        Input input = new Input();
        System.out.println("Enter your choice: ");
        int response = input.getInt(0,5);
        return response;
    }
    private static void moviesCatergory(String category){
        for (Movie movie : MoviesArray.findAll()) {
            if(movie.getCategory().equalsIgnoreCase(category)){
                System.out.println("%s -- %s\n", movie.getName(), movie.getCategory());
            }
        }
    }

    // switch case the choices
    private static boolean theChoices(int userChoice){
        boolean runningOption = true;

        switch (userChoice){
            case 0:
                runningOption = false;
                break;
            case 1:
                System.out.println("\n");
                for(Movie movie : MoviesArray.findAll());
                System.out.println("%s -- %s\n", movie.getName(), movie.getCategory());

            case 2:
                System.out.println("\n");
                moviesCatergory("animated");
                break;
            case 3:
                System.out.println("\n");
                moviesCatergory("drama");
                break;
            case 4:
                System.out.println("\n");
                moviesCatergory("horror");
                break;
            case 5:
                System.out.println("\n");
                moviesCatergory("scifi");
                break;
        }
        return runningOption;
    }

}
