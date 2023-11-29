package org.example.SteamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Mapping {
    public static void main(String[] args) {
        List<String> stringList = List.of("Aniruddha", "Hello World", "India");
        List<String> newStringList = stringList.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(newStringList);


        List<Integer> numbers = List.of(12, 10, 5, 7, 3, 16);
        List<Integer> newNumbers = numbers.stream().map(ele -> (int)Math.sqrt(ele)).collect(Collectors.toList());
        System.out.println(newNumbers);
    }
}
