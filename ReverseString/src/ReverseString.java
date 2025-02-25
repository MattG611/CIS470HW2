public class ReverseString {

    // Function to reverse the string
    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Invalid input: String cannot be null or empty.");
        }
        return new StringBuilder(input).reverse().toString();
    }

    // Main method to test the function
    public static void main(String[] args) {
        String input = "Hello, World!";
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reverse(input));
    }
}
