package org.example.SteamAPI;

import java.util.List;

public class Min {
    public static void main(String[] args) {
        List<String> strings = List.of("hi", "hello", "ani", "aniruddha", "by");
        System.out.println(strings.stream().map(s -> s.length()).min(Integer::compareTo).orElse(0));
    }
}
