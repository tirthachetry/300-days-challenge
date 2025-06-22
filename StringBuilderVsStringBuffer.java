// Java program demonstrating the difference between StringBuilder and StringBuffer
// Use Case: StringBuilder is preferred in single-threaded environments for better performance,
// while StringBuffer is used in multi-threaded environments where thread safety is required.
public class StringBuilderVsStringBuffer {
    public static void main(String[] args) {
        // Explanation: StringBuilder is not synchronized, making it faster but not thread-safe.
        // Use Case: Suitable for single-threaded applications.
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World");
        System.out.println("StringBuilder: " + stringBuilder);

        // Explanation: StringBuffer is synchronized, ensuring thread safety but with performance overhead.
        // Use Case: Suitable for multi-threaded applications.
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        System.out.println("StringBuffer: " + stringBuffer);
    }
}
