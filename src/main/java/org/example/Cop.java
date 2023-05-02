package org.example;//package org.example;
//public class Cop extends Thread {
//
//    private String name;
//    private int time = 10;
//
//    public Cop(String name, int time) {
//        super(name);
//        this.time = time;
//    }
//
//    @Override
//    public void run() {
//        this.countdown();
//
//        for (int i = time; i >= 0; i--) {
//
//        }
//        try {
//            Cop.sleep(1);
//        } catch (InterruptedException e) {
//
//        }
//        System.out.println("BUSTED");
//        System.exit(1);
//    }
//
//    public void countdown() {
//        int countdown = 10;
//        while (countdown > 0) {
//            System.out.println(countdown);
//            try {
//                countdown--;
//                Thread.sleep(1000L);
//            } catch (InterruptedException e) {
//
//            }
//        }
//    }
//}
