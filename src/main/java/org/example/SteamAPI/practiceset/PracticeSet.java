package org.example.SteamAPI.practiceset;

import org.example.SteamAPI.FilterWithSteamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;

public class PracticeSet {
    public static void main(String[] args) {
        //Convert a List of Strings to uppercase using Streams.
        List<String> strings = List.of("hi", "hello", "by", "aniruddha", "aniruddha", "hi");
        strings.stream().forEach(str -> System.out.print(str.toUpperCase() + " "));
        System.out.println();

        //Filter a List of integers to get only the even numbers.
        List<Integer> integerList = List.of(2, 5, 7, 8, 4, 9, 7, 3, 10, 6, 54);
        System.out.print(integerList.stream().filter(ele -> ele % 2 == 0).collect(Collectors.toList()));
        System.out.println();

        //Find the sum of all elements in a List using Streams.
        System.out.println(integerList.stream().reduce(0, (sum, ele) -> sum + ele));

        //Given a List of strings, find the length of each string.
        System.out.println(strings.stream().map(str -> str.length()).collect(Collectors.toList()));

        //Remove duplicate elements from a List using Streams.
        System.out.println(strings.stream().distinct().collect(Collectors.toList()));

        //Concatenate two Lists into a single List using Streams.
        List<String> strings1 = List.of("hello", "world", "hello world");
        System.out.println(Stream.concat(strings.stream(), strings1.stream()).collect(Collectors.toList()));

        //Check if all elements in a List are greater than a certain value.
        System.out.println(integerList.stream().allMatch(ele -> ele > 1));

        //Find the average of a List of doubles using Streams.
        List<Double> doubleList = List.of(1.2, 22.8, 4.5, 3.5, 7.8);
        System.out.println(doubleList.stream().reduce(0.0, (sum,ele) -> sum + ele) / doubleList.size());

        //Count the occurrences of a specific element in a List.
        System.out.println(strings.stream().filter(str -> str.matches("aniruddha")).collect(Collectors.toList()).size());

        //Convert a List of integers to a List of strings.
        System.out.println(integerList.stream().map(ele -> ele.toString()).collect(Collectors.toList()));

        //Find the maximum value in a List of integers using Streams.
        System.out.println(integerList.stream().max(Integer :: compareTo).orElse(Integer.MAX_VALUE));

        //Group a List of objects by a specific property using Streams.
        List<Person> personList = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 25),
                new Person("David", 30),
                new Person("Eva", 25)
        );

        Map<Integer, List<Person>> personHashMap = personList.stream().collect(Collectors.groupingBy(Person::getAge));
        personHashMap.forEach((age, person) -> person.stream().forEach(p -> System.out.println(age + " " + p.name)));

        //Filter out null values from a List using Streams.
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("hi");
        System.out.println(list.stream().filter(str -> !StringUtils.isEmpty(str)).collect(Collectors.toList()));

    }
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
