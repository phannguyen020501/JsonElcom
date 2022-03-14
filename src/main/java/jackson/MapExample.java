package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class MapExample {
    // chuyển json object sang java map
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        Subject math = new Subject("math", 10.0f);

        //convert array object to JSON string
        String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(math);
        System.out.println("JSON: " + jsonInString);

        //convert JSON to Map

        Map<String, Object> map = mapper.readValue(jsonInString, new TypeReference<Map<String,Object>>() {
        });

        System.out.println("Map: " + map);
    }
}
