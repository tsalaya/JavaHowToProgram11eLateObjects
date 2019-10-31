import java.util.Arrays;

public class ArrayManipulations {
    public static void main(String[] args) {
        double[] doubleArray = { 1.1, 2, 3.4, 2.18, 3.14, 9.8 };
        double[] sortedArray = Arrays.copyOf(doubleArray, doubleArray.length);
        Arrays.sort(sortedArray);
        printArray(doubleArray, "original");
        printArray(sortedArray, "sorted");

        double[] filledArray = new double[10];
        Arrays.fill(filledArray, 7);
        printArray(filledArray, "filled");

        boolean isArraysEqual = Arrays.equals(doubleArray, sortedArray);
        System.out.printf("doubleArray %s sortedArray", (isArraysEqual == true ? "==" : "!="));

        System.out.println();
    }

    static void printArray(double[] arr, String type) {
        System.out.printf("The %s array: ", type);
        for (double num : arr)
            System.out.printf("%7.2f", num);
        System.out.println();
    }
}