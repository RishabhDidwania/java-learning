package com.learning.lambdaNotes.threads;

public class MyClass implements Runnable{

    @Override
    public void run(){
        System.out.println("Run Method");
    }

    public static void main(String[] args) {
        System.out.println("From main method");

        Thread thread1 = new Thread(new MyClass());
        thread1.run();


        // can the above be achieved using functional interface, as Runnable is a functional interface

        Runnable runnable = () -> System.out.println("Lambda Run Method");
        Thread thread2 = new Thread(runnable, "thread2");
        thread2.run();
    }
}