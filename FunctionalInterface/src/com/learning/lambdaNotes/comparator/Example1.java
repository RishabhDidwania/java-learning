package com.learning.lambdaNotes.comparator;

import java.util.*;

public class Example1 {


    public static void main(String[] args){
        Integer[] nums = {1,8,2,3,4,5,6};
        List<Integer> arrList = Arrays.asList(nums);
//        Comparable

//        Comparator
        arrList.sort((a,b)-> a-b); // here we are overriding the compare method in comparator interface which is a functional interface.
        System.out.println(arrList);



    }
}
