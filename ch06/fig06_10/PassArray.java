public class PassArray {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 7, 8, 12, 17 };
        int total = getTotal(arr);
        System.out.printf("Total of the array is %d%n", total);

        modifyArray(arr);
        System.out.println("The array after modification is:");
        for (int number : arr) {
            System.out.printf("%4d%n", number);
        }
    }

    static int getTotal(int[] array) {
        int total = 0;
        for (int number : array)
            total += number;

        return total;
    }

    static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }
}