package org.example;

class Theft extends Thread {
    private int start;
    private int end;
    private int step;
    private int safeCode;

    public Theft(String name, int start, int end, int safeCode) {
        super(name);
        this.start = start;
        this.end = end;
        this.safeCode= safeCode;

    }


    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(getName() + ", we are at number: " + i);

            try {
                sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i == safeCode){
                System.out.println("The theft: " + getName() + " - has find the safe code.");
                System.exit(0);
            }
        }
    }
}