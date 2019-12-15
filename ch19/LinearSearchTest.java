import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchTest {
    public static int linearSearch(int[] data, int searchKey) {
        for (int index = 0; index < data.length; ++index)
            if (data[index] == searchKey)
                return index;

        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();

        int[] data = new int[10];
        for (int i = 0; i < data.length; ++i)
            data[i] = 10 + generator.nextInt(90);

        System.out.printf("%s%n%n", Arrays.toString(data));

        System.out.print("Please enter an integer value (-1 to quit): ");
        int searchInt = input.nextInt();

        while (searchInt != -1) {
            int pos = linearSearch(data, searchInt);

            if (pos == -1)
                System.out.printf("%d was not found!%n%n", searchInt);
            else
                System.out.printf("%d found! Position: %d%n%n", searchInt, pos);

            System.out.print("Please enter an integer value (-1 to quit): ");
            searchInt = input.nextInt();
        }

        input.close();
    }
}