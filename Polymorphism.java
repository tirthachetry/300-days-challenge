//Polymorphism allows methods to take different forms.
//It can be achieved through method overriding and method overloading.
// Parent class
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

// Child class overriding the draw method
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Child class overriding the draw method
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

// Method Overloading in a utility class
class AreaCalculator {
    double calculateArea(double radius) { // Circle area
        return Math.PI * radius * radius;
    }

    double calculateArea(double length, double width) { // Rectangle area
        return length * width;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Demonstrating Method Overriding
        System.out.println("Demonstrating Method Overriding:");
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.draw(); // Calls Circle's draw method
        rectangle.draw(); // Calls Rectangle's draw method

        // Demonstrating Method Overloading
        System.out.println("\nDemonstrating Method Overloading:");
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Circle Area: " + calculator.calculateArea(5)); // Calls single-parameter method
        System.out.println("Rectangle Area: " + calculator.calculateArea(4, 6)); // Calls two-parameter method
    }
}