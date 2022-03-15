package Gson.typeAdapter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookTypeAdapter extends TypeAdapter<Book> {
    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    @Override
    public void write(JsonWriter out, Book book) throws IOException {
        out.beginObject();
        out.name("title").value(book.getTitle());
        out.name("isbn-10").value(book.getIsbn10());
        out.name("isbn-13").value(book.getIsbn13());
        out.name("price").value(book.getPrice());
        out.name("publishedDate").value(sdf.format(book.getPublishedDate()));
        out.name("authors");
        out.beginArray();
        for (final String author : book.getAuthors()) {
            out.value(author);
        }
        out.endArray();
        out.endObject();



    }

    @Override
    public Book read(JsonReader jsonReader) throws IOException {
        final Book book = new Book();

        jsonReader.beginObject();
        while(jsonReader.hasNext()){
            switch (jsonReader.nextName()){
                case "title":
                    book.setTitle(jsonReader.nextString());
                    break;
                case "isbn-10":
                    book.setIsbn10(jsonReader.nextString());
                    break;
                case "isbn-13":
                    book.setIsbn13(jsonReader.nextString());
                    break;
                case "price":
                    book.setPrice(jsonReader.nextDouble());
                    break;
                case "publishedDate":
                    Date publishedDate = null;
                    try{
                        publishedDate= sdf.parse(jsonReader.nextString());
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    book.setPublishedDate(publishedDate);
                    break;
                case "authors":
                    jsonReader.beginArray();
                    final List<String> authors = new ArrayList<>();
                    while(jsonReader.hasNext()){
                        authors.add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                    book.setAuthors( authors.toArray(new String[authors.size()]));
                    break;
            }

        }
        jsonReader.endObject();
        return book;
    }
}
