package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        String input = Files.readString(Path.of("input.txt")).trim();
        int wynik = znajdzMarker(input);
        System.out.println(wynik);
    }

    public static int znajdzMarker(String data) {
        for (int i = 3; i < data.length(); i++) {
            String czesc = data.substring(i - 3, i + 1);
            if (wszystkieRozne(czesc)) {
                return i + 1;
            }
        }
        throw new IllegalArgumentException();
    }

    private static boolean wszystkieRozne(String s) {
        return true;
    }
}