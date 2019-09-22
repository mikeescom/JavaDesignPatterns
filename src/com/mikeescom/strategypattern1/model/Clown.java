package com.mikeescom.strategypattern1.model;

import com.mikeescom.strategypattern1.controller.ScoreAlgorithmBase;

public class Clown extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 10;
    }
}
