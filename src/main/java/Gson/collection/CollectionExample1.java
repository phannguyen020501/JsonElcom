package Gson.collection;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class CollectionExample1 {
    // sử dụng gson với collection
    public static void main(String[] args) {
        Gson gson = new Gson();
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);

        //serialization
        String json = gson.toJson(ints);
        System.out.println(json);

        //deserializtion
        Type collectionsType = new TypeToken<List<Integer>>(){}.getType();
        List<Integer> ints2 = gson.fromJson(json, collectionsType);
        System.out.println("Output list: " + ints2);
    }
}
