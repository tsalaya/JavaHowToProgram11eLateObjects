import java.util.Arrays;

public class VarargsTest {
    public static void main(String[] args) {
        double[] numbers = { 1.2, 3.3, 4.5, 6.7, 7.7 };
        printArray(numbers);

        // just take a portion of the array instead of all to test varargs ("double..."
        // notion)
        double[] small_arr = Arrays.copyOfRange(numbers, 1, 3);
        printArray(small_arr);
    }

    static double average(double... numbers) {
        double total = 0;
        for (double num : numbers)
            total += num;
        return total / numbers.length;
    }

    static void printArray(double[] arr) {
        System.out.println("--");
        System.out.print("The array is: ");
        for (double num : arr)
            System.out.printf("%7.2f", num);
        System.out.println();
        System.out.printf("The average number of that array is %.2f%n", average(arr));
    }
}