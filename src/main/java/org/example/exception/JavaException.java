package org.example.exception;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;

public class JavaException {
    public static void main(String[] args) {
        System.out.println(printANumber());
        try {
            //Create a program that reads content from a file specified by the user.
            // Handle the "File Not Found" exception and display a user-friendly error message.
            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
        }catch (FileNotFoundException exception) {
            System.out.println("File is not Found");
        }
        try {
            //Write a program that prompts the user to enter an integer.
            // Handle the "ValueError" exception if the user enters something other than an integer.
            int num = Integer.parseInt("hello");
        } catch (NumberFormatException exception) {
            System.out.println("Value Error");
        }
        try {
            //Write a program that defines a list and prompts the user to enter an index.
            // Handle the "IndexError" exception if the user enters an index that is out of range.
            int a[] = new int[1];
            a[1] = 1;
        }catch (IndexOutOfBoundsException exception) {
            System.out.println("Array Index Out Of Bound");
        }

        try {
            //Create a dictionary and try to access a key that does not exist.
            //Handle the "KeyError" exception and provide a suitable error message.
            HashMap<String, String> map = new HashMap<>();
            for(int i = 1; i <= 5; i++) {
                String key = "key*" + i;
                String value = "value" + i;
                map.put(key, value);
            }
            String  key = map.get("key");
            if (StringUtils.isBlank(key)) throw new NullPointerException("Not Exits");
        }catch (NullPointerException exception) {
            System.out.println("No Key Exits");
        }

    }
    private static int printANumber() {
        try {
            return 3;
        }catch (Exception e) {
            return 4;
        }finally {
            return 5;
        }
    }
}
