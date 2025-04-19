package com.learning.streamslearning;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClass {

    // given a string , count the frequency of each character using streams


 public static void main(String[] args){

     Stack<Integer> st = new Stack<>();
     st.push(5);

     System.out.println("stack"+st.pop());
        String s = "Rishabh";
        Map<String, Long>  res =   Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//     System.out.println(s.split(""));

//        Map<Character, Long> map = s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(x->x,Collectors.counting()));
//        map.forEach((k,v) -> System.out.println(k + "  "+ v));
//                Collectors.groupingBy()

//        System.out.println(s.chars());

// Problem 1: Write a Program to find the Maximum element in an array?
                List<Integer> list = Arrays.asList(1,2,3,7,4,9999);
     list.stream().max((e,v)->e-v).ifPresent(System.out::println);
     System.out.println("Max using reduce   " + list.stream().reduce(0, (a,b)->a<b?b:a));



     //Problem 3: Given two arrays of Person objects, merge them, sort them by age in ascending order, and then by name alphabetically for people with the same age.

     Person[] pList1 = {new Person("Alice", 25), new Person("Bob", 30),
             new Person("Charlie", 25)};
     Arrays.sort(pList1, (e,v)-> e.age-v.age);
     Person[] pList2 = {new Person("David", 20), new Person("Eve", 25),
             new Person("Alicez", 25)};
     Stream<Person>  pStream =  Stream.concat(Arrays.stream(pList1),Arrays.stream(pList2));
     pStream.sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName)).collect(Collectors.toList()).forEach(System.out::println);
     // multi level sorting


//     Problem 4: Write a program to find the length of the longest name in a list of strings.
     List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");

    Integer max  = names.stream().map(String::length).max((a,b) -> a-b).get(); //.ifPresent(System.out::println);
     String maxString = names.stream().filter(a-> a.length() == max).collect(Collectors.toList()).get(0);
     System.out.println("maxString: " + maxString);

     System.out.println("longest name using reduce "+names.stream().reduce("", (a,b)-> a.length() > b.length()?a:b));

     //Problem 5: Check if a list of integers contains any prime numbers.
     List<Integer> nums = Arrays.asList(4, 6, 8, 11, 12, 13, 14, 15);
     System.out.println("prime: " + !nums.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()).isEmpty());

//     System.out.println(nums.stream().reduce(false, (a)->(a%2==0) ? true : false)); // The tiype is changing and we cannot use the reduce



     //Problem 6: Count the total number of distinct words (case-insensitive) across multiple sentences.
     List<String> sentences = Arrays.asList(
             "Java Stream API provides a fluent interface",
             "It supports functional-style operations on streams",
             "In this exercise, you need to count words"
     );
     System.out.println(sentences.stream().flatMap(e->Arrays.stream(e.toLowerCase().split(" "))).distinct().count());

//Problem 7: Find and concatenate the first two words that have even lengths.
     List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
     System.out.println(words.stream().filter(e -> e.length()%2==0).limit(2).reduce("", (a,b) -> a+b));


     // Problem 8: Given a list of transactions, find the sum of transaction amounts for each day and sort by date.



     List<Transaction> transactions = Arrays.asList(
             new Transaction("2022-01-01", 100),
             new Transaction("2022-01-01", 200),
             new Transaction("2022-01-02", 300)
     );


     //2) remove spaces from string
     String input = "Java Stream API provides a fluent interface";

//     Arrays.stream(input.split(" ")).


     System.out.println("transactions:  "+transactions.stream().collect(Collectors.groupingBy(e->e.getDate(), Collectors.summingLong(e->e.getAmount()))));

 }

    static class Transaction {
        String date;
        long amount;
        public Transaction(String date, long amount){
            this.date=date;
            this.amount=amount;
        }
        public long getAmount(){
            return this.amount;
        }

        public String getDate(){
            return this.date;
        }
    }


 private static class Person{
     public String name;
     public int age;

     Person(String name, int age){
         this.name = name;
         this.age=age;
     }
     public String getName(){
         return this.name;
     }
    public int getAge(){
        return this.age;
    }

    @Override
    public String toString(){
         return "Person - name "+ name + " age: " + age;
    }
}




}





/*
*         Arrays.sort(intervals, (a, b) -> a[0] - b[0]);




//        Arrays.stream(intArray[0]).forEach(a -> System.out.println(a));

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int i=0;
        while(i < intervals.length){

            // Using ArrayList to leverage dynamic sizing
            List<ArrayList<Integer>> tempList = new ArrayList<>(Arrays.asList(intervals[i]));
            int j=1;
                while(i+j < intervals.length && tempList.get(1) >= intervals[i+j][0]){
                    tempList.set(1, intArray[i+j][1]);
                    j++;
                }
                list.add(tempList);
                i = i+j;
        }
*
* */