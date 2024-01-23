package org.example.optional;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class JavaOptional {
    public static void main(String[] args) {
        //Write a method that accepts an Optional<String> parameter and returns the length of the string if present,
        // otherwise returns a default length of 0.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Optional<Integer> optionalLength = Optional.of(length(str));
        if (optionalLength.isEmpty()) System.out.println(0);
        else System.out.println(optionalLength.get());

        //Given a list of Optional<Integer>, write a method to calculate the sum of all present values.
        List<Optional<Integer>> optionalList = (List<Optional<Integer>>) List.of(Optional.of(1), Optional.of(2));
        int sum = 0;
        for (Optional<Integer> optional : optionalList) {
            if (!optional.isEmpty()) {
                sum += optional.get();
            }
        }
        System.out.println(sum);

        //Implement a method that takes an Optional<Integer> and squares the value if present, otherwise returns 0.
        System.out.println(optional(Optional.ofNullable(null)));
        System.out.println(optional(Optional.of(10)));
        System.out.println(optional(Optional.of(12)));
    }

    private static int optional(Optional<Object> optional) {
        if (optional.isEmpty()) return 0;
        else {
            int ele = (int) optional.get();
            return ele * ele;
        }
    }

    private static int length(String str) {
        if (str.length() == 0) return 0;
        else return str.length();
    }
}
