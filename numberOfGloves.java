package LastGroupAssignmentGroup;

public class numberOfGloves {
    public static int numberOfGloves(int people) {
        if (people == 0) {
            return 0; // Base case: no people, no gloves
        }
        return 3 + numberOfGloves(people - 1); // Recursive case: add 3 gloves for each person
    }

    // Main method to test the numberOfGloves method
    public static void main(String[] args) {
        // Test the numberOfGloves method
        System.out.println(numberOfGloves(0)); // Output: 0
        System.out.println(numberOfGloves(1)); // Output: 3
        System.out.println(numberOfGloves(3)); // Output: 9
        System.out.println(numberOfGloves(5)); // Output: 15
        System.out.println(numberOfGloves(10)); // Output: 30
    }
}
