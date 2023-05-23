package mypackage.application;

import mypackage.data.CreateUserRequest;
import mypackage.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("root");
        request.setPassword("password");

        ValidationUtil.validationReflection(request);
    }
}
