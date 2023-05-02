package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {

        int safeCode = 0;

        RandomNumberRunnable randomNumberRunnable = new RandomNumberRunnable();
        Thread thread = new Thread(randomNumberRunnable);

        thread.start();
        thread.join();
        safeCode = randomNumberRunnable.getNumber();



        Theft theft1 = new Theft("Theft1", 1, 2500, safeCode);
        Theft theft2 = new Theft("Theft2", 2501 , 5000, safeCode);
        Theft theft3 = new Theft("Theft3", 5001, 7500, safeCode);
        Theft theft4 = new Theft("Theft4", 7501, 10000, safeCode);

        theft1.start();
        theft2.start();
        theft3.start();
        theft4.start();

        Police police = new Police();
        police.run();


    }
}
