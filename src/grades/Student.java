package grades;

import java.util.ArrayList;

public class Student {

    private final String name;
    private final ArrayList<Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }
    public void addGrades(double grade){
        this.grades.add(grade);
    }
    public double getGradeAverage(){
        double sum = 0;
        for (Double grade : this.grades){
            sum +=grade;
        }
        return (sum / this.grades.size());
    }

    public static void main(String[] args) {
        Student student = new Student("Collin");
        student.addGrades(90);
        student.addGrades(75);
        student.addGrades(89);
        System.out.println(student.getName() + "'s average is: " + student.getGradeAverage());
    }
}
