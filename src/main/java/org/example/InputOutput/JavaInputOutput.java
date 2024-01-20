package org.example.InputOutput;

import java.io.*;
import java.util.HashMap;

public class JavaInputOutput {
    public static void main(String[] args) {
        try {
            //Write a Java program to read the contents of a text file and write them into another file.
            BufferedReader inputStream = new BufferedReader(new FileReader("D:\\Personal Work\\CoreJava\\src\\main\\java\\org\\example\\InputOutput\\aniruddha.txt"));
            BufferedWriter outputStream = new BufferedWriter(new FileWriter("D:\\Personal Work\\CoreJava\\src\\main\\java\\org\\example\\InputOutput\\newFile.txt"));
            String value = null;
            while ((value = inputStream.readLine()) != null) {
                outputStream.write(value);
                System.out.println("Value is : "+value);
            }

            //Create a program that reads a text file and counts the number of occurrences of each character. Display the result in the console.
            BufferedReader reader = new BufferedReader(new FileReader("D:\\Personal Work\\CoreJava\\src\\main\\java\\org\\example\\InputOutput\\aniruddha.txt"));
            String val = reader.readLine();
            HashMap<Character, Integer> map = new HashMap<>();
            for(char ch : val.toCharArray()) {
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            System.out.println(map.toString());
            inputStream.close();
            outputStream.close();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
