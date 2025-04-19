package com.learning.lambdaNotes.function;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class MyClass {
    public static void main(String[] args) {

        //Predicate was to test condition
        //Function would do work for us, it has apply() like predicate has test()

        Function<String, Integer> function = String::length;
        Function<String, String> function1 = String::toLowerCase;
        Function<String, String> function2 = s -> s.substring(0,3);

        System.out.println(function.apply("Rishabh Didwania"));
        System.out.println(function1.apply("Rishabh Didwania"));
        System.out.println(function2.apply("Rishabh Didwania"));

        Function<List<Students>, List<Students>> studentPriFilterAge = sl ->
           sl.stream().filter(s -> s.age > 20).collect(Collectors.toList());

        List<Students> studentList = new ArrayList<>();
        studentList.add(new Students("Rishabh Didwania", 25));
        studentList.add(new Students("Rahul Didwania", 26));
        studentList.add(new Students("Xyz Didwania", 27));

        studentPriFilterAge.apply(studentList).forEach(System.out::println);



        Function<String, String> functionFunction1 = function1.andThen(function2);
        System.out.println(functionFunction1.apply("Rishabh"));




    }
    private static class Students{
        String name;
        int age;

        Students(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String toString(){
            return "Students" + "{Name=" + name + ", age=" + age + "}";
        }
    }
}
