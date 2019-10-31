import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();
        items.add("red");
        items.add(0, "yellow");

        System.out.println("Display list contents with counter-controlled loop: ");
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%s%n", items.get(i));
        }

        display(items, "%nDisplay list contents with enhanced for statement:");

        items.add("green");
        items.add("yellow");
        display(items, "List with two new elements:");
    }

    static void display(ArrayList<String> items, String header) {
        System.out.printf(header);
        for (String item : items)
            System.out.printf("%s%n", item);

        System.out.println();
    }
}