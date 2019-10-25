import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 double numbers, separated by space: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double result = maximum(num1, num2, num3);
        System.out.printf("Maximum number is %f%n", result);

        input.close();
    }

    public static double maximum(double n1, double n2, double n3) {
        double max_num = n1;
        if (n2 > max_num)
            max_num = n2;
        if (n3 > max_num)
            max_num = n3;
        return max_num;
    }
}