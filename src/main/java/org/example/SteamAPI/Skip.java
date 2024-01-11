package org.example.SteamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Skip {
    public static void main(String[] args) {
        //skip those element who's starting character starts form a
        List<String> strings = List.of("hi", "hello", "ani", "aniruddha", "by");
        System.out.println(strings.stream().skip(1).collect(Collectors.toList()));
    }
}
