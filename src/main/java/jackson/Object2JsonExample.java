package jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Object2JsonExample {
    public static void main(String[] args) throws IOException {
        Student student = getStudent();

        ObjectMapper mapper = new ObjectMapper();
        //convert object to json string and save into a file direct
        mapper.writeValue(new File("D:\\workspace1\\JsonElcom\\src\\main\\java\\jackson\\result.json"), student);

        //convert object to json string
        String jsonInString = mapper.writeValueAsString(student);
        System.out.println("JSON: " + jsonInString);

        //convert object  to json string and pretty print
        jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
        System.out.println("JSON pretty print: " + jsonInString);
    }

    private static Student getStudent(){
        Subject math = new Subject("Math", 10.0f);
        Subject physical = new Subject("Physical", 8.5f);
        List<Subject> arr = new ArrayList<>();
        arr.add(math);
        arr.add(physical);

        return new Student("Phan Nguyen", 21, arr);
    }
}
