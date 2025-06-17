//Object Lifecycle in Java
//Creation: An object is created using the new keyword, and memory is allocated in the heap.
// The constructor initializes the object.
//Usage: The object is used to call methods or access fields.
//Becoming Unreachable: The object becomes unreachable when no references point to it.
//Garbage Collection: The JVM reclaims memory for unreachable objects.
//Destruction: The object is removed from memory.
class MyClass {
    private final String message;

    // Constructor
    public MyClass(String message) {
        this.message = message;
    }

    // Method to display the message
    public void displayMessage() {
        System.out.println("Message: " + message);
    }

    // Finalize method (called before garbage collection)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called. Object is being garbage collected.");
    }
}
public class ObjectLifecycleExample {
    public static void main(String[] args) {
        // Step 1: Creation
        MyClass obj = new MyClass("Hello, World!");

        // Step 2: Usage
        obj.displayMessage();

        // Step 3: Becoming Unreachable
        obj = null; // The object is now eligible for garbage collection

        // Step 4: Request Garbage Collection
        System.gc(); // Request garbage collection (not guaranteed to run immediately)

        System.out.println("End of main method.");
    }
}