package LastGroupAssignmentGroup;

public class getNumberOfZerosLoop {
    public static int getNumberOfZerosLoop(int number) {
        int count = 0; // Initialize the zero count to 0
        while (number != 0) {
            if (number % 10 == 0) { // Check if the last digit is zero
                count++;
            }
            number /= 10; // Remove the last digit
        }
        return count;
    }

    // Main method to test the getNumberOfZerosLoop method
    public static void main(String[] args) {
        // Test the getNumberOfZerosLoop method
        System.out.println(getNumberOfZerosLoop(2030));   // Output: 2
        System.out.println(getNumberOfZerosLoop(200030)); // Output: 4
        System.out.println(getNumberOfZerosLoop(1204));   // Output: 1
        System.out.println(getNumberOfZerosLoop(0));      // Output: 1 (edge case, 0 has one zero)
    }
}
