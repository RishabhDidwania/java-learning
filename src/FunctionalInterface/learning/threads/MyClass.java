package com.learning.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MyClass {


     public static void main(String[] args) throws InterruptedException {
         SharedResources sr = new SharedResources();
            Thread produce = new Thread(()->{
               try{
                   sr.producer();
               }catch(Exception e){

               }
            });
            Thread consume = new Thread(()->{
                 try{
                     sr.consumer();
                 }catch(Exception e){

                 }}
            );

            produce.start();
            consume.start();
            Thread.yield();

//         produce.join();
//         consume.join();
     }
}

class SharedResources{
    List<Integer> res = new ArrayList<>();
    int max = 20;
    int counter = 1;


    synchronized void producer() throws InterruptedException {
        while(counter<=20){
            if( counter < max){
                System.out.println("Inside producer");
                int val = (counter);
                res.add(val);
                System.out.println("Added: "+val);
                notify();
            }else{wait();}
            counter++;
        }
    }


    synchronized void consumer() throws InterruptedException {
        while(true){
            if(counter>0){
                System.out.println("Inside consumer");
                System.out.println("Removing: "+res.get(0));
                res.remove(0);
                notify();
                counter--
                        ;
            }else{wait();}
        }
    }
}
