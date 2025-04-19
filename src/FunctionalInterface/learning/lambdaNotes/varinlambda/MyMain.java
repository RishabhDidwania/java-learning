package com.learning.lambdaNotes.varinlambda;


import com.learning.interfaceNotes.functionalInterface2.Employee;

public class MyMain {
    void doSomething(){
        int a = 5;
        Employee e = () ->{
//            a =5; // Local variable used in lambda expression should be final or effectively final,
            return "Rishabh";
        };
    }
}
