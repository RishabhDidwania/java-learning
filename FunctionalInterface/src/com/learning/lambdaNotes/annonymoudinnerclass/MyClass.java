package com.learning.lambdaNotes.annonymoudinnerclass;

public class MyClass {

    public static void main(String[] args) {
        Engineer engineer = new Engineer();//

        engineer.getSalary();

        Employee e = new Employee() {
            @Override
            public void getName(){
                System.out.println("In e object instance");
            }
            public void getSalary(){
                System.out.println("In e object instance, returning salary");
            }
        };
        // Instead we could also use annonymous inner class to implement the employee
        // This can be used when we want to write concise code
        // And when it would just be used once.

        e.getSalary();
    }
}
