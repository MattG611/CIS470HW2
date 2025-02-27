public class GallonsToLiters {

    // Function to convert gallons to liters
    public static double convert(double gallons) {
        if (gallons <= 0) {
            throw new IllegalArgumentException("Invalid input: Gallons per week must be greater than zero.");
        }
        return gallons * 3.78541; // 1 gallon = 3.78541 liters
    }

    // Main method to test the function
    public static void main(String[] args) {
        double gallons = 10.0;
        System.out.println(gallons + " gallons is equal to " + convert(gallons) + " liters.");
    }
}
