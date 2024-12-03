package LastGroupAssignmentGroup;

public class getMultiChar {
    public static String getMultiChar(String ch, int n) {
        if (n < 0) {
            return ""; // Base case: if n is less than 0, return an empty string
        }
        return ch + getMultiChar(ch, n - 1); // Recursive case: append the character recursively
    }

    // Main method to test the getMultiChar method
    public static void main(String[] args) {
        // Test the getMultiChar method
        System.out.println(getMultiChar("y", 4));  // Output: yyyyy
        System.out.println(getMultiChar("#", 10)); // Output: ###########
        System.out.println(getMultiChar("i", 15)); // Output: iiiiiiiiiiiiiiii
    }
}
