package com.interview;

import java.lang.reflect.Array;
import java.util.*;

public class StreamTest {

    /*
    * Given an Array, remove all odd numbers, multiply each number by a constant and then return sum.
    * All operations were to be done using Java streams.
    *
    * */

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list.stream().filter(l -> l%2!=0 ).map(e->e*3).reduce(0, Integer::sum));

    }
}
