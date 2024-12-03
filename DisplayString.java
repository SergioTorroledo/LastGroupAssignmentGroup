package LastGroupAssignmentGroup;


    public class DisplayString {

        // Method to display a String value n times using recursion
        public static String displayString(String str, int n) {
            if (n <= 0) {
                return ""; // Base case: if n is 0 or less, return an empty string
            }
            return str + displayString(str, n - 1); // Concatenate the string recursively
        }

        // Example CodingBat recursion method: factorial (recursion)
        public static int factorial(int n) {
            if (n == 0) {
                return 1; // Base case: factorial of 0 is 1
            }
            return n * factorial(n - 1); // Recursive case
        }

        // Example CodingBat method: factorial using loop
        public static int factorialLoop(int n) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i; // Multiply iteratively
            }
            return result;
        }

        // Additional methods from CodingBat can be added here.
        // Please list any specific CodingBat methods you'd like included.

        // Main method to test the functionality
        public static void main(String[] args) {
            // Test the displayString method
            System.out.println(displayString("#", 3));  // Output: ###
            System.out.println(displayString("&", 5)); // Output: &&&&&
            System.out.println(displayString("Hello", 7)); // Output: HelloHelloHelloHelloHelloHelloHello

            // Test factorial methods
            System.out.println("Factorial (Recursion) of 5: " + factorial(5)); // Output: 120
            System.out.println("Factorial (Loop) of 5: " + factorialLoop(5)); // Output: 120
        }
    }

