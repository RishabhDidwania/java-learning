package com.interfaceNotes.functionalInterface1;

/*
* FunctionalInterface annotation is used to ensure that the interface has only one abstract method.
* It is for the compiler to interpret that this is a functional interface, even without this annotation if the Interface has only one abstract method
* then also it would be a functional interface.
*
*
* This annotation is for the compiler to apply hard constraints on the interface t ensure no additional abstract methods are added to the interface.
*
* */
@FunctionalInterface
public interface MyFinctionalInterface {
    public void sayYourName();
//    public void sayYourAge(); // with this compiler was giving an error, Multiple non-overriding abstract methods found in interface FunctionalInterface1.MyFinctionalInterface
}
