package org.example.SteamAPI;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterWithSteamAPI {
    public static void main(String[] args) {
//        Write code to create a stream of integers and use the filter operation to select
//        only the numbers greater than 10.
        List<Integer> list = List.of(5, 10, 4, 6, 7, 19, 13, 2, 16, 11, 72);
        List<Integer> res = list.stream().filter(num -> num > 10).collect(Collectors.toList());
        System.out.println(res);

        //Explain how the filter operation can be used with the Person objects to extract only those individuals who are older than 25 years.
        // Provide a code example to demonstrate the use of filter in this context.
        List<Person> personList = List.of(
                new Person("ani", 24),
                new Person("ari", 26),
                new Person("ata", 28)
                );

        System.out.println(personList.stream().filter(person -> person.age > 25).collect(Collectors.toList()));


        //Given a list of strings, create a stream and use the
        // filter operation to select only the strings that start with the letter "A" and have length greater than 5.

        List<String> stringList = List.of("hi", "hello", "aniruddha", "by", "buy", "And");
        System.out.println(stringList.stream().filter(str ->
                str.toLowerCase().charAt(0) == 'a' && str.length() > 5)
                .collect(Collectors.toList())
        );

        //Write code to filter out empty strings from a list using the filter operation.
        List<String> strings = List.of("", "", "hi", "hello");
        System.out.println(strings.stream().filter(str ->
                str.isEmpty())
                .collect(Collectors.toList()));
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

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
