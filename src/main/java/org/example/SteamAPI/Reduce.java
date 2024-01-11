package org.example.SteamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
    public static void main(String[] args) {
        //Consider a scenario where you have a list of integers. Use the reduce method to find the product of all elements in the list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().reduce(1, (acc, ele) -> acc * ele));
    }
}
