package LastGroupAssignmentGroup;

public class factorial {
    public static int factorial(int n) {
        if (n == 1) {
            return 1; // Base case: factorial of 1 is 1
        }
        return n * factorial(n - 1); // Recursive case: n * factorial(n-1)
    }

    // Main method to test the factorial method
    public static void main(String[] args) {
        // Test the factorial method
        System.out.println(factorial(1)); // Output: 1
        System.out.println(factorial(2)); // Output: 2
        System.out.println(factorial(3)); // Output: 6
        System.out.println(factorial(5)); // Output: 120
        System.out.println(factorial(7)); // Output: 5040
    }
}
