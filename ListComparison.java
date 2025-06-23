// Java program demonstrating ArrayList vs LinkedList
// Use Case: ArrayList is ideal for frequent random access,
// while LinkedList is better for frequent insertions/deletions.
import java.util.ArrayList;
import java.util.LinkedList;
public class ListComparison {
    public static void main(String[] args) {
        // ArrayList example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList example
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("X");
        linkedList.add("Y");
        linkedList.add("Z");
        System.out.println("LinkedList: " + linkedList);

        // Accessing elements
        System.out.println("ArrayList element at index 1: " + arrayList.get(1)); // Fast access
        System.out.println("LinkedList element at index 1: " + linkedList.get(1)); // Slower access

        // Inserting elements
        arrayList.add(1, "D"); // Slower due to shifting
        linkedList.add(1, "W"); // Faster due to direct link manipulation
        System.out.println("ArrayList after insertion: " + arrayList);
        System.out.println("LinkedList after insertion: " + linkedList);
    }
}