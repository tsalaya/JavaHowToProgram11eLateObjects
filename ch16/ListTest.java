import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        String[] colors = { "black", "blue", "white", "red", "violet" };

        List<String> list1 = new LinkedList<>();

        for (String color : colors)
            list1.add(color);

        String[] colors2 = { "gold", "silver", "white", "gray", "violet" };

        List<String> list2 = new LinkedList<>();

        for (String color : colors2)
            list2.add(color);

        list1.addAll(list2);

        list2 = null;
        printList(list1);

        convertToUppercaseStrings(list1);
        printList(list1);

        System.out.printf("%nDeleting elements from 4 to 6...");
        removeItems(list1, 4, 7);
        printList(list1);

        printReversedList(list1);
    }

    private static void printList(List<String> list) {
        System.out.printf("%nlist:%n");
        for (String color : list)
            System.out.printf("%s ", color);

        System.out.println();
    }

    private static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> iter = list.listIterator();

        while (iter.hasNext()) {
            String color = iter.next();
            iter.set(color.toUpperCase());
        }
    }

    private static void removeItems(List<String> list, int start, int end) {
        list.subList(start, end).clear();
    }

    private static void printReversedList(List<String> list) {
        ListIterator<String> iter = list.listIterator(list.size());

        while (iter.hasPrevious()) {
            System.out.printf("%s ", iter.previous());
        }

        System.out.println();
    }
}