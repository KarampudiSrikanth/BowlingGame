package test;

import java.util.Scanner;

public class BowlingGame {

	private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll] = pins;
        currentRoll++;
    }

    public int score() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(frameIndex)) {
                score += 10 + strikeBonus(frameIndex);
                frameIndex++;
            } else if (isSpare(frameIndex)) {
                score += 10 + spareBonus(frameIndex);
                frameIndex += 2;
            } else {
                score += sumOfBallsInFrame(frameIndex);
                frameIndex += 2;
            }
        }
        return score;
    }

    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }

    private boolean isSpare(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }

    private int strikeBonus(int frameIndex) {
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    private int spareBonus(int frameIndex) {
        return rolls[frameIndex + 2];
    }

    private int sumOfBallsInFrame(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }

    public static void main(String[] args) {
        BowlingGame game = new BowlingGame();
        Scanner scanner = new Scanner(System.in);

        for (int frame = 0; frame < 10; frame++) {
            System.out.print("Enter the number of pins knocked down in frame " + (frame + 1) + ": ");
            int pins = scanner.nextInt();
            game.roll(pins);
            if (pins == 10) {
                System.out.println("Strike!");
            } else {
                System.out.print("Enter the number of pins knocked down in the second roll of frame " + (frame + 1) + ": ");
                pins = scanner.nextInt();
                game.roll(pins);
                if (game.isSpare(game.currentRoll - 2)) {
                    System.out.println("Spare!");
                }
            }
        }

        int score = game.score();
        System.out.println("Your final score is: " + score);
    }
}
