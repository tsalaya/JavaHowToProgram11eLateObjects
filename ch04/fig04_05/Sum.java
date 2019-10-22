public class Sum {
    public static void main(String[] args) {
        int total = 0;
        for (int number = 0; number <= 20; number += 2) {
            total += number;
        }

        System.out.printf("%d%n", total);
    }
}