package Gson.version;

import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;

public class MemberInfo {
    private  int id;
    private String name;

    @Until(1.7)
    private String yahooAccount;
    //field yahooAccount: xóa bỏ từ phiên bản 1.7

    @Since(2.3)
    private String facebookAccount;
    //field facebookAccount: được thêm từ phieen bản 2.3

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYahooAccount() {
        return yahooAccount;
    }

    public void setYahooAccount(String yahooAccount) {
        this.yahooAccount = yahooAccount;
    }

    public String getFacebookAccount() {
        return facebookAccount;
    }

    public void setFacebookAccount(String facebookAccount) {
        this.facebookAccount = facebookAccount;
    }
}
