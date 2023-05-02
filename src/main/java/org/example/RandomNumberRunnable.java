package org.example;


import java.util.Random;

public class RandomNumberRunnable implements Runnable {
    private int number;

    public int getNumber() {
        return number;
    }

    @Override
    public void run() {
        Random random = new Random();
        number = random.nextInt(100000) + 1;
        System.out.println("the safe code is: " + number);

    }
}
