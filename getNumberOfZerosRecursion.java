package LastGroupAssignmentGroup;

public class getNumberOfZerosRecursion {
    public static int getNumberOfZerosRecursion(int number) {
        if (number == 0) {
            return 0; // Base case: no digits left to process
        }
        // Check if the last digit is zero
        int count = (number % 10 == 0) ? 1 : 0;
        // Recur with the rest of the digits
        return count + getNumberOfZerosRecursion(number / 10);
    }

    // Main method to test the getNumberOfZerosRecursion method
    public static void main(String[] args) {
        // Test the getNumberOfZerosRecursion method
        System.out.println(getNumberOfZerosRecursion(2030));   // Output: 2
        System.out.println(getNumberOfZerosRecursion(200030)); // Output: 4
        System.out.println(getNumberOfZerosRecursion(1204));   // Output: 1
        System.out.println(getNumberOfZerosRecursion(0));      // Output: 0 (edge case)
    }
}
