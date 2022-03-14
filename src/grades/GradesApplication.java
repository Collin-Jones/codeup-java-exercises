package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args){
        HashMap<String, Student> student = new HashMap<>();

        Student margit = new Student("Margit, The Fell Omen");
        margit.addGrades(50);
        margit.addGrades(34);
        margit.addGrades(65);
        margit.addGrades(70);

        Student godrick = new Student("Godrick, the Grafted");
        godrick.addGrades(65);
        godrick.addGrades(70);
        godrick.addGrades(68);
        godrick.addGrades(71);

        Student renalla = new Student("Renalla, Queen of the Full Moon");
        renalla.addGrades(75);
        renalla.addGrades(79);
        renalla.addGrades(82);
        renalla.addGrades(88);

        Student radagon = new Student("Radagon, of the Golden Order");
        radagon.addGrades(84);
        radagon.addGrades(89);
        radagon.addGrades(93);
        radagon.addGrades(99);

        printOutput(student);
        printStudentData(student);
    }

    public static void printOutput(HashMap<String, Student> student){
        System.out.println("Welcome");
        System.out.println("\nHere is the list of the student's Github username: \n");
        System.out.println("| ");
        for (String username : student.keySet()){
            System.out.println("%s | " + username);
        }
        System.out.println("\n What student would you like to see more information on?");
    }

    public static void printStudentData(HashMap<String, Student> student){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Student findStudent;
        for(String key : student.keySet()){
            if(!student.containsKey(key)){
                System.out.println("Sorry, no student found with the GitHub username of %s" + key);
            }else if (userInput.equalsIgnoreCase(key)){
                findStudent = student.get(key);
                System.out.println("Name: %s - Github username - %s \n" + "Current Grade average - %.2f\n" + findStudent.getName() + key + findStudent.getGradeAverage());
            }
        }
    }
}
