package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {
    //chuyển json array sang java list
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        Student student1 = getStudent(1);
        Student student2 = getStudent(2);

        Student[] students = {student1, student2};

        //convert array object to json string
        String jsonInString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(students);
        System.out.println("JSON: " + jsonInString);

        //convert a JSON array format to a java list object
        List<Student> list = objectMapper.readValue(jsonInString, new TypeReference<List<Student>>() {
        });

        for(Student student: list){
            System.out.println(student);
        }
    }

    private static Student getStudent(int id){
        Subject math = new Subject("math", 10.0f);
        Subject physical = new Subject("physical", 8.5f);
        List<Subject> subjects = new ArrayList<>();
        subjects.add(math);
        subjects.add(physical);

        return new Student("Phan nguyen " + id, 21, subjects);
    }
}
