package com.learning.lambdaNotes.annonymoudinnerclass;

public class Engineer implements Employee{

    @Override
    public void getName(){
        System.out.println("Inside getName() method");
    }

    public void getSalary(){
        System.out.println("Inside salary method");
    }
}
