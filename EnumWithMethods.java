//Enums in Java are used to define a fixed set of constants.
//They are particularly useful when you need to represent a predefined list of values
enum Operation {
    ADD {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT {
        @Override
        public int apply(int a, int b) {
            return a - b;
        }
    };
    public abstract int apply(int a, int b);

}

public class EnumWithMethods {
    public static void main(String[] args) {
        int result = Operation.ADD.apply(5, 3);
        System.out.println("Result: " + result); // Output: Result: 8
    }
}

//Use Cases for Enums:
//Defining Constants: Replace a group of related constants with a type-safe enumeration.
//Switch Statements: Use enums in switch statements for cleaner and more readable code.
//Custom Methods: Add methods to enums for additional functionality.
//Type Safety: Prevent invalid values by restricting inputs to predefined constants.