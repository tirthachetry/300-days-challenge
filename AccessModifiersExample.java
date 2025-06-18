public class AccessModifiersExample {
    // Public field: Accessible from anywhere
    //Use this for methods or fields that need to be universally accessible, such as utility methods or APIs.
    public String publicField = "I am public";

    // Private field: Accessible only within this class
    //Use this to encapsulate sensitive data or helper methods that should not be exposed outside the class.
    private String privateField = "I am private";

    // Protected field: Accessible within the same package and subclasses
    //Use this for methods or fields intended to be inherited and used by subclasses.
    protected String protectedField = "I am protected";

    // Default (package-private) field: Accessible within the same package
    //Use this for internal implementation details that should not be exposed outside the package.
    String defaultField = "I am default";

    // Public method: Accessible from anywhere
    public void publicMethod() {
        System.out.println("Public method: " + publicField);
    }

    // Private method: Accessible only within this class
    private void privateMethod() {
        System.out.println("Private method: " + privateField);
    }

    // Protected method: Accessible within the same package and subclasses
    protected void protectedMethod() {
        System.out.println("Protected method: " + protectedField);
    }

    // Default (package-private) method: Accessible within the same package
    void defaultMethod() {
        System.out.println("Default method: " + defaultField);
    }

    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        // Accessing all fields and methods within the same class
        System.out.println(example.publicField);
        System.out.println(example.privateField);
        System.out.println(example.protectedField);
        System.out.println(example.defaultField);

        example.publicMethod();
        example.privateMethod();
        example.protectedMethod();
        example.defaultMethod();
    }
}