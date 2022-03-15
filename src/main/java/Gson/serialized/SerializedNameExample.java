package Gson.serialized;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SerializedNameExample {
    public static void main(String[] args) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        Student student = new Student(1, "Phan Nguyen", "java dev");

        String json = gson.toJson(student);
        System.out.println("Json: " + json);

        Student student2 = gson.fromJson(json, Student.class);
        System.out.println("java object: " + student2);
    }
}
