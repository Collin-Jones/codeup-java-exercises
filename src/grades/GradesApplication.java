package grades;

import java.util.HashMap;


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
    }

}
