package org.example.SteamAPI;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        //Given a list of integers, use the forEach method to iterate through
        //each element and print its square. Implement this using a lambda expression.
        List<Integer> integerList = List.of(2, 6, 71, 8, 23, 6);
        integerList.stream().forEach(ele -> System.out.print(ele * ele + " "));
    }
}
