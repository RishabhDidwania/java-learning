package com.lambdaNotes.comparator;


// Comparator has only is a functional interface

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class MyClass {

    public static void main(String[] args) {
        int[][] intervals = {{1,2}, {6,9},{2,3}, {3,4}};
        Arrays.stream intervalsstream().map(a -> Arrays.toList(a)).

        Integer[][] intArray = {{1,3},{2,6},{8,10},{15,18}} ;
        Integer[] temp =  {1,2,3,4};

        // we can use lambda expression to implement the interface Comparator

        Arrays.sort(intArray, (a, b) -> a[0] - b[0]);

//        Arrays.stream(intArray[0]).forEach(a -> System.out.println(a));

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

//        list.stream().map(a -> a.toArray(new Integer[0])).toArray(Integer::new);
    }

}
