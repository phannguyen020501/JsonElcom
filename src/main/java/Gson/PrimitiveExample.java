package Gson;

import com.google.gson.Gson;

public class PrimitiveExample {
    //sử dụng gson với kiểu dữ liệu nguyên thủy (primititives type)
    public static void main(String[] args) {
        Gson gson = new Gson();
        System.out.println(gson.toJson(1)); // ==> 1
        System.out.println(gson.toJson("abcd"));// ==> "abcd"
        System.out.println(gson.toJson(new Long(19)));

        int[] values = {1};
        gson.toJson(values); //==>  [1]

        int one = gson.fromJson("1", int.class);
        System.out.println(one);
        Integer oneInteger = gson.fromJson("1", Integer.class);
        System.out.println(oneInteger);
        Long oneLong = gson.fromJson("1", Long.class);
        System.out.println(oneLong);
        Boolean bool = gson.fromJson("false", Boolean.class);
        System.out.println(bool);
        String str = gson.fromJson("\"abc\"", String.class);
        System.out.println(str);
        String[] anotherStr = gson.fromJson("[\"abc\"]", String[].class);
        System.out.println(anotherStr);


    }
}
