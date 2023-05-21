package mypackage.util;

import mypackage.data.LoginRequest;
import mypackage.error.BlankException;
import mypackage.error.ValidationException;

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
}
