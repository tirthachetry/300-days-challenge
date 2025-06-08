//Encapsulation is achieved by:
//Declaring class fields as private.
//Providing public getter and setter methods to access and modify these fields.
class Employee {
    private String name; // Private field
    private double salary; // Private field

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for salary
    public double getSalary() {
        return salary;
    }

    // Public setter for salary
    public void setSalary(double salary) {
        if (salary > 0) { // Validation logic
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Setting values using setters
        emp.setName("Tirtha");
        emp.setSalary(50000);

        // Accessing values using getters
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}

//Encapsulation is useful for:
//Data Hiding: Prevents unauthorized access to sensitive data.
//Validation: Allows adding validation logic in setter methods.
//Modularity: Makes the code easier to maintain and modify.