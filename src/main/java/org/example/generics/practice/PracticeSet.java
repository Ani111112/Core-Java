package org.example.generics.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PracticeSet {
    public static void main(String[] args) {
        //Create a generic class Box to store a single item of any type.
        int a = 10;
        double b = 1.0;
        String str = "hi";
        Generics generics = new Generics<>(a);
        generics.print();
        Generics generics1 = new Generics<>(b);
        generics1.print();
        Generics generics3 = new Generics<>(str);
        generics3.print();

        //Implement a generic method to find the maximum element in an array of any comparable objects.
        Integer[] arr = {1, 2, 4, 6, 7};
        maxEle(arr);
        Double[] arr1 = {1.2, 2.3, 5.1, 2.4};
        maxEle(arr1);
        String[] str1 = {"hi", "hello"};
        maxEle(str1);

        //Implement a generic class Stack to perform push and pop operations for any type.
        Stack<Integer> integerStack = new Stack<>();
        for (int i = 1; i <= 5; i++) integerStack.push(i);
        stackk(integerStack);
        Stack<String> stringStack = new Stack<>();
        for (int i = 1; i <= 5; i++) stringStack.push(i+"*");
        stackk(stringStack);

        //Create a generic method that swaps the positions of two elements in an array.
        swap(arr);
        swap(str1);

        //Implement a generic method to count the occurrences of a specific element in a list.
        maxCount(arr, 2);
        maxCount(str1, "hi");

        //Design a generic class Tuple to store a pair of values of different types.
        Tupple tupple = new Tupple<>("hello", 1);
        Tupple tupple1 = new Tupple<>(2, "hello");

        //Create a generic method to reverse the elements of an array.
        reverse(arr);
        reverse(str1);

        //Implement a generic class Queue with methods for enqueue and dequeue operations.
        queue(arr);
        queue(str1);

        //Write a generic method to concatenate two arrays of the same type.
        Integer[] arr2 = {4, 7, 3, 6, 7};
        concatenateTwoArrayOfSameType(arr, arr2);
        concatenateTwoArrayOfSameType(str1, new String[]{"hello world", "java"});

        //Implement a generic method to check if two arrays of any type are equal.
        equalOfTwoArrays(new Integer[]{4, 7, 3, 6, 7}, arr2);
        equalOfTwoArrays(arr, arr2);
        equalOfTwoArrays(new String[]{"hi"}, new String[]{"hi"});

    }

    private static <T>void equalOfTwoArrays(T[] arr, T[] arr2) {
        if (arr.getClass() == arr2.getClass() && arr.length == arr2.length && Arrays.equals(arr, arr2)) {
            System.out.println(true);
        }else System.out.println(false);
    }

    private static <T>void concatenateTwoArrayOfSameType(T[] arr, T[] arr2) {
        if (arr.getClass() == arr2.getClass()) {
            Stream<T> both = Stream.concat(Arrays.stream(arr), Arrays.stream(arr2));
            both.forEach(ele -> System.out.print(ele + " "));
            System.out.println();
        }
    }

    private static <T>void queue(T[] arr) {
        Queue<T> que = new ArrayDeque<>();
        Arrays.stream(arr).forEach(ele -> que.add(ele));
        while(que.size() > 0) {
            System.out.print(que.remove() + " ");
        }
        System.out.println();
    }
    private static <T>void reverse(T[] arr) {
        int i = 0, j = arr.length - 1;
        while(i < j) {
            T temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
        Arrays.stream(arr).forEach(ele -> System.out.print(ele + " "));
        System.out.println();
    }

    private static <T>void maxCount(T[] arr, T ele) {
        System.out.println(Arrays.stream(arr).toList().stream().filter(str -> str == ele).collect(Collectors.toList()).size());
    }

    private static <T> void swap(T[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            T ele1 = arr[i];
            T ele2 = arr[i + 1];
            arr[i] = ele2;
            arr[i + 1] = ele1;
        }
        Arrays.stream(arr).toList().stream().forEach(ele -> System.out.print(ele + " "));
        System.out.println();
    }

    private static void stackk(Stack<?> stack) {
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    private static <T> void maxEle(T[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }

    static class Generics <T> {
        T ele;
        Generics(T ele) {
            this.ele = ele;
        }
        public void  print() {
            System.out.println(this.ele);
        }
    }
    static class Tupple <T>{
        T ele;
        T num;
        Tupple(T ele, T num) {
            this.ele = ele;
            this.num = num;
        }
    }
}
