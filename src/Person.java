public class Person {
    private String name;

    public Person(String name) {

    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println(getName() + " says Hello");
    }
    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public static void main(String[] args){
        Person person1 = new Person("Collin");
        System.out.println(person1.getName());
        System.out.println(person1.getName());
        person1.sayHello();
        person1.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person1.getName());

    }
}
