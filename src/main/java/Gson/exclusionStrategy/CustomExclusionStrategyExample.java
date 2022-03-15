package Gson.exclusionStrategy;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CustomExclusionStrategyExample {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setExclusionStrategies(new CustomExclusionStrategy())
                .setPrettyPrinting().create();

        User user = new User();
        user.setUserName("phannguyen");
        user.setEmail("phannguyen@gmail.com");
        user.setPassword("02001");

        //serialize
        String json = gson.toJson(user);
        System.out.println("Json: "+ json);

        //deserialize
        String inputJson = "{\"userName\": \"Phan Nguyen\", " +
                "\"email\": \"phannguyen@gmail.com\",\"password\":\"02001\"}";
        User user2 = gson.fromJson(inputJson, User.class);
        System.out.println("User2 "+ user2);

    }

}
