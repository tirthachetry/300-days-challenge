import java.util.*;
public class CustomSortingExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 85));
        students.add(new Student("Dave", 95));

        //Use Comparable for natural sorting logic embedded in the class.
        //Collections.sort(students);

        //Use Comparator for flexible sorting logic without modifying the class.
        // Sort by grade, then by name
        students.sort((s1, s2) -> {
           int gradeComparison = Integer.compare(s1.getGrade(), s2.getGrade());
           return (gradeComparison != 0) ? gradeComparison : s1.getName().compareTo(s2.getName());
        });
        // Print sorted list
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getGrade());
        }
    }
}

class Student //implements Comparable<Student>
{
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

//    @Override
//    public int compareTo(Student student) {
//        return this.name.compareTo(student.name);
//    }
}