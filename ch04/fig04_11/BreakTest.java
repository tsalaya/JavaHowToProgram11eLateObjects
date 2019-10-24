// import java.util.Scanner;

public class BreakTest {
    public static void main(String[] args) {
        int count = 1;
        for (; count <= 10; count++) {
            if (count == 5)
                break;
            System.out.printf("%d%n", count);
        }
        System.out.printf("%nBroke out of loop at count = %d%n", count);
    }
}