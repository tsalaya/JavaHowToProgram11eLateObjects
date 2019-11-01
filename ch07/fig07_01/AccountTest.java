import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the acc's name: ");
        String name = input.nextLine();

        Account acc = new Account();
        acc.setName(name);
        System.out.printf("Account acc has the name: %s%n", acc.getName());

        System.out.println("Initialize an account using constructor!");
        Account acc1 = new Account("Donald Trump", 1000000.0);
        System.out.printf("Account acc1 has the name: %s, and the balance of %.2f before depositing!%n", acc1.getName(),
                acc1.getBalance());
        acc1.deposit(5000);
        System.out.printf("Account acc1 has the balance of %.2f after depositing!%n", acc1.getBalance());

        input.close();
    }
}