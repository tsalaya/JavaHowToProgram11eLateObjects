import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double amount;
        double principal = 1000.0;
        double rate = 0.05;
        int num_of_years;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of years: ");
        num_of_years = input.nextInt();

        for (int year = 1; year <= num_of_years; year++) {
            amount = principal * Math.pow(1.0 + rate, year);

            System.out.printf("%4d%, 20.2f%n", year, amount);
        }

        input.close();
    }
}