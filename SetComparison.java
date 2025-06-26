// Java program demonstrating HashSet vs TreeSet
import java.util.HashSet;
import java.util.TreeSet;
public class SetComparison {
    public static void main(String[] args) {
        // HashSet example
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Cherry");
        System.out.println("HashSet: " + hashSet); // Output order is not guaranteed

        // TreeSet example
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        System.out.println("TreeSet: " + treeSet); // Output is sorted
    }
}
// difference between HashSet and TreeSet
// HashSet:
// - Does not maintain any order of elements.
// - Allows null elements.
// - Provides constant time performance for basic operations (add, remove, contains).
// - Uses hash table for storage.
// - Not synchronized, so not thread-safe by default.
// TreeSet:
// - Maintains elements in sorted order (natural ordering or by a comparator).
// - Does not allow null elements (throws NullPointerException).
// - Provides log(n) time performance for basic operations (add, remove, contains).
// - Uses a red-black tree for storage.
// - Not synchronized, so not thread-safe by default.
// Use Case:
// - Use HashSet when you need fast access and do not care about the order of elements.
// - Use TreeSet when you need to maintain a sorted order of elements and can afford the log(n) time complexity for
// operations.
