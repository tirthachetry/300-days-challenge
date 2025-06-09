//Abstraction is achieved using abstract classes and interfaces.
//Interfaces define a contract that implementing classes must follow.
// Interface
interface Vehicle {
    void move(); // Abstract method
}

// Class implementing the interface
class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("The car drives on roads.");
    }
}

// Another class implementing the interface
class Bike implements Vehicle {
    @Override
    public void move() {
        System.out.println("The bike rides on roads.");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.move(); // Calls Car's implementation
        bike.move(); // Calls Bike's implementation
    }
}
//Abstraction hides implementation details and exposes only essential features.
//It improves code reusability, flexibility, maintainability, security, modularity, and supports polymorphism.