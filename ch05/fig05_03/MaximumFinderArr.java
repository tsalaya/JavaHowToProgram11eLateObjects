import java.util.Scanner;

public class MaximumFinderArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int arr_length = input.nextInt();

        System.out.print("Enter min and max value, separated by space: ");
        int min = input.nextInt();
        int max = input.nextInt();

        double[] nums = new double[arr_length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = getRandomIntegerBetweenRange(min, max);
        }

        double result = maximum(nums);
        System.out.println("-- The array is: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.printf("-- Maximum number is %f%n", result);

        input.close();
    }

    public static double maximum(double[] nums) {
        double max_num = nums[0];
        for (int i = 1; i < nums.length; i++) { // starting from 1, since we already assigned max_num to nums[0]
            if (max_num < nums[i])
                max_num = nums[i];
        }
        return max_num;
    }

    public static double getRandomIntegerBetweenRange(double min, double max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
}