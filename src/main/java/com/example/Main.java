package com.example;

import java.util.*;
import java.util.stream.Stream;

public class Main {

  public static int getNthMaxElement(int [] array, int nth){
    TreeSet<Integer> sortedSet = new TreeSet<Integer>();
    Arrays.stream(array).forEach(sortedSet::add);
    if(array.length < nth) return Integer.MIN_VALUE;
    for(int i = 1; i < nth; i++)
      sortedSet.remove(sortedSet.last());
    return sortedSet.last();
  }


  public static void main(String[] args) {
    int [] a= {6,8,2,4,3,1,5,7,8} ;
    System.out.printf("nth"+ Main.getNthMaxElement(a,1));


    List<String> shoppingList = new ArrayList<>();
    shoppingList.add("coffee");
    shoppingList.add("bread");
    shoppingList.add("pineapple");
    shoppingList.add("milk");
    shoppingList.add("pasta");
    //test
    Stream<String> shoppingListStream = shoppingList.stream();
    shoppingListStream
            .sorted()
            .peek(System.out::println)
            .map(String::toUpperCase)

            .filter(item -> item.startsWith("P"))
            .forEach(item -> System.out.println(item));

  }
}
