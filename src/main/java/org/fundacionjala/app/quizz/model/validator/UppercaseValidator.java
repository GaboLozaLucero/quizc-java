package org.fundacionjala.app.quizz.model.validator;

import java.lang.*;
import java.util.List;

public class UppercaseValidator implements Validator{

    private static final String ERROR_MESSAGE = "The value must be uppercase";

    @Override
    public void validate(String value, String conditionValue, List<String> errors) {
        boolean isUppercase;
        char charValue = value.charAt(0);
        isUppercase = Character.isUpperCase(charValue);
        if (isUppercase == false){
            errors.add(ERROR_MESSAGE);
        }
    }
}
