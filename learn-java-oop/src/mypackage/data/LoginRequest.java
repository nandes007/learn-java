package mypackage.data;

public record LoginRequest(String username, String password) {
    public LoginRequest {
        System.out.println("Main contractor called");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }
}
