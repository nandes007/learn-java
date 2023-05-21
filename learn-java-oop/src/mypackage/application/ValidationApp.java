package mypackage.application;

import mypackage.data.LoginRequest;
import mypackage.error.ValidationException;
import mypackage.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("operate", "secret");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Invalid : " + e.getMessage());
        } finally {
            System.out.println("Will executed even error exists or not");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("success");
    }
}
