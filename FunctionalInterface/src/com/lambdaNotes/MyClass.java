package com.lambdaNotes;

public class MyClass {
    public static void main(String[] args) {
//        System.out.println("Hello World");

//        Employee employee = new Engineer();

        // we don't need this Engineer class to implement the interface Employee
        // we can use lambda expression to implement the interface Employee

        Employee engineer = () -> "Engineer";
        System.out.println(engineer.getName());
    }
}
