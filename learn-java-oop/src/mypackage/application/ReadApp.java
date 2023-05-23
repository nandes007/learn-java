package mypackage.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {
//        closingResourceManually();
        closingTryWithResource();
    }

    public static void closingTryWithResource() {
        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error when read file " + throwable.getMessage());
        }
    }

    public static void closingResourceManually() {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(
                    new FileReader("README.md")
            );

            while (true) {
                String text = reader.readLine();
                if (text == null) {
                    break;
                }
                System.out.println(text);
            }
        } catch (Throwable throwable) {
            System.out.println("Error when read file " + throwable.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException exception) {
                    System.out.println("Error close when resource " + exception.getMessage());
                }
            }
        }
    }
}
