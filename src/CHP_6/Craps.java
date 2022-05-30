package CHP_6;

import java.security.SecureRandom;

public class Craps {


    private static final SecureRandom randomNumbers = new SecureRandom();

    // enum type with constants that represent the game status
    private enum Status {CONTINUE, WON, LOST}

    ;
    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    // plays one game of craps
    public static void main(String[] args) {
        int myPoint = 0; // point if no win or loss on first roll
        Status gameStatus; // can contain CONTINUE, WON or LOST
           int sumOfDice = rollDice(); // first roll of the dice
// determine game status and point based on first roll
        switch (sumOfDice) {
            case SEVEN: // win with 7 on first roll
            case YO_LEVEN: // win with 11 on first roll
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: // lose with 2 on first roll
            case TREY: // lose with 3 on first roll
            case BOX_CARS: // lose with 12 on first roll
                gameStatus = Status.LOST;
                break;
            default: // did not win or lose, so remember point
                gameStatus = Status.CONTINUE; // game is not over
                myPoint = sumOfDice; // remember the point
                System.out.printf("Point is %d%n", myPoint);
                break;
        }
// while game is not complete
        while (gameStatus == Status.CONTINUE)  // not WON or LOST
            sumOfDice = rollDice(); // roll dice again
// determine game status
        if (sumOfDice == myPoint) { // win by making point
            gameStatus = Status.WON;
        } else {
            if (sumOfDice == SEVEN) { // lose by rolling 7 before point
                gameStatus = Status.LOST;
            }
        }

        // display won or lost message
        if (gameStatus == Status.WON) {
            System.out.println("Player wins");
        } else {
            System.out.println("Player loses");
        }


//        () {
//            int dice1 = 1 + randomNumbers.nextInt(6); // first die roll
//            int dice2 = 1 + randomNumbers.nextInt(6); // second die roll
//            int sum = dice1 + dice2; // sum of die values
//// display results of this roll
//            System.out.printf("Player rolled %d + %d = %d%n", dice1, dice2, sum);
//            return sum;
//        }
    }

    private static int rollDice() {
        int dice1 =     1 + randomNumbers.nextInt(6);
        int dice2 =     1 + randomNumbers.nextInt(6);
        int sum = dice1 + dice2;
        System.out.printf("Player rolled %d + %d = %d%n", dice1, dice2, sum);
        return sum;

    }
}

