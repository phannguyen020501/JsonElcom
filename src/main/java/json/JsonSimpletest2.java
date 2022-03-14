package json;

import org.json.JSONString;
import org.json.simple.JSONValue;

import java.util.HashMap;
import java.util.Map;

public class JsonSimpletest2 {
    public static void main(String[] args) {
        Map obj = new HashMap();
        obj.put("name", "vinh");
        obj.put("age", 27);
        obj.put("salary", 1200.0);
        String jsonText = JSONValue.toJSONString(obj);
        System.out.println(jsonText);
    }
}
