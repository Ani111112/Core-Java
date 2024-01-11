package org.example.SteamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        //sort a list string by his length
        List<String> strings = List.of("hi", "i", "a", "hello", "by", "hello world", "aniruddha");
        System.out.println(strings.stream()
                .sorted((s1, s2) -> s1.length() != s2.length() ? s1.length() - s2.length() : s1.compareTo(s2))
                .collect(Collectors.toList()));
    }
}
