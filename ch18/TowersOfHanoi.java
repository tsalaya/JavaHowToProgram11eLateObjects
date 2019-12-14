public class TowersOfHanoi {

    static int callCount = 0;

    public static void solveTowers(int disks, int sourcePeg, int destinationPeg, int tempPeg) {
        // increase the callCount
        callCount += 1;

        // base case - only one disk to move
        if (disks == 1) {
            System.out.printf("%d -> %d%n", sourcePeg, destinationPeg);
            return;
        }

        // recursion: move (disks - 1) disks from sourcePeg to tempPeg, using
        // destinationPeg as temporary holder
        solveTowers(disks - 1, sourcePeg, tempPeg, destinationPeg);

        // move the last disk from sourcePeg to destinationPeg, without using holder
        System.out.printf("%d -> %d%n", sourcePeg, destinationPeg);

        // recursion: move (disks - 1) disks from tempPeg to destinationPeg, using
        // sourcePeg as temporary holder
        solveTowers(disks - 1, tempPeg, destinationPeg, sourcePeg);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java TowersOfHanoi <number of disks>");
            return;
        }
        int startPeg = 1;
        int endPeg = 3;
        int tempPeg = 2;
        // int totalDisks = 4;
        final int TOTAL_DISKS = Integer.parseInt(args[0]);

        solveTowers(TOTAL_DISKS, startPeg, endPeg, tempPeg);

        System.out.printf("Total times called: %d%n", callCount);
    }
}