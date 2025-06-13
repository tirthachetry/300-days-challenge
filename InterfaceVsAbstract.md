### Difference: Interface vs Abstract Class in Java

| **Aspect**               | **Interface**                                                                 | **Abstract Class**                                                      |
|--------------------------|-------------------------------------------------------------------------------|-------------------------------------------------------------------------|
| **Purpose**              | Defines a contract that implementing classes must follow.                    | Serves as a base class with shared functionality and abstract methods. |
| **Inheritance**          | A class can implement multiple interfaces.                                   | A class can extend only one abstract class.                            |
| **Methods**              | Can have abstract methods, default methods, and static methods (since Java 8). | Can have abstract and concrete methods.                                |
| **Fields**               | Fields are implicitly `public`, `static`, and `final`.                       | Can have instance variables with any access modifier.                  |
| **Access Modifiers**     | Methods are implicitly `public`.                                             | Methods can have any access modifier.                                  |
| **Constructors**         | Cannot have constructors.                                                    | Can have constructors.                                                 |
| **Use Case**             | Used for defining behavior without implementation.                           | Used for sharing code and defining a common base.                      |