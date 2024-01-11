package org.example.SteamAPI;

import java.util.Arrays;
import java.util.List;

public class FindAny {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 7, 3, 4, 5);
        int count = 0;
        while (count++ < 100)
        System.out.println(numbers.stream().findAny().orElse(0));
    }
}
