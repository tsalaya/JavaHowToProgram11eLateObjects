import java.util.Scanner;

public class CalculateStringPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int total = calculateStringPointRepetitive(str);
        int total1 = calculateStringPointRecursive(str);
        int total2 = calculateStringPointRecursive2(str);

        System.out.printf("Total is %d (repetitive)%n", total);
        System.out.printf("Total is %d (recursive)%n", total1);
        System.out.printf("Total is %d (recursive)%n", total2);

        input.close();
    }

    public static int calculateStringPointRecursive(String s) {
        if (s.length() == 1)
            return (int) s.toCharArray()[0] - 96;
        else
            return calculateStringPointRecursive(s.substring(0, 1))
                    + calculateStringPointRecursive(s.substring(1, s.length()));
    }

    public static int calculateStringPointRecursive2(String s) {
        if (s.length() == 1)
            return (int) s.toCharArray()[0] - 96;
        else
            return (int) s.toCharArray()[0] - 96 + calculateStringPointRecursive(s.substring(1, s.length()));
    }

    public static int calculateStringPointRepetitive(String s) {
        int total = 0;
        for (char c : s.toCharArray()) {
            total += (int) c - 96;
        }
        return total;
    }
}