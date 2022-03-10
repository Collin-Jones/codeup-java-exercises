import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Collin");
        people[1] = new Person("Destiny");
        people[2] = new Person("Peter");

    }

    private static Person[] addperson(Person[] people, Person person) {
        Person[] newPeople = new Person[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            newPeople[i] = people[i];
        }
            newPeople[newPeople.length - 1] = person;
        return newPeople;
    }
}
