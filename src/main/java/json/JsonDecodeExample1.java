package json;

import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonDecodeExample1 {
    //giải mã chuỗi json trong java
    public static void main(String[] args) {
        String jsonStr = "{\"name\":\"Vinh\",\"salary\":1200.0,\"age\":27}";
        Object obj = JSONValue.parse(jsonStr);
        JSONObject jsonObject = (JSONObject) obj;

        String name = (String)jsonObject.get("name");
        double salary = (double)jsonObject.get("salary");
        long age = (long)jsonObject.get("age");
        System.out.println("name: " + name);
        System.out.println("salary: "+ salary);
        System.out.println("age: " + age);



    }
}
