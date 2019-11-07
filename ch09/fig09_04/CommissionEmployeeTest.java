public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);

        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s: %n%n%s%n", "Updated information obtained by toString()", employee);
    }
}