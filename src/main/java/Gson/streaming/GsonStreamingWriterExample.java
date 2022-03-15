package Gson.streaming;

import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.JsonWriter;

import java.io.*;

public class GsonStreamingWriterExample {
    //ghi chuoxi json sử dụng JsonWriter
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("src/main/java/Gson/result.json");
        JsonWriter writer = new JsonWriter(new OutputStreamWriter(out,"UTF-8"));

        writer.beginObject();
        writer.name("name").value("phan nguyen");
        writer.name("web").value("phannguyen.com");
        writer.name("year").value(2017);

        writer.name("posts");
        writer.beginArray();
        writer.value("java core");
        writer.value("design pattern");
        writer.value("srping");
        writer.endArray();

        writer.endObject();
        writer.close();

        System.out.println("done");

    }
}
