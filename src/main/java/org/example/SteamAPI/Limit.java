package org.example.SteamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Limit {
    public static void main(String[] args) {
        //print only 2 elements of n size list;
        List<String> strings = List.of("hi", "hello", "world", "how", "are", "you");
        System.out.println(strings.stream().limit(2).collect(Collectors.toList()));
    }
}
