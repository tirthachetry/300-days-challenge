//parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

//child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method from Animal
        dog.bark(); // Method from Dog class
    }
}
