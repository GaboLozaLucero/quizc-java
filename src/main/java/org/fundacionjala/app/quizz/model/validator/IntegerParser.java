package org.fundacionjala.app.quizz.model.validator;

import java.util.List;

public final class IntegerParser implements Validator{

    public static final String ERROR_MESSAGE_INVALID_NUMBER = "The value must be an integer";

    IntegerParser() {}

    @Override
    public void validate(String value, String conditionValue, List<String> errors) {
        parse(value);
    }

    public static int parse(String value) throws NumberFormatException {
        return Integer.parseInt(value);
    }
}
