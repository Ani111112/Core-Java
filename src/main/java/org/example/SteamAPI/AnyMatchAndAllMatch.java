package org.example.SteamAPI;

import java.util.List;

public class AnyMatchAndAllMatch {
    public static void main(String[] args) {
        //return those string who's equal to 'Hello World'
        List<String> strings = List.of("hi", "hello", "ani", "aniruddha", "by", "Hello World", "hello world");
        System.out.println(strings.stream().anyMatch(str -> str.equals("Hello World")));
        System.out.println(strings.stream().allMatch(str -> str.matches("an")));
    }
}
