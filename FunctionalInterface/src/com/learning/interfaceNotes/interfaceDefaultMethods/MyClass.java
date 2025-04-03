package com.learning.interfaceNotes.interfaceDefaultMethods;

interface A{
    default void sayYourName(){
        System.out.println("Hello World, A");
    }
}

interface B{
    default void sayYourName(){
        System.out.println("Hello World, B");
    }
}



public class MyClass implements A,B{
    public static void main(String[] args){
        System.out.println(":Main method");

        //Trying to create ambiguity
        MyClass cObj = new MyClass();
        cObj.sayYourName();
        //    cObj.sayYourName(); // does not know here which function to call

        // To resolve the ambiguity we will have to override the method
    }

    @Override
    public void sayYourName(){
//        System.out.println("Hello World, MyClass", );
//        A.super.sayYourName();
        B.super.sayYourName();
    }


}
