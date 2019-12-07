public class FibonacciCalculator {
    public static void main(String[] args) {
        for (int counter = 0; counter <= 20; ++counter)
            System.out.printf("Fibonacci of %d is: %d%n", counter, fibonacci(counter));
    }

    public static long fibonacci(long number) {
        if (number <= 0)
            return 0;
        if (number == 1)
            return 1;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
}