import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class ManipulateSequentialFile {
    private static ObjectOutputStream output;
    private static ObjectInputStream input;

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.printf("Usage: java ManipulateSequentialFile <option>%n%n%s%n%s%n%s%n", "Valid options are:",
                    "-r\tread", "-w\twrite");
            return;
        }
        if (args[0].equals("-r")) {
            openFile(true);
            readRecords();
            closeFile(true);
        } else if (args[0].equals("-w")) {
            openFile(false);
            addRecords();
            closeFile(false);
        }
    }

    public static void openFile(boolean isRead) {
        try {
            if (isRead) {
                input = new ObjectInputStream(Files.newInputStream(Paths.get("client.ser")));
            } else {
                output = new ObjectOutputStream(Files.newOutputStream(Paths.get("client.ser")));
            }
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    public static void closeFile(boolean isRead) {
        try {
            if (isRead) {
                if (input != null)
                    input.close();
            } else {
                if (output != null)
                    output.close();
            }
        } catch (IOException ioException) {
            System.err.println("Error closing file. Terminating.");
            System.exit(1);
        }
    }

    public static void addRecords() {
        String[] names = { "John Lennon", "Paul Mc.Cartney", "George Harrison", "Ringo Starr" };

        Random random = new Random();

        for (int i = 0; i < 4; ++i) {
            String firstName = names[i].split(" ")[0];
            String lastName = names[i].split(" ")[1];
            try {
                Account record = new Account(i, firstName, lastName, random.nextDouble() * (100 - 10 + 1));

                output.writeObject(record);
            } catch (IOException ioException) {
                System.err.println("Error writing to file. Terminating.");
            }
        }
    }

    public static void readRecords() {
        try {
            while (true) {
                Account record = (Account) input.readObject();
                System.out.printf("%-10d%-12s%-12s%10.2f%n", record.getAccount(), record.getFirstName(),
                        record.getLastName(), record.getBalance());
            }
        } catch (EOFException eofException) {
            System.out.printf("%nNo more records%n");
        } catch (IOException ioException) {
            System.err.println("Error reading from file. Terminating.");
        } catch (ClassNotFoundException classNotFoundException) {
            System.err.println("Invalid object type. Terminating.");
        }
    }
}