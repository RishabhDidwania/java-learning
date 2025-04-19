package com.learning.interfaceNotes.interfaceStaticMethod;

interface A{
    static void sayHello(){
        System.out.println("Hello World, A");
    }
}

public class MyMain implements A{
    public static void main(String[] args){
//        MyClass.sayHello();// This will throw an error as we cannot call a static method from an instance

        A.sayHello();
    }
}
