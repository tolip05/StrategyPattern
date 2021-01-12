package com.company.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader implements Reader {
    private BufferedReader bufferedReader;

    public ConsoleReader() {
        this.bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String read() throws IOException {
        return bufferedReader.readLine();
    }
}
