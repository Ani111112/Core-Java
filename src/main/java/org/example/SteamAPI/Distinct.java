package org.example.SteamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        //Given a list of strings, use the distinct operation to eliminate duplicate strings.
        List<String> stringList = List.of("hi", "hi", "hello", "by", "hello", "by", "how");
        System.out.println(stringList.stream().distinct().collect(Collectors.toList()));
    }
}
