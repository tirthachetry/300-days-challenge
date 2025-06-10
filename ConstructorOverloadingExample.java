//Constructor overloading in Java allows a class to have multiple constructors with different parameter lists.
// This enables the creation of objects in various ways.
class PersonExample {
    private String name;
    private int age;

    // Constructor with no parameters
    public PersonExample() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with one parameter
    public PersonExample(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with two parameters
    public PersonExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        PersonExample person1 = new PersonExample(); // Calls no-parameter constructor
        PersonExample person2 = new PersonExample("Alice"); // Calls one-parameter constructor
        PersonExample person3 = new PersonExample("Bob", 25); // Calls two-parameter constructor

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
    }
}
