package Gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class CollectionExample2 {
    //sử dụng gson vs collection và generic type
    public static void main(String[] args) {
        //Gson gson = new Gson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("phan nguyen", "viet nam"));
        persons.add(new Person("phan nhim", "nghe an"));

        //serialization
        String json = gson.toJson(persons);
        System.out.println(json);

        //deserialization
        Type collectionType = new TypeToken<List<Person>>(){}.getType();
        List<Person> person2 = gson.fromJson(json, collectionType);
        System.out.println(person2);
    }
}
