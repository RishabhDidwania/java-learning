package com.learning.lambdaNotes.comparator;


// Comparator has only is a functional interface

import java.util.*;
import java.util.stream.Stream;


public class MyClass {

    public static void main(String[] args) {

        Integer[][] intArray = {{1,3},{2,6},{8,10},{15,18}} ;
//        Integer[] temp =  {1,2,3,4};

        // Convert 2d array to list
//        ArrayList<ArrayList<Integer>> arList = new ArrayList<>();
//        for (Integer[] subarray: intArray)  arList.add(new ArrayList(Arrays.asList(subarray)));

        // we can use lambda expression to implement the interface Comparator

        Arrays.sort(intArray, (a, b) -> a[0] - b[0]);

//        Arrays.stream(intArray[0]).forEach(a -> System.out.println(a));
//        Solution to https://leetcode.com/problems/merge-intervals/

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int i=0;
        while(i < intArray.length){
            ArrayList<Integer> tempList = new ArrayList<>(Arrays.asList(intArray[i]));
            int j=1;
                while(i+j < intArray.length && tempList.get(1) >= intArray[i+j][0]){
                    tempList.set(1, intArray[i+j][1]);
                    j++;
                }
                list.add(tempList);
                i = i+j;
        }
        System.out.println(list);
                Queue

//        list.stream().map(a -> a.toArray(new Integer[0])).toArray(Integer::new);

    }

}
