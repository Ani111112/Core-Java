package org.example.reflextion;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavaReflextion {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //Create a program to get the class name of an object using reflection.
        Person person = new Person("aniruddha", 26);
        System.out.println(person.getClass());

        //Retrieve and print all the methods of a class using reflection.
        Method[] methods = person.getClass().getDeclaredMethods();
        for (Method method : methods) {
            System.out.print(method.getName() + " ");
        }
        System.out.println();

        //Get and display all the fields of a class using reflection.
        Field[] fields = person.getClass().getDeclaredFields();
        System.out.println(fields.length);
        for (Field field : fields) {
            System.out.print(field.getName() + " ");
        }
        System.out.println();

        //Print the constructors of a class using reflection.
        Class<?> dynamicClass = Class.forName("org.example.reflextion.Person");
        Object object = dynamicClass.getDeclaredConstructors();
        System.out.println(object);

        //Retrieve and invoke a method dynamically using reflection.
        for (Method method : methods) {
            if (method.getName().equals("talk")) {
                method.setAccessible(true);
                method.invoke(person);
            }

        }
    }
}
