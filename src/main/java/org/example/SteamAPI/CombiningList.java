package org.example.SteamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombiningList {
    public static void main(String[] args) {
        //Concatenate two lists of strings.
        List<String> list1 = List.of("Hi", "My", "Name", "is", "Aniruddha");
        List<String> list2 = List.of("How","are", "You");
        List<String> newList = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());// First we are convert two list into Stream in concat them
        System.out.println(newList);

        //Merge two lists of integers without duplicates.
        List<Integer> integerList1 = List.of(1, 4, 5, 3, 5, 1);
        List<Integer> integerList2 = List.of(4, 6, 5, 3, 9, 6);
        List<Integer> integerList = Stream.concat(integerList1.stream(), integerList2.stream()).distinct()
                .collect(Collectors.toList());
        System.out.println(integerList);
    }
}
