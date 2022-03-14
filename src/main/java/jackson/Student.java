package jackson;

import java.util.List;
public class Student {
    private String name;
    private int age;
    private List<Subject> subjects;

    public Student(String name, int age, List<Subject> subject) {
        this.name = name;
        this.age = age;
        this.subjects = subject;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Subject> getSubject() {
        return subjects;
    }

    public void setSubject(List<Subject> subject) {
        this.subjects = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subject=" + subjects +
                '}';
    }
}
