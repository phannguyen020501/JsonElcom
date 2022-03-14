package json;

import org.json.simple.JSONValue;

import java.util.ArrayList;
import java.util.List;

public class JsonSimpleTest4 {
    //mã hóa json array sử dụng list trong java
    public static void main(String[] args) {
        List arr = new ArrayList();
        arr.add("vinh");
        arr.add(27);
        arr.add(1200);
        String jsonText = JSONValue.toJSONString(arr);
        System.out.println(jsonText);
    }
}
