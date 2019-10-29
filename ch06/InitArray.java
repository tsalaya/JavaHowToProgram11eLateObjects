
public class InitArray {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Error, please specify 3 arguments: array length, initial value, increment");
            return;
        }

        final int ARRAY_LENGTH = Integer.parseInt(args[0]);
        int[] array = new int[ARRAY_LENGTH];
        array[0] = Integer.parseInt(args[1]);
        int increment = Integer.parseInt(args[2]);

        // skip the first element, since it's the args[1] we mentioned above
        for (int counter = 1; counter < array.length; counter++)
            array[counter] = array[0] + increment * counter;

        System.out.printf("%s%8s%n", "Index", "Value");
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}