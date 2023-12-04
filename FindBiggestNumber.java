import java.util.Scanner;
public class FindBiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the +ve number:");
        int num1 = scanner.nextInt();
        System.out.println("enter the +ve number:");
        int num2 = scanner.nextInt();
        int result = findbiggestnumber( num1, num2);
        System.out.println("biggest of two numbers is:" + result);
        scanner.close();
    }
    private static int findbiggestnumber(int a,int b) {
        return Math.max(a, b);

    }
}
