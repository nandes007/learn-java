package mypackage.util;

import mypackage.annotation.NotBlank;
import mypackage.data.LoginRequest;
import mypackage.error.BlankException;
import mypackage.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username cannot be null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is required");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password cannot be null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is required");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username cannot be null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is required");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password cannot be null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password is required");
        }
    }

    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null) {
                // validated
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank ");
                    }
                } catch (IllegalAccessException exception) {
                    System.out.println("Cannot access field " + field.getName());
                }
            }
        }
    }
}
