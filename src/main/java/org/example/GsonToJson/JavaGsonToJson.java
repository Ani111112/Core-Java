package org.example.GsonToJson;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class JavaGsonToJson {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            Staff staff = new Staff();
            staff.setName("Test_Name");
            staff.setAge(28);
            staff.setPosition(new String[]{"hello", "hi"});
            staff.setSkills(new ArrayList<>());
            gson.toJson(staff, new FileWriter("D:\\staff.json"));
            String jsonString = gson.toJson(staff);
            System.out.println(jsonString);
            // 1. JSON file to Java object
            Staff obj = gson.fromJson(new FileReader("D:\\staff.json"), Staff.class);
            System.out.println(obj);
        }catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
