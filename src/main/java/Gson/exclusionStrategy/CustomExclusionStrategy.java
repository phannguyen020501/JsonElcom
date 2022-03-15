package Gson.exclusionStrategy;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

public class CustomExclusionStrategy implements ExclusionStrategy {
    //loai bỏ thông tin password ra khỏi chuỗi json
    @Override
    public boolean shouldSkipField(FieldAttributes fieldAttributes) {
        //true ìf the field should be ignored; otherwise false
        return (fieldAttributes.getDeclaringClass() == User.class
                && fieldAttributes.getName().equals("password"));
    }

    @Override
    public boolean shouldSkipClass(Class<?> aClass) {
        //true if the class should be ignored; otherwise false
        return false;
    }
}
