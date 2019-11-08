public class PolymorphismTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
        System.out.printf("%s %s: %n%n%s%n%n", "Call CommissionEmployee's toString() with superclass reference",
                "to superclass object", employee.toString());

        BasePlusCommissionEmployee1 employee1 = new BasePlusCommissionEmployee1("Bob", "Lewis", "333-33-3333", 5000,
                .04, 300);
        System.out.printf("%s %s: %n%n%s%n%n", "Call BasePlusCommissionEmployee1's toString() with subclass reference",
                "reference to subclass object", employee1.toString());

        CommissionEmployee employee2 = employee1;
        System.out.printf("%s %s: %n%n%s%n%n",
                "Call BasePlusCommissionEmployee1's toString() with superclass reference",
                "reference to subclass object", employee2.toString());
    }
}