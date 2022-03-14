package Gson;

import com.google.gson.Gson;

//sử dụng gson vs object
class Person{
    private String name;
    private String location;

    public Person(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
public class ObjectExample {

    public static void main(String[] args) {
        Person person = new Person("Phan Nguyen", "Viet Nam");
        Gson gson = new Gson();

        //serialization
        String json = gson.toJson(person);
        System.out.println(json);

        //deserialization
        Person person2 = gson.fromJson(json, Person.class);
        System.out.println(person2);
    }
}
