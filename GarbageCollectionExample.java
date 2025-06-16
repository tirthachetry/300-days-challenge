//Garbage collection in Java is an automatic process managed by the JVM to reclaim memory by removing objects that are no longer reachable.
public class GarbageCollectionExample {
    public static void main(String[] args) {
        GarbageCollectionExample obj = new GarbageCollectionExample();
        obj = null; // Make the object eligible for garbage collection

        // Request garbage collection
        System.gc();

        System.out.println("Garbage collection requested.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called before garbage collection.");
    }
}

// Objects become eligible for garbage collection when they are no longer referenced.
// The System.gc() method can request garbage collection, but it is not guaranteed to run immediately.
// The finalize() method is called before an object is collected, but its use is discouraged due to unpredictability.
//Best Practices:
//Avoid relying on finalize().
//Use proper resource management (e.g., try-with-resources).
//Monitor memory usage with tools like VisualVM or JConsole.
