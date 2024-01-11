package org.example.SteamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToArray {
    public static void main(String[] args) {
        // print those element who starts with a
        List<String> strings = List.of("hi", "hello", "ani", "aniruddha", "by");
        System.out.println(Arrays.stream(strings.stream().filter(str -> str.charAt(0) == 'a').toArray()).collect(Collectors.toList()));
    }
}
