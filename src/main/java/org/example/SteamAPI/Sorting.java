package org.example.SteamAPI;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        //Sort a list of strings in alphabetical order.
        List<String> alphabets = List.of("Aniruddha", "Saikat", "Dipankar", "Ajay", "Sivam", "Pritam");
        List<String> newAlphabets = alphabets.stream().sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList()); // sort the list using
        System.out.println(newAlphabets);


        //Sort a list of custom objects based on a specific attribute.
        List<Pair> objectList = List.of(new Pair(10, "Ajay"), new Pair(1, "Aniruddha"),
                new Pair(3, "Sivam"), new Pair(2, "Dipankar"));
        List<Pair> newObjectList = objectList.stream().sorted((s1, s2) -> s1.rollNo - s2.rollNo)
                .collect(Collectors.toList()); // sort the list based on rollNo
        newObjectList.stream().forEach(pair -> System.out.println(pair.rollNo + " " + pair.name));
    }
    static class Pair{
        int rollNo;
        String name;
        Pair(int r, String s) {
            this.rollNo = r;
            this.name = s;
        }
    }
}
