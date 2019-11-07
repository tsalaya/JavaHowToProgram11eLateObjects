public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04,
                300);

        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s: %n%n%s%n", "Updated information obtained by toString()", employee);

        System.out.println("--- Class using inheritance");

        BasePlusCommissionEmployee1 employee1 = new BasePlusCommissionEmployee1("Bob", "Lewis", "333-33-3333", 5000, .04,
                300);

        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s: %n%n%s%n", "Updated information obtained by toString()", employee1);
    }
}