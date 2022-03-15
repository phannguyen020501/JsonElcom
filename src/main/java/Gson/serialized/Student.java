package Gson.serialized;

import com.google.gson.annotations.SerializedName;

public class Student {
    @SerializedName("id")
    private int studentId;

    @SerializedName("name")
    private String studentName;

    @SerializedName("class")
    private String classId;

    public Student(){
        super();
    }

    public Student(int studentId, String studentName, String classId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", classId='" + classId + '\'' +
                '}';
    }
}
