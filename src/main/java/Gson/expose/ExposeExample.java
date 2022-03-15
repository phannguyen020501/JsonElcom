package Gson.expose;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ExposeExample {
    public static void main(String[] args) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithoutExposeAnnotation();
        Gson gson = gsonBuilder.create();

        Account account = new Account();
        account.setAccoutNumber("A123 123");
        account.setIban("IB 11 22 33 44");
        account.setOwner("Phan Nguyen");
        account.setPin("123456");
        account.setAddress("Viet nam");

        String json = gson.toJson(account);
        System.out.println("Json: " + json);

        String json2 = "{\"accountNumber\": \"A123 123\", \"iban\": \"IBAN 123\"," +
                " \"owner\":\"phan nguyen\", \"pin\":\"123\", \"address\":\"viet nam\"}";

        Account account2 = gson.fromJson(json2, Account.class);
        System.out.println("java object: ");
        System.out.println("+ account number: " + account2.getAccoutNumber());
        System.out.println("+ iban: " + account2.getIban());
        System.out.println("+ owner: " + account2.getOwner());
        System.out.println("+ pin: " + account2.getPin());
        System.out.println("+ address: " + account2.getAddress());
    }
}
