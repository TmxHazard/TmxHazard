import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 5 numbers
        System.out.println("Enter five numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        // Calculate and display the sum
        int sum = calculateSum(num1, num2, num3, num4, num5);
        System.out.println("Sum of the numbers: " + sum);

        scanner.close();
    }

    // Function to calculate the sum
    private static int calculateSum(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }
}
