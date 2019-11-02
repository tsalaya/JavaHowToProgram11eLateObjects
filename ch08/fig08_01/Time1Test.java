public class Time1Test {
    public static void main(String[] args) {
        // System.out.println("Test INVALID params:");
        Time1 time1 = new Time1(10, 17, 23);
        displayTime(time1);
        // System.out.println("Test VALID params:");
        Time1 time2 = new Time1(23, 7, 23);
        displayTime(time2);
        Time1 time3 = new Time1(13, 17, 23);
        displayTime(time3);
    }

    static void displayTime(Time1 t) {
        System.out.printf("Time value (UTC) is %s%n", t.toUniversalString());
        System.out.printf("Time value (AM/PM) is %s%n", t.toString());
    }
}