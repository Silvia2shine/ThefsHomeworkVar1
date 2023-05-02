package org.example;

public class Police extends Thread {

    @Override
    public void run() {
        int index = 10;
        while (index > 0) {
            System.out.println("The Police is at number: " + index);
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            index--;

        }
        System.out.println("Police has caught the thieves!");
        System.exit(0);
    }
}



