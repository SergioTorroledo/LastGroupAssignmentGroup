package LastGroupAssignmentGroup;

public class numberOfGloves2 {
    public static int numberOfGloves2(int people) {
        return people * 3; // Each person has 3 hands, so multiply by 3
    }

    // Main method to test the numberOfGloves method
    public static void main(String[] args) {
        // Test the numberOfGloves method
        System.out.println(numberOfGloves2(0)); // Output: 0
        System.out.println(numberOfGloves2(1)); // Output: 3
        System.out.println(numberOfGloves2(3)); // Output: 9
        System.out.println(numberOfGloves2(5)); // Output: 15
        System.out.println(numberOfGloves2(10)); // Output: 30
    }
}
