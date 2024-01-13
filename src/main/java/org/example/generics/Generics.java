package org.example.generics;


import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(10, 2, 3, 5, 1);
        List<String> stringList = List.of("hi", "hello");
        List<Double> doubleList = List.of(1.2, 3.2, 1.5);
        print(integerList);
        print(stringList);
        print(doubleList);
    }
    public static <T> void print(List<?> list) {
        System.out.println(list);
    }
}
