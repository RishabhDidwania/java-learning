package com.learning.lambdaNotes.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class MyPredicateClass {
public static void main(String[] args) {
    Predicate<Integer> predicate = x -> x <1; // storing condition in a variable, it is a boolean valued functions

    System.out.println(predicate.test(30000));


    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
    list.stream().filter(predicate).forEach(System.out::println);


    // 2D initialisation can be done like
    List<List<Integer>> list2d = Arrays.asList(Arrays.asList(1,2,3,4,5,6), Arrays.asList(6,2,2));
    System.out.println(list2d);

     Predicate<Object> p = Predicate.isEqual("Rishabh");
    System.out.println(p.test("Rishabh"));

    //UnaryOperator

}

}
