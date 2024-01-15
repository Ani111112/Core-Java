package org.example.reflextion;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavaReflextion {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
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

        //Create an instance of a class dynamically using reflection.
        Person person1 = Person.class.getDeclaredConstructor().newInstance();
        System.out.println(person1.getClass().getName());

        //Implement a program to set the value of a private field using reflection.
        for (Field field : fields) {
            if (field.getName().equals("name")) {
                System.out.println(person.getName());
                field.setAccessible(true);
                field.set(person, "arindam");
                System.out.println(person.getName());
            }
        }

        //Check if a class has a specific annotation using reflection.
//        Person annotations = Person.class.getAnnotation(Class<A> Person.class);
//        for (Annotation annotation : annotations) {
//            if (annotation.equals("Setter")) {
//                System.out.println(annotation);
//            }
//        }
    }
}
