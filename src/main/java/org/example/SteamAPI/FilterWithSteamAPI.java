package org.example.SteamAPI;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterWithSteamAPI {
    public static void main(String[] args) {
//        List<String> names = List.of("Aniruddha", "Pritam", "Dpiankar", "Ajay", "Shivam");
//        Scanner sc = new Scanner(System.in);
//        String start = sc.nextLine();
//        String end = sc.nextLine();
//        List<String> newNames = names.stream().filter(i -> i.toLowerCase().startsWith(start.toLowerCase()) &&
//                i.toLowerCase().endsWith(end.toLowerCase())).collect(Collectors.toList());
//        System.out.println(newNames);




        //Filter Integer
        List<Integer> numbers = List.of(10, 13, 2, 6, 8, 9, 15);
        List<Integer> evenNumbers = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
