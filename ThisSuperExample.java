//this keyword is used to refer to the current instance of the class.
//super keyword is used to refer to the immediate parent class.
class ParentClass {
    String message = "Message from ParentClass";

    public void displayMessage() {
        System.out.println("ParentClass method: " + message);
    }
}

public class ThisSuperExample extends ParentClass {
    String message = "Message from ThisSuperExample";

    public void displayMessage() {
        System.out.println("ChildClass method: " + this.message); // Refers to the current class variable
        super.displayMessage(); // Calls the parent class method
    }

    public void demonstrateThis() {
        this.displayMessage(); // Calls the current class method
    }

    public static void main(String[] args) {
        ThisSuperExample example = new ThisSuperExample();
        example.demonstrateThis();
    }
}

//use cases
//this Keyword
//Access Current Instance Variables
//Call Current Class Methods
//Invoke Current Class Constructor.
//Pass Current Instance
//super Keyword
//Access Parent Class Variables
//Call Parent Class Methods
//Invoke Parent Class Constructor