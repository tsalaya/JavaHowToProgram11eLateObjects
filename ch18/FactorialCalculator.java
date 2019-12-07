import java.math.BigInteger;

public class FactorialCalculator {
    public static void main(String[] args) {
        boolean useBigInteger = (args[0].equals("1")) ? true : false;
        for (int counter = 0; counter <= 21; ++counter) {
            if (useBigInteger == false)
                System.out.printf("%d! = %d%n", counter, factorial(counter));
            else
                System.out.printf("%d! = %d%n", counter, factorial(BigInteger.valueOf(counter)));
        }
    }

    public static long factorial(long number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }

    public static BigInteger factorial(BigInteger number) {
        if (number.compareTo(BigInteger.ONE) <= 0)
            return BigInteger.ONE;
        else
            return number.multiply(factorial(number.subtract(BigInteger.ONE)));
    }
}