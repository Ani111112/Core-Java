package org.example.javaenum;

public class EnumClass {
    public static void main(String[] args) {
        //Create an enum named DaysOfWeek with constants representing the days of the week.
        // Write a method that accepts a DaysOfWeek parameter and returns the next day.
        Enum day = JavaEnum.SUNDAY;
        if (day == JavaEnum.SUNDAY) {
            System.out.println(JavaEnum.MONDAY);
        }

        //Define an enum named Direction with constants representing directions (UP, DOWN, LEFT, RIGHT).
        //Write a method that accepts a Direction parameter and prints a message indicating the movement in that direction.
        EnumMethod(Direction.UP);
    }

    private static void EnumMethod(Direction direction) {
        System.out.println("The direction towards " + direction);
    }
}
