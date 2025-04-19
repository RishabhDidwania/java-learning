package com.learning.adhodquestion;


import java.util.Arrays;

class Parent {

    public void run() {
        System.out.println("Parent Run");
        walk();
    }

    public void walk() {
        System.out.println("Parent Walk");
    }
}
class Child extends Parent {
    @java.lang.Override
    public void run() {
        System.out.println("Child Run");
        super.run();
    }

    @java.lang.Override
    public void walk() {
        System.out.println("Child Walk");
        super.walk();
    }
}
public class MyMain {
    public static void main(String[] args) {
        Parent p = new Child();
        p.run();
    }
}


/*
* o/p:
* Child Run
* Parent Run
* Child Walk
* Parent Walk
*
* */