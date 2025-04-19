package com.learning.threads;

public class OddEven {
    static  int  counter = 0;
    public static void main(String[] args){
//        final int[] counter = {0};
        int limit = 10000;
        Object lock = new Object();

        Thread even = new Thread(()->{
            while(counter <=limit){
                synchronized (lock){
                    if(counter %2==0){
                        System.out.println("Printing " + Thread.currentThread().getName() + "  Count " + counter);
                        counter++;
                        lock.notify();
                    }else{
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
                        }
                    }
                }

            }
        });
        even.setName("even");

        Thread odd = new Thread(
                ()->{
                    while(counter <=limit){
                        synchronized(lock){
                            if(counter %2!=0){
                                System.out.println("Printing  " + Thread.currentThread().getName() + "  Count  " + counter);
                                counter++;
                                lock.notify();
                            }else {
                                try {
                                    lock.wait();
                                } catch (InterruptedException e) {
//                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                }
        );
        odd.setName("odd");

        even.start();
        odd.start();
    }

}
