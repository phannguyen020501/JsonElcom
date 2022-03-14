package json;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonSimpleTest1 {
    public static void main(String[] args) throws JSONException {
        JSONObject obj = new JSONObject();
        obj.put("name", "vinh");
        obj.put("age",27);
        obj.put("salary", 1200.0);
        System.out.println(obj.toString());

    }
}
