package LastGroupAssignmentGroup;

public class getPowerOfTen2 {
    public static int getPowerOfTenLoop(int n) {
        int result = 1; // Start with 10^0 = 1
        for (int i = 0; i < n; i++) {
            result *= 10; // Multiply by 10 in each iteration
        }
        return result;
    }

    // Main method to test the getPowerOfTenLoop method
    public static void main(String[] args) {
        // Test the getPowerOfTenLoop method
        System.out.println(getPowerOfTenLoop(5)); // Output: 100000
        System.out.println(getPowerOfTenLoop(3)); // Output: 1000
        System.out.println(getPowerOfTenLoop(2)); // Output: 100
    }
}
