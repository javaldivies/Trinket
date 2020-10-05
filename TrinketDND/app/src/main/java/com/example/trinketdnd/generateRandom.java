package com.example.trinketdnd;

import java.util.Random;

public class generateRandom{
    public int random(int min, int max) {
        assert max > min : "Random's max is greater than min";
        Random rand = new Random();
        boolean done = false;
        int tempNumber = rand.nextInt(max + 1);
        while (!done) {
            if (tempNumber >= min) {
                done = true;
            } else {
                tempNumber = rand.nextInt(max + 1);
            }
        }
        return tempNumber;
    }
}
