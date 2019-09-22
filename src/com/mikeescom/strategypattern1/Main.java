package com.mikeescom.strategypattern1;

import com.mikeescom.strategypattern1.controller.ScoreBoard;
import com.mikeescom.strategypattern1.model.Balloon;
import com.mikeescom.strategypattern1.model.Clown;
import com.mikeescom.strategypattern1.model.SquareBalloon;

public class Main {

    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.print("Balloon Tap Score:");
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.print("Clown Tap Score:");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.print("Square Balloon Tap Score:");
        scoreBoard.algorithmBase = new SquareBalloon();
        scoreBoard.showScore(10, 5);
    }
}
