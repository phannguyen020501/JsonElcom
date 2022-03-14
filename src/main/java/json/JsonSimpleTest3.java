package json;

import org.json.JSONArray;
import org.json.JSONException;

public class JsonSimpleTest3 {
    //mã hóa json array trong java
    public static void main(String[] args) throws JSONException {
        JSONArray arr = new JSONArray();
        arr.put("vinh");
        arr.put(27);
        arr.put(1200.0);
        System.out.println(arr);
    }
}
