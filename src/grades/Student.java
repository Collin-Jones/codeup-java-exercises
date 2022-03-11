package grades;

import java.util.ArrayList;

public class Student {

    private final String name;
    private final ArrayList<Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

}
