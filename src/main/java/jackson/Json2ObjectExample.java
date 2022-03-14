package jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Json2ObjectExample {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        //convert JSON string from file to object
        Student student = mapper.readValue(new File("D:\\workspace1\\JsonElcom\\src\\main\\java\\jackson\\result.json"),
                                            Student.class);
        System.out.println(student);

        //convert JSON string to object
        String jsonInString = "{\"name\":\"GP Coder\",\"age\":28,\"subjects\":[{\"name\":\"Math\",\"point\":10.0},{\"name\":\"Physical\",\"point\":8.0}]}";
        student = mapper.readValue(jsonInString, Student.class);
        System.out.println(student);

        //pretty print
        jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
        System.out.println(jsonInString);
    }
}
