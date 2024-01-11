package org.example.SteamAPI;

import java.util.List;

public class Max {
    public static void main(String[] args) {
        List<String> strings = List.of("hi", "hello", "ani", "aniruddha", "by");
        System.out.println(strings.stream().map(str -> str.length()).max(Integer::compareTo).orElse(0));
    }
}
