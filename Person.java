import java.util.Objects;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Custom equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if both references point to the same object
        if (obj == null || getClass() != obj.getClass()) return false; // Check for null and class type
        Person person = (Person) obj; // Cast to Person
        return age == person.age && (Objects.equals(name, person.name)); // Compare fields
    }

    // Custom hashCode
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0; // Hash code for name
        result = 31 * result + age; // Combine with age using a prime multiplier
        return result;
    }

    // Getters and setters (optional)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}