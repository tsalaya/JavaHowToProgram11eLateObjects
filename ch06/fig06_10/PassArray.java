public class PassArray {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 7, 8, 12, 17 };
        int total = getTotal(arr);
        System.out.printf("Total of the array is %d%n", total);
    }

    static int getTotal(int[] array) {
        int total = 0;
        for (int number : array)
            total += number;

        return total;
    }
}