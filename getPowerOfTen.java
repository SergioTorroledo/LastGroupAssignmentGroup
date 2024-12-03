package LastGroupAssignmentGroup;

public class getPowerOfTen {
    public static int getPowerOfTen(int n) {
        if (n == 0) {
            return 1; // Base case: 10^0 is 1
        }
        return 10 * getPowerOfTen(n - 1); // Recursive case: 10 * 10^(n-1)
    }

    // Main method to test the getPowerOfTen method
    public static void main(String[] args) {
        // Test the getPowerOfTen method
        System.out.println(getPowerOfTen(5)); // Output: 100000
        System.out.println(getPowerOfTen(3)); // Output: 1000
        System.out.println(getPowerOfTen(2)); // Output: 100
    }
}
