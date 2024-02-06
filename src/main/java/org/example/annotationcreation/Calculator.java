package org.example.annotationcreation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long sum = 0;

        while (sum < Long.MAX_VALUE) {
            try {
                System.out.print("Enter first number: ");
                int a = scanner.nextInt();
                System.out.print("Enter operator (+, -, *, /): ");
                String operator = scanner.next();

                Method method = Calculator.class.getDeclaredMethod(operator, int.class, int.class);
                ArithmeticCalulation arithmetic = method.getAnnotation(ArithmeticCalulation.class);

                if (arithmetic != null) {
                    method.setAccessible(true);
                    sum = (int) method.invoke(null, sum, a);
                    System.out.println("Result: " + sum);
                } else {
                    System.out.println("Invalid operator!");
                }

                System.out.print("Do you want to perform another operation? (yes/no): ");
                String exit = scanner.next();

                if (exit.equals("no")) {
                    break;
                }
            } catch (NoSuchMethodException e) {
                System.out.println("Method not found: " + e.getMessage());
            } catch (IllegalAccessException | InvocationTargetException e) {
                System.out.println("Error invoking method: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }

        scanner.close();
    }

    @ArithmeticCalulation("+")
    public static int sum(int a, int b) {
        return a + b;
    }

    @ArithmeticCalulation("-")
    public static int subtract(int a, int b) {
        return a - b;
    }

    @ArithmeticCalulation("*")
    public static int multiply(int a, int b) {
        return a * b;
    }

    @ArithmeticCalulation("/")
    public static int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero!");
            return 0;
        }
    }
}
