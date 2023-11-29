package org.example.SteamAPI;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterWithSteamAPI {
    public static void main(String[] args) {
        /*Filter a List of String where it starts with a specific character
        ends with a specific character*/
        List<String> names = List.of("Aniruddha", "Pritam", "Dpiankar", "Ajay", "Shivam");
        Scanner sc = new Scanner(System.in);
        String start = sc.nextLine(); // Taking Input for Start Character
        String end = sc.nextLine(); // Taking input for End Character
        List<String> newNames = names.stream().filter(i -> i.toLowerCase().startsWith(start.toLowerCase()) &&
                i.toLowerCase().endsWith(end.toLowerCase())).collect(Collectors.toList()); // Getting the according answer
        System.out.println(newNames);




        //Filter Integer List with Even Numbers
        List<Integer> numbers = List.of(10, 13, 2, 6, 8, 9, 15);
        List<Integer> evenNumbers = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()); // getting only Even Numbers
        System.out.println(evenNumbers);
    }
}
