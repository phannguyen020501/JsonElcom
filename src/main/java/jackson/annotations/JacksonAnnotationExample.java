package jackson.annotations;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class JacksonAnnotationExample {

    public static final String JSON_FILE = "jackson/annotations/result.json";

    public static void main(String[] args) throws IOException {
        Account account = getAccount();
        System.out.println("account: " + account);
        //convert object to Json String
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(JSON_FILE), account);

    }
    public static Account getAccount(){
        Account account = new Account();
        account.setAccountNumber("123123");
        account.setIban("IB 11 22 33");
        account.setOwner("pn");
        account.setPin("123456");
        account.setAddress("nghe an");

        account.setCreatedDate(Calendar.getInstance().getTime());
        account.setExpiredDate(Calendar.getInstance().getTime());

        String[] services = {"Internet Banking", "Mobile Banking"};
        account.setServices(Arrays.asList(services));

        Map<String, Object> history = new HashMap<>();
        history.put("20180101", "withdraw 100");
        history.put("20180101", "change password");
        account.setHistory(history);

        return account;

    }
}
