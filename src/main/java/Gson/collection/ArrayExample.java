package Gson.collection;

import com.google.gson.Gson;

public class ArrayExample {
    //sử dụng gson vs array
    public static void main(String[] args) {
        Gson gson = new Gson();
        int[] ints = {1, 2, 3, 4, 5};
        String[] strings = {"abc", "def", "ghi"};


        //serialization
        System.out.println(gson.toJson(ints));
        System.out.println(gson.toJson(strings));

        //deserialization
        int[] ints2 = gson.fromJson("[1, 2, 3, 4, 5]", int[].class);
        for(int x: ints2){
            System.out.println(x);
        }



    }
}
