import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");

        // Read the radius from the user
        float radius = scanner.nextFloat();

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Check if the radius is positive
        if (radius <= 0) {
            System.out.println("Please enter a positive radius.");
        } else {
            // Calculate the area of the circle
            double area = Math.PI * Math.pow(radius, 2);

            // Display the result
            System.out.println("The area of the circle with radius " + radius + " is: " + area);
        }
    }
}

