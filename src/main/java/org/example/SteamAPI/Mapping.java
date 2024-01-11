package org.example.SteamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping {
    public static void main(String[] args) {
        /*
            Using Map Stream Convert Every String into Uppercase
         */
        List<String> stringList = List.of("Aniruddha", "Hello World", "India");
        List<String> newStringList = stringList.stream().map(str -> str.toUpperCase()).collect(Collectors.toList()); // Converting into upperCase
        System.out.println(newStringList);


        /*
            Print the Square root of every element using Map Stream
         */
        List<Integer> numbers = List.of(12, 10, 5, 7, 3, 16);
        List<Integer> newNumbers = numbers.stream().map(ele -> (int)Math.sqrt(ele)).collect(Collectors.toList()); // Getting the Square root
        System.out.println(newNumbers);

        //print longest string
        List<String> strings = List.of("hello", "ani", "aniruddha", "Software", "hello world");
        System.out.println(strings.stream()
                .map(s -> s.length())
                .max(Integer::compareTo).orElse(0));
    }
}
