import java.security.SecureRandom;

public class Craps {
    private enum Status {
        CONTINUE, WON, LOST
    };

    private static final SecureRandom randomNumbers = new SecureRandom();

    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();
        switch (sumOfDice) {
        case 7:
        case 11:
            gameStatus = Status.WON;
            break;
        case 2:
        case 3:
        case 12:
            gameStatus = Status.LOST;
            break;
        default:
            gameStatus = Status.CONTINUE;
            myPoint = sumOfDice;
            System.out.printf("Point is %d%n", myPoint);
            break;
        }

        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();
            if (sumOfDice == myPoint)
                gameStatus = Status.WON;
            else if (sumOfDice == 7)
                gameStatus = Status.LOST;
        }

        if (gameStatus == Status.WON)
            System.out.println("Player wins!");
        else
            System.out.println("Player loses!");
    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum;
    }
}