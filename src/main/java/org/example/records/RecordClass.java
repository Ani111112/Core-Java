package org.example.records;

public class RecordClass {
    public static void main(String[] args) {
        //Person Record Create a Person record with fields for name, age, and address.
        // Write a program to create instances of the record and demonstrate how to use the toString()
        // method to print their details.
        Person person = new Person("aniruddha", 26, "Harayna");
        System.out.println(person);

        //Immutable Point: Define a record Point to represent a 2D point with x and y coordinates.
        // Ensure that the record is immutable by making the fields final.
        // Implement a method that returns a new Point translated by a given offset.
        PointRecord pointRecord = new PointRecord(2, 3);
        System.out.println(pointRecord.getNewOffSet(4));
        System.out.println(pointRecord.getNewOffSet(5));
    }
}
