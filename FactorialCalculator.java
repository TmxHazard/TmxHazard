import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the 1st number:");
        System.out.println("enter the 2nd number:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        long factorial1 = calculateFactorial(num1);
        long factorial2 = calculateFactorial(num2);
        System.out.println("Factorial of " + num1 + ":"+ factorial1);
        System.out.println("Factorial of " + num2 + ":" + factorial2);
        scanner.close();
    }
    private static long calculateFactorial(int n) {
        if(n<0) {
            return -1; // factorial is not defined for -ve numbers
        }
        long factorial = 1;
        for (int i=1;i<=n;i++) {
            factorial*=i;
        }
        return factorial;
    }
}
