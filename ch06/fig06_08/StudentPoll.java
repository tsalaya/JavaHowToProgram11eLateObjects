public class StudentPoll {
    public static void main(String[] args) {
        int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };
        int[] frequency = new int[6];
        for (int answer = 0; answer < responses.length; answer++) {
            try {
                ++frequency[responses[answer]];
            }
            catch (java.lang.ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception found: " + e.getMessage());
            }
        }
        System.out.printf("%s%8s%n", "Rating", "Frequency");
        for (int counter = 0; counter < frequency.length; counter++) {
            System.out.printf("%5d%8d%n", counter, frequency[counter]);
        }
    }
}