package mypackage.application;

import mypackage.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("root", null);
        System.out.println("Success");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Cannot connect to database");
        }
    }
}
