package Gson.typeAdapter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Calendar;

public class GsonCustomTypeAdapterExample {
    public static void main(String[] args) {
        final GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Book.class, new BookTypeAdapter());
        gsonBuilder.setPrettyPrinting();

        final Gson gson = gsonBuilder.create();

        final Book book = new Book();
        book.setTitle("Head first Design Patterns");
        book.setIsbn10("0505");
        book.setIsbn13("0121");
        book.setPrice(51.1);

        Calendar c = Calendar.getInstance();
        c.set(2004, Calendar.OCTOBER, 1);
        book.setPublishedDate(c.getTime());

        String[] authors = new String[]{"Eric Freeman", "Bert bate"};
        book.setAuthors(authors);

        System.out.println("Convert book to json String");
        final String json = gson.toJson(book);
        System.out.println(json);

        System.out.println("convert json to book object:");
        final Book parsedBook = gson.fromJson(json, Book.class);
        System.out.println(parsedBook);
    }
}
