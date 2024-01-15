package org.example.reflextion;

import lombok.Setter;

import java.security.PrivateKey;

@Setter
public class Person {
    private String name;
    private int age;
    public Person() {

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private void talk() {
        System.out.println("hi i am aniruddha");
    }
}
