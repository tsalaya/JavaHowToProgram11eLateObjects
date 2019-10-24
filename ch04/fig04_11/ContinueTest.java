// import java.util.Scanner;

public class ContinueTest {
    public static void main(String[] args) {
        int count = 1;
        for (; count <= 10; count++) {
            if (count == 5)
                continue;
            System.out.printf("%d%n", count);
        }
        System.out.printf("%nUsed continue to skip printing 5%n");
    }
}