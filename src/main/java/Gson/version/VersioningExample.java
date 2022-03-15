package Gson.version;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class VersioningExample {
    public static void main(String[] args) {
        GsonBuilder builder = new GsonBuilder();
        builder.setVersion(1.4);

        Gson gson = builder.create();

        MemberInfo member = new MemberInfo();
        member.setId(1);
        member.setName("Phan Nguyen");
        member.setYahooAccount("pn@yahoo.com");//util version 1.7
        member.setFacebookAccount("pnfb");//since versoin 2.0

        String json = gson.toJson(member);

        System.out.println("Json: " + json);

        String json2 = "{\"id\":1,\"name\": \"Phan Nguyen\", " +
                "\"yahooAccount\": \"pn@yahoo.com\", \"facebookAccount\":\"pnfb\"}";
        MemberInfo otherMember = gson.fromJson(json2, MemberInfo.class);
        System.out.println("Id: " + otherMember.getId());
        System.out.println("Name: "+ otherMember.getName());
        System.out.println("yahooAccount " + otherMember.getYahooAccount());
        System.out.println("facebookAccount "+ otherMember.getFacebookAccount());
    }
}
