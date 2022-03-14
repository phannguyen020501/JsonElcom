package Gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.swing.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> inputMap  = new HashMap<>();
        inputMap.put("name", "phannguyen");
        inputMap.put("site", "phannguyen.com");
        System.out.println("Input map: "+ inputMap);

        Gson gson = new Gson();

        //serialization
        String json = gson.toJson(inputMap);
        System.out.println("json: " + json);

        //deserialization
        Type mapType = new TypeToken<Map<String, String>>(){}.getType();
        Map<String, String> outputMap = gson.fromJson(json, mapType);
        System.out.println("output map: " + outputMap);
    }
}
