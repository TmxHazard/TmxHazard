import java.util.Arrays;
import java.util.Random;

public class GenerateArrays {
    public static void main(String[] args) {
        int n = 10; // Change this to the desired number of arrays

        for (int i = 1; i <= n; i++) {
            int[] array = generateRandomArray(10, 2, 100); // Change 10 to the desired array size and 1, 100 to the desired range of integers
            System.out.println("Array " + i + ": " + Arrays.toString(array));
        }
    }

    private static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }
}

