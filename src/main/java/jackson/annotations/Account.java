package jackson.annotations;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.*;

@JsonIgnoreProperties({"iban", "pin"})
public class Account {
    @JsonProperty("number")
    private String accountNumber;

    private String iban;

    private String pin;

    @JsonIgnore
    private String owner;

    @JsonProperty
    private String address;

    @JsonProperty
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date createdDate;

    private Date expiredDate;

    private String notAnnotation;

    private String notAnnotationWithSetter;

    @JsonProperty
    private List<String> services = new ArrayList<>();

    private Map<String, Object> history = new HashMap<>();

    @JsonAnyGetter
    public Map<String, Object> any(){
        return history;
    }

    @JsonAnySetter
    public void set(String name, Object value){
        history.put(name, value);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getNotAnnotation() {
        return notAnnotation;
    }

    public void setNotAnnotation(String notAnnotation) {
        this.notAnnotation = notAnnotation;
    }

    public String getNotAnnotationWithSetter() {
        return notAnnotationWithSetter;
    }

    public void setNotAnnotationWithSetter(String notAnnotationWithSetter) {
        this.notAnnotationWithSetter = notAnnotationWithSetter;
    }

    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public Map<String, Object> getHistory() {
        return history;
    }

    public void setHistory(Map<String, Object> history) {
        this.history = history;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", iban='" + iban + '\'' +
                ", pin='" + pin + '\'' +
                ", owner='" + owner + '\'' +
                ", address='" + address + '\'' +
                ", createdDate=" + createdDate +
                ", expiredDate=" + expiredDate +
                ", notAnnotation='" + notAnnotation + '\'' +
                ", notAnnotationWithSetter='" + notAnnotationWithSetter + '\'' +
                ", services=" + services +
                ", history=" + history +
                '}';
    }
}

